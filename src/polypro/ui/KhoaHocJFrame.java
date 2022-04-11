/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.ui;

import java.awt.HeadlessException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import polypro.dao.ChuyenDeDAO;
import polypro.dao.KhoaHocDAO;
import polypro.dao.NhanVienDAO;
import polypro.helper.DateHelper;
import polypro.helper.DialogHelper;
import polypro.helper.ShareHelper;
import polypro.model.ChuyenDe;
import polypro.model.KhoaHoc;
import polypro.model.NhanVien;

/**
 *
 * @author PC
 */
public class KhoaHocJFrame extends javax.swing.JFrame {

    ChuyenDeDAO cddao = new ChuyenDeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    int index = 0;

    /**
     * Creates new form KhoaHocJFrame
     */
    public KhoaHocJFrame() {
        initComponents();
        init();
    }

    void back() {
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoT = new javax.swing.JLabel();
        TitleTop = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        pnlNguoiHoc = new javax.swing.JTabbedPane();
        pnlCapNhat = new javax.swing.JPanel();
        txtHocphi = new javax.swing.JTextField();
        txtNgaytao = new javax.swing.JTextField();
        txtThoiluong = new javax.swing.JTextField();
        txtNgayKG = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArena = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        cboChuyenDe = new javax.swing.JComboBox<>();
        btnHocvien = new javax.swing.JButton();
        pnlDanhSach = new javax.swing.JPanel();
        Spator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhoaHoc = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        lblArrow1 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        BGRT = new javax.swing.JLabel();
        BGRB = new javax.swing.JLabel();
        BGLT = new javax.swing.JLabel();
        BGLB = new javax.swing.JLabel();
        BGButton = new javax.swing.JLabel();
        BGLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/icons8_java_48px.png"))); // NOI18N
        getContentPane().add(LogoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 100));

        TitleTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/HỆ THỐNG QUẢN LÝ ĐÀO TẠO.png"))); // NOI18N
        getContentPane().add(TitleTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 10.png"))); // NOI18N
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, -1));

        B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 6.png"))); // NOI18N
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 3.png"))); // NOI18N
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        B4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 4.png"))); // NOI18N
        B4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        BtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/Left.png"))); // NOI18N
        BtnExit.setContentAreaFilled(false);
        BtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 535, -1, 50));

        pnlNguoiHoc.setBackground(new java.awt.Color(0, 255, 51));
        pnlNguoiHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlNguoiHoc.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        pnlCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        pnlCapNhat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHocphi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtHocphi.setBorder(null);
        pnlCapNhat.add(txtHocphi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 200, -1));

        txtNgaytao.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtNgaytao.setBorder(null);
        pnlCapNhat.add(txtNgaytao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 230, -1));

        txtThoiluong.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtThoiluong.setBorder(null);
        pnlCapNhat.add(txtThoiluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 200, -1));

        txtNgayKG.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtNgayKG.setBorder(null);
        pnlCapNhat.add(txtNgayKG, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 230, -1));

        txtMaNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(0, 0, 255));
        txtMaNV.setBorder(null);
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });
        pnlCapNhat.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 240, -1));

        txtArena.setColumns(20);
        txtArena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtArena.setRows(5);
        jScrollPane2.setViewportView(txtArena);

        pnlCapNhat.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 390, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã chuyên đề:");
        pnlCapNhat.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Học phí:");
        pnlCapNhat.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mã nhân viên:");
        pnlCapNhat.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Thời lượng (giờ):");
        pnlCapNhat.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ngày khai giảng:");
        pnlCapNhat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ngày tạo:");
        pnlCapNhat.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Mô tả:");
        pnlCapNhat.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        pnlCapNhat.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, -1));
        pnlCapNhat.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, -1));
        pnlCapNhat.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 230, -1));
        pnlCapNhat.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 230, 10));
        pnlCapNhat.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 240, 10));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 17.png"))); // NOI18N
        btnThem.setBorder(null);
        btnThem.setContentAreaFilled(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 18.png"))); // NOI18N
        btnSua.setBorder(null);
        btnSua.setContentAreaFilled(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 19.png"))); // NOI18N
        btnXoa.setBorder(null);
        btnXoa.setContentAreaFilled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 20.png"))); // NOI18N
        btnMoi.setBorder(null);
        btnMoi.setContentAreaFilled(false);
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 21.png"))); // NOI18N
        btnFirst.setBorder(null);
        btnFirst.setContentAreaFilled(false);
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 22.png"))); // NOI18N
        btnPrev.setBorder(null);
        btnPrev.setContentAreaFilled(false);
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 23.png"))); // NOI18N
        btnNext.setBorder(null);
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 24.png"))); // NOI18N
        btnLast.setBorder(null);
        btnLast.setContentAreaFilled(false);
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        cboChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyenDeActionPerformed(evt);
            }
        });
        pnlCapNhat.add(cboChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, -1));

        btnHocvien.setText("Học Viên");
        btnHocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocvienActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnHocvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        pnlNguoiHoc.addTab("Cập Nhật", pnlCapNhat);

        pnlDanhSach.setBackground(new java.awt.Color(255, 255, 255));
        pnlDanhSach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlDanhSach.add(Spator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 540, 10));

        tblKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Mã CD", "Thời lượng", "Học phí", "Ngày KG", "Tạo bởi", "Ngày tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoaHoc.setGridColor(new java.awt.Color(0, 0, 255));
        tblKhoaHoc.setSelectionBackground(new java.awt.Color(0, 51, 255));
        tblKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoaHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhoaHoc);

        pnlDanhSach.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, 591, 330));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextField1.setText("Nhập mã khoá học");
        jTextField1.setBorder(null);
        pnlDanhSach.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 400, 30));

        lblArrow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/icons8_right_40px.png"))); // NOI18N
        pnlDanhSach.add(lblArrow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/icons8_search_database_100px.png"))); // NOI18N
        jButton18.setContentAreaFilled(false);
        pnlDanhSach.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, -1, -1, 50));

        pnlNguoiHoc.addTab("Danh Sách", pnlDanhSach);

        getContentPane().add(pnlNguoiHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 620, 440));

        BGRT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGRT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 7.png"))); // NOI18N
        getContentPane().add(BGRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        BGRB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGRB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 8.png"))); // NOI18N
        getContentPane().add(BGRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, 30));

        BGLT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 1.png"))); // NOI18N
        BGLT.setToolTipText("");
        getContentPane().add(BGLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BGLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 11.png"))); // NOI18N
        getContentPane().add(BGLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 530, 320, 60));

        BGButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 9.png"))); // NOI18N
        getContentPane().add(BGButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 390));

        BGLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 5.png"))); // NOI18N
        getContentPane().add(BGLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 660, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        // TODO add your handling code here:
        new MainFrame().setEnabled(true);
    }//GEN-LAST:event_B1MouseClicked

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_BtnExitActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (checkHP() && checkTL() && checkDay()) {
            insert();
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.index = 0;
        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.index--;
        this.edit();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.index = tblKhoaHoc.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoaHocMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.index = tblKhoaHoc.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                pnlNguoiHoc.setSelectedIndex(0);
                this.edit();
            }
        }
    }//GEN-LAST:event_tblKhoaHocMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fillComboBox();
        load();
        clear();
        setStatus(true);
    }//GEN-LAST:event_formWindowOpened

    private void btnHocvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocvienActionPerformed
        // TODO add your handling code here:
        openHocVien();
    }//GEN-LAST:event_btnHocvienActionPerformed

    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        // TODO add your handling code here:
        selectComboBox();
    }//GEN-LAST:event_cboChuyenDeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhoaHocJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel BGButton;
    private javax.swing.JLabel BGLB;
    private javax.swing.JLabel BGLT;
    private javax.swing.JLabel BGLogo;
    private javax.swing.JLabel BGRB;
    private javax.swing.JLabel BGRT;
    private javax.swing.JButton BtnExit;
    private javax.swing.JLabel LogoT;
    private javax.swing.JSeparator Spator2;
    private javax.swing.JLabel TitleTop;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnHocvien;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblArrow1;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JTabbedPane pnlNguoiHoc;
    private javax.swing.JTable tblKhoaHoc;
    private javax.swing.JTextArea txtArena;
    private javax.swing.JTextField txtHocphi;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayKG;
    private javax.swing.JTextField txtNgaytao;
    private javax.swing.JTextField txtThoiluong;
    // End of variables declaration//GEN-END:variables

    void init() {
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
    }

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblKhoaHoc.getModel();
        model.setRowCount(0);
        try {
            List<KhoaHoc> list = khdao.Select();
            for (KhoaHoc kh : list) {
                Object[] row = {
                    kh.getMaKH(),
                    kh.getMaCD(),
                    kh.getThoiGian(),
                    kh.getHocPhi(),
                    DateHelper.toString(kh.getNgayKG()),
                    kh.getMaNV(),
                    DateHelper.toString(kh.getNgayTao())
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void clear() {
        KhoaHoc model = new KhoaHoc();
        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
        model.setMaCD(chuyenDe.getMaCD());
        model.setMaNV(ShareHelper.USER.getMaNV());
        model.setNgayKG(DateHelper.now());
        model.setNgayTao(DateHelper.now());
        model.setHocPhi(chuyenDe.getHocPhi());
        model.setThoiGian(chuyenDe.getThoiLuong());
        this.setModel(model);
        setStatus(true);
    }

    void insert() {
        KhoaHoc model = getModel();
        //model.setNgayTao(new Date());
        model.setNgayTao(DateHelper.now());
        try {
            khdao.Insert(model);
            this.load();
            this.clear();
            DialogHelper.alert(this, "Thêm mới thành công!");
        } catch (HeadlessException e) {
            DialogHelper.alert(this, "Thêm mới thất bại!");
        }
    }

    void update() {
        KhoaHoc model = getModel();
        try {
            khdao.Update(model);
            this.load();
            DialogHelper.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            DialogHelper.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa khóa học này?")) {
            Integer makh = Integer.valueOf(cboChuyenDe.getToolTipText());
            try {
                khdao.Delete(makh);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Xóa thất bại!");
            }
        }
    }

    KhoaHoc getModel() {
        KhoaHoc model = new KhoaHoc();
        ChuyenDe cd = (ChuyenDe) cboChuyenDe.getSelectedItem();
        model.setMaCD(cd.getMaCD());
        model.setMaNV(ShareHelper.USER.getMaNV());
        model.setHocPhi(Double.parseDouble(txtHocphi.getText()));
        model.setThoiGian(Integer.parseInt(txtThoiluong.getText()));
        model.setNgayKG(DateHelper.toDate(txtNgayKG.getText()));
        model.setNgayTao(DateHelper.toDate(txtNgaytao.getText()));
        model.setGhiChu(txtArena.getText());
        model.setMaKH(Integer.valueOf(cboChuyenDe.getToolTipText()));
        return model;
    }

    void setModel(KhoaHoc model) {
        cboChuyenDe.setToolTipText(String.valueOf(model.getMaKH()));
        ChuyenDe cd = cddao.findByID(model.getMaCD());
        cboChuyenDe.setSelectedItem(cd);
        txtMaNV.setText(model.getMaNV());
        txtHocphi.setText(String.valueOf(model.getHocPhi()));
        txtThoiluong.setText(String.valueOf(model.getThoiGian()));
        txtNgayKG.setText(DateHelper.toString(model.getNgayKG(), "mm/dd/yyyy"));
        txtNgaytao.setText(DateHelper.toString(model.getNgayTao(), "mm/dd/yyyy"));
        txtArena.setText(model.getGhiChu());
    }

    void setStatus(boolean insertable) {
        btnThem.setEnabled(insertable);
        btnSua.setEnabled(!insertable);
        btnXoa.setEnabled(!insertable);

        boolean first = this.index > 0;
        boolean last = this.index < tblKhoaHoc.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnNext.setEnabled(!insertable && last);
        btnLast.setEnabled(!insertable && last);
    }

    void selectComboBox() {
        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
        txtThoiluong.setText(String.valueOf(chuyenDe.getThoiLuong()));
        txtHocphi.setText(String.valueOf(chuyenDe.getHocPhi()));
        txtArena.setText(chuyenDe.getMoTa());
    }

    void openHocVien() {
        Integer id = Integer.valueOf(cboChuyenDe.getToolTipText());
        new HocVienJFrame(id).setVisible(true);
    }

    void fillComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel();
        model.removeAllElements();
        try {
            List<ChuyenDe> list = cddao.Select();
            for (ChuyenDe cd : list) {
                model.addElement(cd);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void edit() {
        try {
            Integer makh = (Integer) tblKhoaHoc.getValueAt(this.index, 0);
            KhoaHoc model = khdao.findById(makh);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    boolean checkHP() {
        int hp = Integer.parseInt(txtHocphi.getText());
        if (hp >= 0) {
            return true;
        }else{
            DialogHelper.alert(this, "Học phí phải là số dương");
            txtHocphi.requestFocus();
            return false;
        }
    }

    boolean checkTL() {
        int tl = Integer.parseInt(txtThoiluong.getText());
        if (tl >= 0) {
            return true;
        }else{
            DialogHelper.alert(this, "Thời gian học phải là số dương");
            txtThoiluong.requestFocus();
            return false;
        }
    }
    
    boolean checkDay(){
        KhoaHoc model = getModel();
        int nt = model.getNgayTao().getDay() + model.getNgayTao().getMonth();
        int nkg = model.getNgayKG().getDay() + model.getNgayKG().getMonth();
        if (nt < nkg) {
            return true;
        }else{
            DialogHelper.alert(BGRT, "Ngày khai giảng phải lớn hơn ngày tạo");
            txtNgaytao.requestFocus();
            return false;
        }
    }
}
