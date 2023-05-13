/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
import dao.SinhVienDAO;
import dao.ThongTinHoaDonDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ThongTinSinhVien;

/**
 *
 * @author PhanTien
 */
public class Main extends javax.swing.JFrame {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private List<ThongTinSinhVien> listsinhvien;
    private DefaultTableModel Model;
    private int count = 0;
    private String maSV;
    private SinhVienDAO sinhviendao;
    String tenDangNhap;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    void setTenDangNhap(String tendn) {
        tenDangNhap = tendn;
    }

    void setnameuser(String tendangnhap) {
        boolean kiemtra = new SinhVienDAO().KiemTraTenDN(tenDangNhap);
        if (kiemtra) {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "select * from thongtinsinhvien where tenDangNhap='" + tendangnhap + "'";
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    txtnameuser.setText(rs.getString("tenSV"));
                    maSV = rs.getString("maSV");
                }
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "select * from thongtinsinhviendangky where tenDangNhap='" + tendangnhap + "'";
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    txtnameuser.setText(rs.getString("tenSV"));
                    maSV = rs.getString("maSV");
                }
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trangChu1 = new JFrameQuanLyKyTucXa.TrangChu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnameuser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanelTrangChu = new JFrameQuanLyKyTucXa.TrangChu();
        jPanelQuanLySV = new JFrameQuanLyKyTucXa.QuanLySV();
        jPanelQuanLyDK = new JFrameQuanLyKyTucXa.QuanLySinhVienDK();
        jPanelQuanLyPhong = new JFrameQuanLyKyTucXa.QuanLyPhong();
        jPanelThongTinTaiKhoan = new JFrameQuanLyKyTucXa.ThongTinTaiKhoan();
        jPanelCaiDatTaiKhoan = new JFrameQuanLyKyTucXa.CaiDatTaiKhoan();
        jPanelPhanQuyen = new JFrameQuanLyKyTucXa.PhanQuyenNguoiDung();
        jPanelKhoanPhi = new JFrameQuanLyKyTucXa.QuanLyKhoanPhi();
        jPanelThongKe = new JFrameQuanLyKyTucXa.ThongKe();
        jPanelKhoanPhiCuaToi = new JFrameQuanLyKyTucXa.KhoanPhi_USER();
        jPanelKhoanPhiDaThanhToan = new JFrameQuanLyKyTucXa.KhoanPhiDk();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(20, 20));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(19, 90, 118));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo Học Viện Công Nghệ Bưu Chính Viễn Thông - PTIT(Simple).png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UserName:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu:");

        txtnameuser.setForeground(new java.awt.Color(255, 255, 255));
        txtnameuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnameuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_name.png"))); // NOI18N
        txtnameuser.setText("Phan Van Tien");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil.png"))); // NOI18N
        jLabel5.setText("Phân quyền người dùng");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/people.png"))); // NOI18N
        jLabel6.setText("Quản lý sinh viên");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bank.png"))); // NOI18N
        jLabel7.setText("Quản lý phòng");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bag.png"))); // NOI18N
        jLabel8.setText("Quản lý đăng ký");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money_bag.png"))); // NOI18N
        jLabel11.setText("Các khoản phí");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongke.png"))); // NOI18N
        jLabel12.setText("Thống kê");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jLabel13.setText("Thông tin tài khoản");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jLabel15.setText("Trang chủ");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/out.png"))); // NOI18N
        jLabel16.setText("LogOut");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setting.png"))); // NOI18N
        jLabel14.setText("Cài lại mật khẩu");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money_bag.png"))); // NOI18N
        jLabel17.setText("Các khoản phí của tôi");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtnameuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnameuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelmenu.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_ptit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.CardLayout());
        jPanel5.add(jPanelTrangChu, "card3");
        jPanel5.add(jPanelQuanLySV, "card4");
        jPanel5.add(jPanelQuanLyDK, "card4");
        jPanel5.add(jPanelQuanLyPhong, "card5");
        jPanel5.add(jPanelThongTinTaiKhoan, "card6");
        jPanel5.add(jPanelCaiDatTaiKhoan, "card7");
        jPanel5.add(jPanelPhanQuyen, "card8");
        jPanel5.add(jPanelKhoanPhi, "card9");
        jPanel5.add(jPanelThongKe, "card10");
        jPanel5.add(jPanelKhoanPhiCuaToi, "card11");
        jPanel5.add(jPanelKhoanPhiDaThanhToan, "card12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn đăng xuất hay không !", "Thông báo đăng nhập", JOptionPane.YES_NO_OPTION);
        if (test == JOptionPane.YES_OPTION) {
            dispose();
            Login login = new Login();
            login.show();
        } else if (test == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Bạn đã hủy đăng xuất");
        }

    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(true);
        jPanelQuanLySV.setVisible(false);
        jPanelQuanLyDK.setVisible(false);
        jPanelQuanLyPhong.setVisible(false);
        jPanelThongKe.setVisible(false);
        jPanelKhoanPhiCuaToi.setVisible(false);
        jPanelKhoanPhiDaThanhToan.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelPhanQuyen.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        setnameuser(tenDangNhap);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelQuanLySV.setVisible(true);
        jPanelQuanLyDK.setVisible(false);
        jPanelThongKe.setVisible(false);
        jPanelQuanLyPhong.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelKhoanPhiCuaToi.setVisible(false);
        jPanelKhoanPhiDaThanhToan.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelPhanQuyen.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        setnameuser(tenDangNhap);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelQuanLySV.setVisible(false);
        jPanelQuanLyDK.setVisible(true);
        jPanelQuanLyPhong.setVisible(false);
        jPanelThongKe.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelKhoanPhiCuaToi.setVisible(false);
        jPanelKhoanPhiDaThanhToan.setVisible(false);
        jPanelPhanQuyen.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        setnameuser(tenDangNhap);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelQuanLySV.setVisible(false);
        jPanelQuanLyDK.setVisible(false);
        jPanelThongKe.setVisible(false);
        jPanelQuanLyPhong.setVisible(true);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelPhanQuyen.setVisible(false);
        jPanelKhoanPhiCuaToi.setVisible(false);
        jPanelKhoanPhiDaThanhToan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        // jPanelQuanLyPhong.showTable();
        setnameuser(tenDangNhap);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelQuanLySV.setVisible(false);
        jPanelQuanLyDK.setVisible(false);
        jPanelQuanLyPhong.setVisible(false);
        jPanelThongKe.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(true);
        jPanelPhanQuyen.setVisible(false);
        jPanelKhoanPhiCuaToi.setVisible(false);
        jPanelKhoanPhiDaThanhToan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        setnameuser(tenDangNhap);
        this.jPanelThongTinTaiKhoan.showViewTaiKhoan(tenDangNhap);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelQuanLySV.setVisible(false);
        jPanelQuanLyDK.setVisible(false);
        jPanelQuanLyPhong.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelPhanQuyen.setVisible(false);
        jPanelKhoanPhiCuaToi.setVisible(false);
        jPanelKhoanPhiDaThanhToan.setVisible(false);
        jPanelThongKe.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(true);
        jPanelKhoanPhi.setVisible(false);
        setnameuser(tenDangNhap);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:jPanelTrangChu.setVisible(false);
        jPanelQuanLySV.setVisible(false);
        jPanelTrangChu.setVisible(false);
        jPanelQuanLyDK.setVisible(false);
        jPanelQuanLyPhong.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelPhanQuyen.setVisible(true);
        jPanelKhoanPhiCuaToi.setVisible(false);
        jPanelKhoanPhiDaThanhToan.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelThongKe.setVisible(false);
        this.jPanelPhanQuyen.AddComboBox();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        jPanelQuanLySV.setVisible(false);
        jPanelTrangChu.setVisible(false);
        jPanelQuanLyDK.setVisible(false);
        jPanelQuanLyPhong.setVisible(false);
        jPanelKhoanPhiCuaToi.setVisible(false);
        jPanelKhoanPhiDaThanhToan.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelPhanQuyen.setVisible(false);
        jPanelKhoanPhi.setVisible(true);
        jPanelThongKe.setVisible(false);
        jPanelKhoanPhi.showTable();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        jPanelQuanLySV.setVisible(false);
        jPanelTrangChu.setVisible(false);
        jPanelQuanLyDK.setVisible(false);
        jPanelQuanLyPhong.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelPhanQuyen.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelKhoanPhiCuaToi.setVisible(false);
        jPanelKhoanPhiDaThanhToan.setVisible(false);
        jPanelThongKe.setVisible(true);
        jPanelThongKe.setup();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        jPanelQuanLySV.setVisible(false);
        jPanelTrangChu.setVisible(false);
        jPanelQuanLyDK.setVisible(false);
        jPanelQuanLyPhong.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelPhanQuyen.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelThongKe.setVisible(false);
        boolean kiemtra = new SinhVienDAO().KiemTraTenDN(tenDangNhap);
        if (kiemtra) {
            boolean test = new ThongTinHoaDonDAO().KiemTraKhoanPhi(maSV);
            if (test) {
                jPanelKhoanPhiCuaToi.setVisible(true);
                jPanelKhoanPhiCuaToi.show(tenDangNhap);
                jPanelKhoanPhiDaThanhToan.setVisible(false);
            } else {
                jPanelKhoanPhiCuaToi.setVisible(false);
                jPanelKhoanPhiDaThanhToan.setVisible(true);
            }
        } else {
            jPanelKhoanPhiCuaToi.setVisible(false);
            jPanelKhoanPhiDaThanhToan.setVisible(true);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private JFrameQuanLyKyTucXa.CaiDatTaiKhoan jPanelCaiDatTaiKhoan;
    private JFrameQuanLyKyTucXa.QuanLyKhoanPhi jPanelKhoanPhi;
    private JFrameQuanLyKyTucXa.KhoanPhi_USER jPanelKhoanPhiCuaToi;
    private JFrameQuanLyKyTucXa.KhoanPhiDk jPanelKhoanPhiDaThanhToan;
    private JFrameQuanLyKyTucXa.PhanQuyenNguoiDung jPanelPhanQuyen;
    private JFrameQuanLyKyTucXa.QuanLySinhVienDK jPanelQuanLyDK;
    private JFrameQuanLyKyTucXa.QuanLyPhong jPanelQuanLyPhong;
    private JFrameQuanLyKyTucXa.QuanLySV jPanelQuanLySV;
    private JFrameQuanLyKyTucXa.ThongKe jPanelThongKe;
    private JFrameQuanLyKyTucXa.ThongTinTaiKhoan jPanelThongTinTaiKhoan;
    private JFrameQuanLyKyTucXa.TrangChu jPanelTrangChu;
    private JFrameQuanLyKyTucXa.TrangChu trangChu1;
    private javax.swing.JLabel txtnameuser;
    // End of variables declaration//GEN-END:variables

}
