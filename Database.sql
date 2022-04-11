--Tạo CSDL tên Fpoly_10710
CREATE DATABASE Polypro_PS10710
GO

--Sử dụng CSDL Fpoly_10710
USE Polypro_PS10710
GO

--Thiết kế bảng chi tiết
--Tạo bảng NhanVien lưu thông tin nhân viên phòng đào tạo(mã, mật khẩu, họ tên, vai trò(1 là trưởng phòng)).
--Lấy mã nhân viên làm khoá chính (MaNV is Primary key).
CREATE TABLE NhanVien
    (
      MaNV NVARCHAR(20) PRIMARY KEY
                        NOT NULL ,
      MatKhau NVARCHAR(50) NOT NULL ,
      HoTen NVARCHAR(50) NOT NULL ,
      GioiTinh BIT DEFAULT 1
                   NOT NULL ,
      Email NVARCHAR(50) NOT NULL ,
      SoDT NVARCHAR(20) NOT NULL ,
      DiaChi NVARCHAR(100) NOT NULL ,
      VaiTro BIT DEFAULT 0
    );
GO

--Tạo bảng ChuyenDe lưu thông tin các chuyên đề (Java, Web, IOT...).
--Lấy mã chuyên đề làm khoá chính (MaCD is Primary key).
CREATE TABLE ChuyenDe
    (
      MaCD NVARCHAR(50) PRIMARY KEY
                    NOT NULL ,
      TenCD NVARCHAR(50) NOT NULL
                         UNIQUE ,
      HocPhi FLOAT DEFAULT 0
                   NOT NULL ,
      ThoiLuong INT DEFAULT 30
                    NOT NULL ,
      Hinh NVARCHAR(255) NOT NULL ,
      MoTa NVARCHAR(255) NOT NULL ,
      CHECK ( HocPhi >= 0
              AND ThoiLuong > 0 )
    );
GO

--Tạo bảng NguoiHoc(học viên) lưu thông tin các người học.
--Lấy mã người học làm khoá chính và MaNV làm khoá phụ (MaNH is Primary key and MaNV is Foreign key).
CREATE TABLE NguoiHoc
    (
      MaNH NVARCHAR(50) PRIMARY KEY
                    NOT NULL ,
      HoTen NVARCHAR(50) NOT NULL ,	  
      GioiTinh BIT DEFAULT 1 ,
	  DiaChi NVARCHAR(50) NOT NULL,
      NgaySinh DATE NOT NULL ,
      DienThoai NVARCHAR(50) NOT NULL ,
      Email NVARCHAR(50) NOT NULL ,
      MaNV NVARCHAR(20) FOREIGN KEY ( MaNV ) REFERENCES dbo.NhanVien ( MaNV )
                        NOT NULL ,
      NgayDK DATE DEFAULT GETDATE() ,
      GhiChu NVARCHAR(255)
    );
GO

--Tạo bảng KhoaHoc(khoá học) lưu thông tin các khoá học.
--Lấy mã khoá học làm khoá chính và MaNV, MaCD làm khoá phụ (MaKH is Primary key and MaNV, MaCD is Foreign key).
CREATE TABLE KhoaHoc
    (
      MaKH INT PRIMARY KEY
               IDENTITY ,
      MaCD NVARCHAR(50)
        FOREIGN KEY ( MaCD ) REFERENCES dbo.ChuyenDe ( MaCD ) ON UPDATE CASCADE
        NOT NULL ,
      HocPhi FLOAT NOT NULL
                   DEFAULT 0 ,
      ThoiLuong INT NOT NULL
                    DEFAULT 0 ,
      NgayKG DATE NOT NULL ,
      GhiChu NVARCHAR(255) ,
      MaNV NVARCHAR(20)
        FOREIGN KEY ( MaNV ) REFERENCES dbo.NhanVien ( MaNV ) ON UPDATE CASCADE
        NOT NULL ,
      NgayTao DATE DEFAULT GETDATE() ,
      CHECK ( HocPhi >= 0
              AND ThoiLuong > 0 )
    );
GO

--Tạo bảng HocVien(học viên) lưu thông tin các học viên.
--Lấy mã học viên làm khoá chính và MaKH, MaNH làm khoá phụ (MaHV is Primary key and MaKH, MaNH is Foreign key).
CREATE TABLE HocVien
    (
      MaHV INT PRIMARY KEY
               IDENTITY ,
      MaKH INT
        FOREIGN KEY ( MaKH ) REFERENCES dbo.KhoaHoc ( MaKH ) ON DELETE CASCADE
        NOT NULL ,
      MaNH NVARCHAR(50)
        FOREIGN KEY ( MaNH ) REFERENCES dbo.NguoiHoc ( MaNH ) ON UPDATE CASCADE
        NOT NULL ,
      Diem FLOAT DEFAULT -1 ,
      UNIQUE ( MaKH, MaNH )
    );
GO

--Tạo SP cho từng bảng
--SP thống kê người học
CREATE PROC sp_ThongKeNguoiHoc
AS
    BEGIN
        SELECT  YEAR(NgayDK) Nam ,
                COUNT(*) SoLuong ,
                MIN(NgayDK) DauTien ,
                MAX(NgayDK) CuoiCung
        FROM    dbo.NguoiHoc
        GROUP BY YEAR(NgayDK)
    END
GO

--SP thống kê doanh thu theo chuyên đề
CREATE PROC sp_ThongKeDoanhThu ( @Year INT )
AS
    BEGIN
        SELECT  TenCD ,
                COUNT(DISTINCT KhoaHoc.MaKH) SoKH ,
                COUNT(MaHV) SoHV ,
                SUM(KhoaHoc.HocPhi) DoanhThu ,
                MIN(KhoaHoc.HocPhi) ThapNhat ,
                MAX(KhoaHoc.HocPhi) CaoNhat ,
                AVG(KhoaHoc.HocPhi) TrungBinh
        FROM    dbo.KhoaHoc
                JOIN dbo.HocVien ON HocVien.MaKH = KhoaHoc.MaKH
                JOIN dbo.ChuyenDe ON ChuyenDe.MaCD = KhoaHoc.MaCD
        WHERE   YEAR(NgayKG) = @Year
        GROUP BY TenCD
    END
GO

--SP thống kê điểm học viên theo chuyên đền
CREATE PROC sp_ThongKeDiem
AS
    BEGIN
        SELECT  TenCD ,
                COUNT(MaHV) SoHV ,
                MIN(Diem) ThapNhat ,
                MAX(Diem) CaoNhat ,
                AVG(Diem) TrungBinh
        FROM    dbo.KhoaHoc
                JOIN dbo.HocVien ON HocVien.MaKH = KhoaHoc.MaKH
                JOIN dbo.ChuyenDe ON ChuyenDe.MaCD = KhoaHoc.MaCD
        GROUP BY TenCD
    END
GO

--SP bảng điểm
CREATE PROC sp_BangDiem ( @MaKH INT )
AS
    BEGIN
        SELECT  NguoiHoc.MaNH ,
                HoTen ,
                Diem
        FROM    dbo.HocVien
                JOIN dbo.NguoiHoc ON NguoiHoc.MaNH = HocVien.MaNH
        WHERE   MaKH = @MaKH
        ORDER BY Diem DESC
    END
GO

INSERT  INTO dbo.NguoiHoc
        ( MaNH ,
          HoTen ,
          GioiTinh ,
          NgaySinh ,
          DienThoai ,
          Email ,
          GhiChu ,
          MaNV ,
          NgayDK
        )
VALUES  ( N'NH01' , -- MaNH - nchar(7)
          N'Phúc' , -- HoTen - nvarchar(50)
          1 , -- GioiTinh - bit
          '11/29/1999' , -- NgaySinh - date
          N'0938697503' , -- DienThoai - nvarchar(24)
          N'phuc@fpt.edu.vn' , -- Email - nvarchar(50)
          N'' , -- GhiChu - nvarchar(255)
          N'PS01' , -- MaNV - nvarchar(20)
          GETDATE()  -- NgayDK - date
        )

UPDATE  dbo.NguoiHoc
SET     Email = 'phucpb@fpt.edu.vn'
WHERE   MaNH = 'NH01'
EXEC dbo.sp_ThongKeNguoiHoc

SELECT  MatKhau
FROM    dbo.NhanVien
WHERE   MaNV = 'PS01'
        AND Email = 'phucpbps10710@fpt.edu.vn'

INSERT INTO dbo.KhoaHoc
        (
          MaCD ,
          HocPhi ,
          ThoiLuong ,
          NgayKG ,
          GhiChu ,
          MaNV ,
          NgayTao
        )
VALUES  ( 
          N'CD01' , -- MaCD - nvarchar(50)
          1200000.0 , -- HocPhi - float
          320 , -- ThoiLuong - int
          GETDATE() , -- NgayKG - date
          N'' , -- GhiChu - nvarchar(255)
          N'nv01' , -- MaNV - nvarchar(20)
          GETDATE()  -- NgayTao - date
        )

INSERT INTO dbo.KhoaHoc
        (
          MaCD ,
          HocPhi ,
          ThoiLuong ,
          NgayKG ,
          GhiChu ,
          MaNV ,
          NgayTao
        )
VALUES  ( 
          N'CD02' , -- MaCD - nvarchar(50)
          1200000.0 , -- HocPhi - float
          300 , -- ThoiLuong - int
          GETDATE() , -- NgayKG - date
          N'không ghi chú' , -- GhiChu - nvarchar(255)
          N'nv01' , -- MaNV - nvarchar(20)
          GETDATE()  -- NgayTao - date
        )

SELECT * FROM dbo.KhoaHoc
SELECT * FROM dbo.NguoiHoc

SELECT hv.*, nh.HoTen, nh.Email 
FROM HocVien hv JOIN NguoiHoc nh ON nh.MaNH=hv.MaNH

SELECT nh.HoTen, nh.Email , hv.Diem
FROM HocVien hv JOIN NguoiHoc nh ON nh.MaNH=hv.MaNH
WHERE hv.MaHV = '1'