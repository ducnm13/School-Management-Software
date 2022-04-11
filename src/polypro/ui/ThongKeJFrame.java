/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.ui;

import polypro.helper.DialogHelper;
import polypro.helper.ShareHelper;
import polypro.ui.TableThongKeJFrame;

/**
 *
 * @author PC
 */
public class ThongKeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ThongKeJFrame
     */
    public ThongKeJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    void openNguoiHoc() {
        new NguoiHocJFrame().setVisible(true);
    }

    void openChuyenDe() {
        new ChuyenDeJFrame().setVisible(true);
    }

    void openDiemTungKhoa() {
        new TableThongKeJFrame().setVisible(true);
    }

    public void back() {
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
        btnNguoihoc = new javax.swing.JButton();
        btnDoanhthutungkhoa = new javax.swing.JButton();
        btnDiemtungkhoa = new javax.swing.JButton();
        btnChuyende = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        lblNguoiHoc = new javax.swing.JLabel();
        lblChuyende = new javax.swing.JLabel();
        lblDoanhthutungchuyende = new javax.swing.JLabel();
        lblDiemtungkhoa = new javax.swing.JLabel();
        btnThongke = new javax.swing.JLabel();
        btnQuanly = new javax.swing.JLabel();
        btnHuongdan = new javax.swing.JLabel();
        btnDangxuat = new javax.swing.JLabel();
        Spator1 = new javax.swing.JSeparator();
        Spator2 = new javax.swing.JSeparator();
        Spator3 = new javax.swing.JSeparator();
        Spator4 = new javax.swing.JSeparator();
        BGRT = new javax.swing.JLabel();
        BGRB = new javax.swing.JLabel();
        BGLT = new javax.swing.JLabel();
        BGLB = new javax.swing.JLabel();
        BGButton = new javax.swing.JLabel();
        BGLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/icons8_java_48px.png"))); // NOI18N
        getContentPane().add(LogoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 100));

        TitleTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/HỆ THỐNG QUẢN LÝ ĐÀO TẠO.png"))); // NOI18N
        getContentPane().add(TitleTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        btnNguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/icons8_graduate_128px.png"))); // NOI18N
        btnNguoihoc.setContentAreaFilled(false);
        btnNguoihoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoihocActionPerformed(evt);
            }
        });
        getContentPane().add(btnNguoihoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, 170));

        btnDoanhthutungkhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/icons8_paper_money_96px.png"))); // NOI18N
        btnDoanhthutungkhoa.setContentAreaFilled(false);
        btnDoanhthutungkhoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoanhthutungkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhthutungkhoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoanhthutungkhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

        btnDiemtungkhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/icons8_area_chart_128px.png"))); // NOI18N
        btnDiemtungkhoa.setContentAreaFilled(false);
        btnDiemtungkhoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiemtungkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiemtungkhoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiemtungkhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, 150));

        btnChuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/icons8_report_card_160px.png"))); // NOI18N
        btnChuyende.setContentAreaFilled(false);
        btnChuyende.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyendeActionPerformed(evt);
            }
        });
        getContentPane().add(btnChuyende, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        BtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/Left.png"))); // NOI18N
        BtnExit.setContentAreaFilled(false);
        BtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExitMouseClicked(evt);
            }
        });
        getContentPane().add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 535, -1, 50));

        lblNguoiHoc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNguoiHoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNguoiHoc.setText("Người Học");
        getContentPane().add(lblNguoiHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        lblChuyende.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblChuyende.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChuyende.setText("Chuyên Đề");
        getContentPane().add(lblChuyende, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, -1, -1));

        lblDoanhthutungchuyende.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDoanhthutungchuyende.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoanhthutungchuyende.setText("Doanh thu từng chuyên đề");
        getContentPane().add(lblDoanhthutungchuyende, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, -1, -1));

        lblDiemtungkhoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDiemtungkhoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiemtungkhoa.setText("Điểm từng khoá học");
        getContentPane().add(lblDiemtungkhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, -1, -1));

        btnThongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 10.png"))); // NOI18N
        btnThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongkeMouseClicked(evt);
            }
        });
        getContentPane().add(btnThongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, -1));

        btnQuanly.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnQuanly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 6.png"))); // NOI18N
        btnQuanly.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnQuanly, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        btnHuongdan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 3.png"))); // NOI18N
        btnHuongdan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnHuongdan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        btnDangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 4.png"))); // NOI18N
        btnDangxuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnDangxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));
        getContentPane().add(Spator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 520, 20));
        getContentPane().add(Spator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 520, 20));

        Spator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(Spator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 10, 180));

        Spator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(Spator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 10, 160));

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

    private void btnThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongkeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThongkeMouseClicked

    private void btnNguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoihocActionPerformed
        // TODO add your handling code here:
        openNguoiHoc();
    }//GEN-LAST:event_btnNguoihocActionPerformed

    private void btnChuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyendeActionPerformed
        // TODO add your handling code here:
        openChuyenDe();
    }//GEN-LAST:event_btnChuyendeActionPerformed

    private void btnDiemtungkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiemtungkhoaActionPerformed
        // TODO add your handling code here:
        openDiemTungKhoa();
    }//GEN-LAST:event_btnDiemtungkhoaActionPerformed

    private void btnDoanhthutungkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhthutungkhoaActionPerformed
        // TODO add your handling code here:
        openDiemTungKhoa();
    }//GEN-LAST:event_btnDoanhthutungkhoaActionPerformed

    private void BtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnExitMouseClicked

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
            java.util.logging.Logger.getLogger(ThongKeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGButton;
    private javax.swing.JLabel BGLB;
    private javax.swing.JLabel BGLT;
    private javax.swing.JLabel BGLogo;
    private javax.swing.JLabel BGRB;
    private javax.swing.JLabel BGRT;
    private javax.swing.JButton BtnExit;
    private javax.swing.JLabel LogoT;
    private javax.swing.JSeparator Spator1;
    private javax.swing.JSeparator Spator2;
    private javax.swing.JSeparator Spator3;
    private javax.swing.JSeparator Spator4;
    private javax.swing.JLabel TitleTop;
    private javax.swing.JButton btnChuyende;
    private javax.swing.JLabel btnDangxuat;
    private javax.swing.JButton btnDiemtungkhoa;
    private javax.swing.JButton btnDoanhthutungkhoa;
    private javax.swing.JLabel btnHuongdan;
    private javax.swing.JButton btnNguoihoc;
    private javax.swing.JLabel btnQuanly;
    private javax.swing.JLabel btnThongke;
    private javax.swing.JLabel lblChuyende;
    private javax.swing.JLabel lblDiemtungkhoa;
    private javax.swing.JLabel lblDoanhthutungchuyende;
    private javax.swing.JLabel lblNguoiHoc;
    // End of variables declaration//GEN-END:variables
}
