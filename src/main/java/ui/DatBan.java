package ui;

import controllers.QLBan;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.SwingConstants.BOTTOM;
import static javax.swing.SwingConstants.CENTER;
import model.Ban;
import utils.Auth;
import utils.MsgBox;
import utils.XColor;
import utils.XInit;

public class DatBan extends javax.swing.JFrame {

    public DatBan() {
        initComponents();
        XInit.init(this);
        addButton(pnlBan, lblTinhTrang);
        this.setColor();
    }

    void setColor() {
        tlbDatBan.setBackground(XColor.color);
        tlbDatBan.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, XColor.extraColor));
        pnlDatBan.setBackground(XColor.color);
        pnlDatBan.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, XColor.extraColor));
        pnlBan.setBackground(XColor.extraColor);

        btnExit.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, XColor.extraColor));
        btnThemBan.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, XColor.extraColor));
        btnDatMon.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, XColor.extraColor));
        btnHuongDan.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, XColor.extraColor));
        btnDanhMuc.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, XColor.extraColor));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatBan = new javax.swing.JPanel();
        btnTrong = new javax.swing.JButton();
        btnDatCho = new javax.swing.JButton();
        btnDaDat = new javax.swing.JButton();
        lblTinhTrang = new javax.swing.JLabel();
        tlbDatBan = new javax.swing.JToolBar();
        btnDanhMuc = new javax.swing.JButton();
        btnDatMon = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        btnThemBan = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        scrDatBan = new javax.swing.JScrollPane();
        pnlBan = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnMauChinh = new javax.swing.JMenuItem();
        mnMauPhu = new javax.swing.JMenuItem();
        btnResetColor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("QUẢN LÝ NHÀ HÀNG - ĐẶT BÀN");

        pnlDatBan.setBackground(new java.awt.Color(255, 255, 204));
        pnlDatBan.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 204, 102)));
        pnlDatBan.setAlignmentX(0.1F);

        btnTrong.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnTrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/table-blue-32.png"))); // NOI18N
        btnTrong.setText("Còn Trống");

        btnDatCho.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnDatCho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/table-organce-32.png"))); // NOI18N
        btnDatCho.setText("Đã Đặt Chỗ");

        btnDaDat.setBackground(new java.awt.Color(204, 204, 204));
        btnDaDat.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnDaDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/table-red-32.png"))); // NOI18N
        btnDaDat.setText("Đã Đặt Món");

        lblTinhTrang.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        lblTinhTrang.setForeground(new java.awt.Color(153, 0, 0));
        lblTinhTrang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTinhTrang.setText("Hiện Tại Nhà Hàng Còn 11 Bàn Trống");

        tlbDatBan.setBackground(new java.awt.Color(255, 255, 204));
        tlbDatBan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 204, 102)));
        tlbDatBan.setFloatable(false);
        tlbDatBan.setForeground(new java.awt.Color(255, 255, 255));
        tlbDatBan.setRollover(true);
        tlbDatBan.setToolTipText("");

        btnDanhMuc.setBackground(new java.awt.Color(255, 255, 255));
        btnDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/purchase-order-32.png"))); // NOI18N
        btnDanhMuc.setText("Danh Mục");
        btnDanhMuc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnDanhMuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDanhMuc.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDanhMuc.setMaximumSize(new java.awt.Dimension(90, 60));
        btnDanhMuc.setMinimumSize(new java.awt.Dimension(90, 60));
        btnDanhMuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhMucActionPerformed(evt);
            }
        });
        tlbDatBan.add(btnDanhMuc);

        btnDatMon.setBackground(new java.awt.Color(255, 255, 255));
        btnDatMon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDatMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/restaurant-3-32.png"))); // NOI18N
        btnDatMon.setText("Đặt Món");
        btnDatMon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnDatMon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDatMon.setMaximumSize(new java.awt.Dimension(90, 60));
        btnDatMon.setMinimumSize(new java.awt.Dimension(90, 60));
        btnDatMon.setPreferredSize(new java.awt.Dimension(90, 60));
        btnDatMon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDatMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatMonActionPerformed(evt);
            }
        });
        tlbDatBan.add(btnDatMon);

        btnHuongDan.setBackground(new java.awt.Color(255, 255, 255));
        btnHuongDan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help-32.png"))); // NOI18N
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setMaximumSize(new java.awt.Dimension(90, 60));
        btnHuongDan.setMinimumSize(new java.awt.Dimension(90, 60));
        btnHuongDan.setPreferredSize(new java.awt.Dimension(90, 60));
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        tlbDatBan.add(btnHuongDan);

        btnThemBan.setBackground(new java.awt.Color(255, 255, 255));
        btnThemBan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThemBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus-32.png"))); // NOI18N
        btnThemBan.setText("Thêm Bàn");
        btnThemBan.setToolTipText("Thêm bàn mới");
        btnThemBan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnThemBan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThemBan.setMaximumSize(new java.awt.Dimension(90, 60));
        btnThemBan.setMinimumSize(new java.awt.Dimension(90, 60));
        btnThemBan.setPreferredSize(new java.awt.Dimension(90, 60));
        btnThemBan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThemBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemBanMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnThemBanMouseReleased(evt);
            }
        });
        btnThemBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemBanActionPerformed(evt);
            }
        });
        tlbDatBan.add(btnThemBan);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-window-32.png"))); // NOI18N
        btnExit.setText("THOÁT");
        btnExit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setMaximumSize(new java.awt.Dimension(90, 60));
        btnExit.setMinimumSize(new java.awt.Dimension(90, 60));
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        tlbDatBan.add(btnExit);

        pnlBan.setBackground(new java.awt.Color(255, 204, 102));
        pnlBan.setLayout(new java.awt.GridLayout(5, 5, 2, 2));
        scrDatBan.setViewportView(pnlBan);

        javax.swing.GroupLayout pnlDatBanLayout = new javax.swing.GroupLayout(pnlDatBan);
        pnlDatBan.setLayout(pnlDatBanLayout);
        pnlDatBanLayout.setHorizontalGroup(
            pnlDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlbDatBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlDatBanLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnTrong)
                .addGap(18, 18, 18)
                .addComponent(btnDatCho, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDaDat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatBanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatBanLayout.createSequentialGroup()
                        .addComponent(lblTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatBanLayout.createSequentialGroup()
                        .addComponent(scrDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        pnlDatBanLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDaDat, btnDatCho, btnTrong});

        pnlDatBanLayout.setVerticalGroup(
            pnlDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatBanLayout.createSequentialGroup()
                .addComponent(tlbDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatCho, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDaDat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTinhTrang)
                .addGap(18, 18, 18)
                .addComponent(scrDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        pnlDatBanLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDaDat, btnDatCho, btnTrong});

        jMenu3.setText("Color");

        mnMauChinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rainbow-flag.png"))); // NOI18N
        mnMauChinh.setText("Chọn màu chính");
        mnMauChinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMauChinhActionPerformed(evt);
            }
        });
        jMenu3.add(mnMauChinh);

        mnMauPhu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rainbow-flag.png"))); // NOI18N
        mnMauPhu.setText("Chọn màu phụ");
        mnMauPhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMauPhuActionPerformed(evt);
            }
        });
        jMenu3.add(mnMauPhu);

        btnResetColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-24.png"))); // NOI18N
        btnResetColor.setText("Reset");
        btnResetColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetColorActionPerformed(evt);
            }
        });
        jMenu3.add(btnResetColor);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMucActionPerformed
        // TODO add your handling code here:
        new DanhMuc().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDanhMucActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
        new HuongDan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnThemBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemBanActionPerformed

    private void btnThemBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemBanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemBanMouseClicked

    private void btnThemBanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemBanMouseReleased
        // TODO add your handling code here:
        JButton button = new JButton();
        listButton.add(button);
        int len = listButton.size();
        System.out.println(len);
        button.setText("Bàn số " + String.valueOf(len));
        addBtn(listButton.get(len - 1), pnlBan, lblTinhTrang);
        pnlBan.revalidate();
        pnlBan.repaint();
    }//GEN-LAST:event_btnThemBanMouseReleased

    private void btnDatMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatMonActionPerformed
        // TODO add your handling code here:
        if (soBan == 0) {
            if (MsgBox.confirm(null, "Bạn muốn mở hóa đơn đã lưu")) {
                new DatMon().setVisible(true);
                this.dispose();
            } else {
                MsgBox.alert(null, "Để tạo hóa đơn mới bạn vui lòng chọn bàn!");
            }
        } else {
            new DatMon().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnDatMonActionPerformed

    private void mnMauChinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMauChinhActionPerformed
        // TODO add your handling code here:g
        XColor.color = XColor.chonMau(pnlDatBan);
        this.setColor();
    }//GEN-LAST:event_mnMauChinhActionPerformed

    private void mnMauPhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMauPhuActionPerformed
        // TODO add your handling code here:
        XColor.extraColor = XColor.chonMau(pnlBan);
        this.setColor();
    }//GEN-LAST:event_mnMauPhuActionPerformed

    private void btnResetColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetColorActionPerformed
        // TODO add your handling code here:
        XColor.resetColor();
        this.setColor();
    }//GEN-LAST:event_btnResetColorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!Auth.isLogin()) {
                    new Login().setVisible(true);
                    MsgBox.alert(null, "Vui lòng đăng nhập!");
                } else {
                    new DatBan().setVisible(true);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaDat;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnDatCho;
    private javax.swing.JButton btnDatMon;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JMenuItem btnResetColor;
    private javax.swing.JButton btnThemBan;
    private javax.swing.JButton btnTrong;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblTinhTrang;
    private javax.swing.JMenuItem mnMauChinh;
    private javax.swing.JMenuItem mnMauPhu;
    private javax.swing.JPanel pnlBan;
    private javax.swing.JPanel pnlDatBan;
    private javax.swing.JScrollPane scrDatBan;
    private javax.swing.JToolBar tlbDatBan;
    // End of variables declaration//GEN-END:variables

    public static List<JButton> listButton = new ArrayList<JButton>();

    void addButton(JPanel pnl, JLabel lbl) {
        pnl.setBackground(new Color(255, 204, 102));
        int h = 0, w = 0;
        for (int i = 0; i < 20; i++) {
            String txt;
            if (i < 9) {
                txt = "Bàn số 0" + (i + 1);
            } else {
                txt = "Bàn số " + (i + 1);
            }
            listButton.add(new JButton(txt));
            addBtn(listButton.get(i), pnl, lbl);
        }
    }
    public static int soBan = 0;

    final void addBtn(final JButton btn, JPanel pnl, final JLabel lbl) {
//        btn.setSize(50,50);
//        btn.setMargin(new Insets(5, 5, 5, 5));
//        btn.setMaximumSize(new Dimension(65, 70));
//        btn.setMinimumSize(new Dimension(65, 70));
        btn.setBackground(new Color(255, 255, 255));
        btn.setFont(new Font("Lucida Grande", 0, 18));
//        btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-blue-32.png")));
//        btn.setToolTipText("table-blue-32.png");
        quanLyBan(btn, lbl);
        btn.setHorizontalTextPosition(CENTER);
        btn.setVerticalTextPosition(BOTTOM);
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switch (btn.getToolTipText()) {
                    case "table-blue-32.png":
                        giuCho(btn, lbl);
                        break;
                    case "table-organce-32.png":
                        if (MsgBox.confirm(null, "Khách hàng cần đặt món!")) {
                            btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-red-32.png")));
                            btn.setToolTipText("table-red-32.png");
                            openDatMon(btn);
                        } else {
                            if (MsgBox.confirm(null, "Khách hàng hủy đặt bàn!")) {
                                huyCho(btn, lbl);
                            }
                        }
                        break;
                    case "table-red-32.png":
                        if (quanLyBan(btn, lbl)) {
                            if (MsgBox.confirm(null, "Bạn muốn chỉnh sửa hóa đơn cho " + btn.getText())) {
                                openDatMon(btn);
                            }
                        }

                        break;
//                    default:
//                        btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-blue-32.png")));
//                        btn.setToolTipText("table-blue-32.png");
//                        break;
                }
            }

        });

        pnl.add(btn);
    }

    void openDatMon(JButton btn) {
        String ban = btn.getText();
        soBan = Integer.parseInt(ban.substring(7));
        new DatMon().setVisible(true);
        dispose();
    }

    boolean quanLyBan(JButton btn, JLabel lbl) {
        String tenBan = btn.getText();
        String soBan = tenBan.substring(7);
        Boolean tinhTrang = false;

//        System.out.println(soBan);
        Ban ban = QLBan.dao.selectById(soBan);
        if (ban == null) {
            btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-blue-32.png")));
            btn.setToolTipText("table-blue-32.png");
//            System.out.println(btn.getToolTipText());
        } else {
            tinhTrang = ban.isTinhTrang();
            if (tinhTrang) {
                btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-red-32.png")));
                btn.setToolTipText("table-red-32.png");
//                System.out.println(btn.getToolTipText());

            } else {

                btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-organce-32.png")));
                btn.setToolTipText("table-organce-32.png");
//                System.out.println(btn.getToolTipText());
            }
        }
        setTinhTrang(lbl);
        return tinhTrang;
    } // Neu tinhTrang false 

    void giuCho(JButton btn, JLabel lbl) {
        Ban entity = new Ban();

        String tenBan = btn.getText();
        int soBan = Integer.parseInt(tenBan.substring(7));
        entity.setMaBan(soBan);
        entity.setMaHoaDon(0);
        entity.setTinhTrang(false);

        QLBan.insert(entity);
        btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-organce-32.png")));
        btn.setToolTipText("table-organce-32.png");
        setTinhTrang(lbl);
    }

    void huyCho(JButton btn, JLabel lbl) {
        String tenBan = btn.getText();
        QLBan.detele(tenBan.substring(7));
        btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-blue-32.png")));
        btn.setToolTipText("table-blue-32.png");
        setTinhTrang(lbl);
    }

    void setTinhTrang(JLabel lbl) {

        int dem = 0;
        for (JButton btn : listButton) {
            if (btn.getToolTipText() != null) {
                if (btn.getToolTipText().equals("table-blue-32.png")) {
                    dem = dem + 1;
                }
            }
        }
        lbl.setText("Hiện Tại Nhà Hàng Còn " + dem + " Bàn Trống");
    }

    void doiBan() {

//        QLBan.detele(String.valueOf(soBan));
        // xoa so ban cu, thay vao so ban moi, lam sao kho mo dat mon, thong tin hoa duoc dua theo bang dat ban show cung
    }
}
