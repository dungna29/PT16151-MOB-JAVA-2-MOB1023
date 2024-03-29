/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_QuanLyGiaoVien;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Anh Dung
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    DefaultTableModel defaultTableModel;//Khai báo bên ngoài biến toàn cục
    QLGV qlgv = new QLGV();

    public MainGUI() {
        initComponents();
        txt_Tuoi.setEnabled(false);//Không cho sửa ô Text tuổi
        rd_Nam.setSelected(true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rd_Nu);
        bg.add(rd_Nam);
        defaultTableModel = (DefaultTableModel) tbl_GiaoVien.getModel();
        for (String x : qlgv.getColumname()) {//qlgv.getColumname() Lấy ra 1 danh sách các tên cột đã đặt
            defaultTableModel.addColumn(x);//Thêm tên cột vào bảng Giáo viên
        }
        defaultTableModel.setRowCount(0);
        //
//        	int[] intArray = { 1, 2, 3, 4 ,5 };
//
//		String strArray[] = new String[intArray.length];
//
//		for (int i = 0; i < intArray.length; i++)
//			strArray[i] = String.valueOf(intArray[i]);
//
//		System.out.println(Arrays.toString(strArray));

        //Đổ dữ liệu vào combobox
        cbc_Tuoi.setModel(new DefaultComboBoxModel<>(Arrays.stream(qlgv.getNamSinh()).mapToObj(String::valueOf).toArray(String[]::new)));
        cbc_Tuoi.setSelectedIndex(qlgv.getNamSinh().length - 1);//Hiển thị năm gần nhất
    }

    void LoadTable() {//Hàm này dùng để load lại dữ liệu từ bên QLGV
        defaultTableModel.setRowCount(0);//Clear dữ liệu cũ
        defaultTableModel = (DefaultTableModel) tbl_GiaoVien.getModel();
        for (GiaoVien x : qlgv.getlstGiaoVien()) {
            defaultTableModel.addRow(new Object[]{x.getId(), x.getMagv(),
                x.getTengv(), x.getTuoi(), x.getGioiTinh(), x.getSdt()});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_GiaoVien = new javax.swing.JTable();
        btn_Them = new javax.swing.JButton();
        btn_Init = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Timkiem = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_MaGV = new javax.swing.JTextField();
        txt_Tuoi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rd_Nam = new javax.swing.JRadioButton();
        rd_Nu = new javax.swing.JRadioButton();
        cbc_Tuoi = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_Sdt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_Init1 = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        cbc_Loc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dungna29");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_GiaoVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_GiaoVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_GiaoVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_GiaoVien);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 326, 470, 220));

        btn_Them.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 141, 159, -1));

        btn_Init.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Init.setText("Đổ dữ liệu");
        btn_Init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Init, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 104, 160, -1));

        btn_Sua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Sua.setText("Sửa");
        getContentPane().add(btn_Sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 178, 159, -1));

        btn_Xoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Xoa.setText("Xóa");
        getContentPane().add(btn_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 215, 159, -1));

        btn_Timkiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Timkiem.setText("Tìm kiếm");
        btn_Timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimkiemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 252, 159, -1));

        btn_Thoat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 289, 159, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tên:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 136, -1, -1));

        txt_ten.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 133, 217, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã GV:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 165, -1, -1));

        txt_MaGV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_MaGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 162, 217, -1));

        txt_Tuoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_Tuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 191, 217, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tuổi:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 194, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Năm sinh:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 246, -1, -1));

        rd_Nam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_Nam.setText("Nam");
        getContentPane().add(rd_Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 216, -1, -1));

        rd_Nu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_Nu.setText("Nữ");
        getContentPane().add(rd_Nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 216, -1, -1));

        cbc_Tuoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbc_Tuoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbc_Tuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbc_TuoiActionPerformed(evt);
            }
        });
        getContentPane().add(cbc_Tuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 243, 98, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("QUẢN LÝ GIÁO VIÊN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 23, -1, -1));

        txt_Sdt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_Sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 104, 217, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sđt:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 107, -1, -1));

        btn_Init1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Init1.setText("Đổ dữ liệu");
        btn_Init1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Init1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Init1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 104, 160, -1));

        btn_Clear.setBackground(new java.awt.Color(0, 0, 204));
        btn_Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Clear.setForeground(new java.awt.Color(255, 255, 0));
        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 160, -1));

        cbc_Loc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbc_Loc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbc_Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbc_LocActionPerformed(evt);
            }
        });
        getContentPane().add(cbc_Loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:
        int temp = rd_Nam.isSelected() == true ? 1 : 0;
        //Lấy dữ liệu từ giao diện do người dùng nhập vào
        GiaoVien giaoVien = new GiaoVien(txt_MaGV.getText(),
                qlgv.getlstGiaoVien().size() + 1, txt_ten.getText(),
                Integer.parseInt(txt_Tuoi.getText()),
                rd_Nam.isSelected() == true ? 1 : 0,
                txt_Sdt.getText());

        //Thêm vào danh sách giáo viên gọi hàm ở bên QLGV ra
        if (qlgv.addGiaoVien(giaoVien)) {
            JOptionPane.showMessageDialog(this, "Chúc mừng bạn đã thêm thành công");

            LoadTable();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }


    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_InitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InitActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        defaultTableModel = (DefaultTableModel) tbl_GiaoVien.getModel();
        for (GiaoVien x : qlgv.getlstGiaoVien()) {
            defaultTableModel.addRow(new Object[]{x.getId(), x.getMagv(), x.getTengv(), x.getTuoi(), x.getGioiTinh(), x.getSdt()});
        }

        int slGiaoVien = qlgv.getlstGiaoVien().size();//Trả ra số lượng phần tử có trong danh sách
        String[] arrCount = new String[slGiaoVien];
        int temp = 0;
        for (String x : arrCount) {
            arrCount[temp] = String.valueOf(temp);
            System.out.println(x);
            temp++;
          
        }
        cbc_Loc.setModel(new DefaultComboBoxModel<>(arrCount));


    }//GEN-LAST:event_btn_InitActionPerformed

    private void tbl_GiaoVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_GiaoVienMouseClicked
        // TODO add your handling code here:
        //Bước 1: Các bạn cần phải xác định được là người dùng click ở dòng số mấy
        int indexRow = tbl_GiaoVien.getSelectedRow();
        System.out.println(indexRow);
        //Bước 2: 
        //Khai báo 1 đối tượn để lưu trữ đối tượng ở trong LIST GIÁO VIÊN
        GiaoVien giaoVien = new GiaoVien();//Làm sạch lại đối tượng
        giaoVien = qlgv.getlstGiaoVien().get(indexRow);//qlgv.getlstGiaoVien().get(indexRow) sẽ lấy ra 1 đối tượng trong list
        txt_Sdt.setText(giaoVien.getSdt());
        txt_MaGV.setText(giaoVien.getMagv());
        txt_ten.setText(giaoVien.getTengv());
        txt_Tuoi.setText(String.valueOf(giaoVien.getTuoi()));//Phải ép kiểu từ số về chuỗi
        if (giaoVien.getGioiTinh() == 1) {
            rd_Nam.setSelected(true);
        } else {
            rd_Nu.setSelected(true);
        }

        //Tính tuổi của giáo viên và hiển thị ra năm sinh
        int tempTuoi = 2020 - giaoVien.getTuoi();
        //qlgv.getNamSinh().length độ dài của mảng kiểu số nguyên
        for (int i = 0; i < qlgv.getNamSinh().length; i++) {
            if (qlgv.getNamSinh()[i] == tempTuoi) {
                cbc_Tuoi.setSelectedIndex(i);
                break;
            }
        }

    }//GEN-LAST:event_tbl_GiaoVienMouseClicked

    private void cbc_TuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbc_TuoiActionPerformed
        // TODO add your handling code here:
        int nam = 2020 - Integer.parseInt(cbc_Tuoi.getSelectedItem().toString());
        txt_Tuoi.setText(String.valueOf(nam));
    }//GEN-LAST:event_cbc_TuoiActionPerformed

    private void btn_TimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimkiemActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Mời bạn nhập ma Giáo Viên: ");
        int indexGV = qlgv.indexGV(input);//Hàm này dùng để kiểm tra xem giáo viên cần tìm có trong danh sách hay không
        if (indexGV == -1) {
            JOptionPane.showMessageDialog(this, "Mã giáo viên không tồn tại");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Tìm thấy");
            GiaoVien giaoVien = new GiaoVien();//Làm sạch lại đối tượng
            //get(qlgv.indexGV(input) gọi ra hàm search trả ra index của đối tượng trong List
            giaoVien = qlgv.getlstGiaoVien().get(indexGV);
            txt_Sdt.setBackground(Color.yellow);
            txt_Tuoi.setBackground(Color.yellow);
            txt_MaGV.setBackground(Color.yellow);
            txt_ten.setBackground(Color.yellow);
            txt_Sdt.setText(giaoVien.getSdt());
            txt_MaGV.setText(giaoVien.getMagv());
            txt_ten.setText(giaoVien.getTengv());
            txt_Tuoi.setText(String.valueOf(giaoVien.getTuoi()));//Phải ép kiểu từ số về chuỗi
            if (giaoVien.getGioiTinh() == 1) {
                rd_Nam.setSelected(true);
            } else {
                rd_Nu.setSelected(true);
            }
        }

    }//GEN-LAST:event_btn_TimkiemActionPerformed

    private void btn_Init1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Init1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Init1ActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        txt_Sdt.setText("");
        txt_MaGV.setText("");
        txt_ten.setText("");
        txt_Tuoi.setText("");//Phải ép kiểu từ số về chuỗi    
        rd_Nam.setSelected(true);
        cbc_Tuoi.setSelectedIndex(qlgv.getNamSinh().length - 1);

    }//GEN-LAST:event_btn_ClearActionPerformed

    private void cbc_LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbc_LocActionPerformed
        // TODO add your handling code here:
        int temp = cbc_Loc.getSelectedIndex();
        System.out.println(temp);
        defaultTableModel.setRowCount(0);
        defaultTableModel = (DefaultTableModel) tbl_GiaoVien.getModel();
        int soLan = 0;
        for (GiaoVien x : qlgv.getlstGiaoVien()) {
            if (temp == soLan) {
                break;
            }
            defaultTableModel.addRow(new Object[]{x.getId(), x.getMagv(), x.getTengv(), x.getTuoi(), x.getGioiTinh(), x.getSdt()});
            soLan++;
        }
    }//GEN-LAST:event_cbc_LocActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Init;
    private javax.swing.JButton btn_Init1;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Timkiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cbc_Loc;
    private javax.swing.JComboBox<String> cbc_Tuoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rd_Nam;
    private javax.swing.JRadioButton rd_Nu;
    private javax.swing.JTable tbl_GiaoVien;
    private javax.swing.JTextField txt_MaGV;
    private javax.swing.JTextField txt_Sdt;
    private javax.swing.JTextField txt_Tuoi;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables
}
