import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import latihan.gui2.Database;
import latihan.gui2.Mahasiswa;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


/**
 *
 * @author Tyo
 */
public class EntryPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntryPanel
     */
    public EntryPanel() {
        initComponents();
        loadTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        umurSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        provinsiComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        futsalCheckBox = new javax.swing.JCheckBox();
        nimTextField = new javax.swing.JTextField();
        basketCheckBox = new javax.swing.JCheckBox();
        namaTextField = new javax.swing.JTextField();
        tidurCheckBox = new javax.swing.JCheckBox();
        lakiRadioButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        perempuanRadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mahasiswaTable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("NIM :");

        alamatTextArea.setColumns(20);
        alamatTextArea.setRows(5);
        jScrollPane1.setViewportView(alamatTextArea);

        jLabel2.setText("Nama :");

        umurSpinner.setModel(new javax.swing.SpinnerNumberModel(15, 0, 60, 1));

        jLabel3.setText("Jenis Kelamin :");

        simpanButton.setText("simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Umur :");

        jLabel5.setText("Alamat :");

        provinsiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KalSel", "KalBar", "KalTim", "KalTeng", "KalTara", " " }));

        jLabel6.setText("Provinsi :");

        futsalCheckBox.setText("Futsal");

        basketCheckBox.setText("Basket");

        tidurCheckBox.setText("Tidur");

        buttonGroup1.add(lakiRadioButton);
        lakiRadioButton.setText("Laki-Laki");
        lakiRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiRadioButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Hobi :");

        buttonGroup1.add(perempuanRadioButton);
        perempuanRadioButton.setText("Perempuan");
        perempuanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuanRadioButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Tahun");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(312, Short.MAX_VALUE)
                .addComponent(simpanButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7))
                    .addGap(46, 46, 46)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nimTextField)
                        .addComponent(namaTextField)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(basketCheckBox)
                                .addComponent(futsalCheckBox)
                                .addComponent(provinsiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(perempuanRadioButton)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(umurSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8))
                                .addComponent(lakiRadioButton)
                                .addComponent(tidurCheckBox))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(378, Short.MAX_VALUE)
                .addComponent(simpanButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addGap(5, 5, 5))
                        .addComponent(lakiRadioButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(perempuanRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(umurSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(provinsiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(futsalCheckBox)
                        .addComponent(jLabel7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(basketCheckBox)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tidurCheckBox)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        mahasiswaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "Umur", "Alamat", "Provinsi", "Hobi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mahasiswaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mahasiswaTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mahasiswaTable);

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(editButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(378, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(deleteButton))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim(nimTextField.getText());
        mhs.setNama(namaTextField.getText());
        if(lakiRadioButton.isSelected()){
            mhs.setJenisKelamin("Laki-laki");
        }
        if(perempuanRadioButton.isSelected()){
            mhs.setJenisKelamin("Perempuan");
        }
        int umur = (Integer) umurSpinner.getValue();
        mhs.setUmur(umur);
        mhs.setAlamat(alamatTextArea.getText());

        mhs.setProvinsi(provinsiComboBox.getSelectedItem().toString());
        ArrayList<String> hobiList = new ArrayList<>();
        if(futsalCheckBox.isSelected()){
            hobiList.add("Futsal");
        }
        if(basketCheckBox.isSelected()){
            hobiList.add("Basket");
        }
        if(tidurCheckBox.isSelected()){
            hobiList.add("Tidur");
        }
        mhs.setHobi(hobiList);
//        Database.getInstance().insertMahasiswa(mhs);
//        clearForm();
//        JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
//        loadTableData();
        try {
            Database.getInstance().insertMahasiswa(mhs);
            clearForm();
            JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
            loadTableData();
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void loadTableData(){
        DefaultTableModel dtm = (DefaultTableModel) mahasiswaTable.getModel();
        //refresh tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        //isi tabel
        try {
        //isi tabel
            for(Mahasiswa mhs: Database.getInstance().getListMahasiswa()){
                dtm.addRow(new Object[]{mhs.getNim(),mhs.getNama(),mhs.getJenisKelamin(),mhs.getUmur(), mhs.getAlamat(), mhs.getProvinsi(), mhs.getHobi()});
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
//        for(Mahasiswa mhs : Database.getInstance().getListMahasiswa()){
//            dtm.addRow(new Object[]{mhs.getNim(),mhs.getNama(),mhs.getJenisKelamin(),mhs.getUmur()});
//        }
    }
    
    private void clearForm(){
        nimTextField.setText("");
        namaTextField.setText("");
        buttonGroup1.clearSelection();
        umurSpinner.setValue(15);
        alamatTextArea.setText("");
        provinsiComboBox.setSelectedIndex(-1);
        futsalCheckBox.setSelected(false);
        basketCheckBox.setSelected(false);
        tidurCheckBox.setSelected(false);
    }
    
    private void lakiRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiRadioButtonActionPerformed

    private void perempuanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuanRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuanRadioButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim(nimTextField.getText());
        mhs.setNama(namaTextField.getText());
        if(lakiRadioButton.isSelected()){
            mhs.setJenisKelamin("Laki-laki");
        }
        if(perempuanRadioButton.isSelected()){
            mhs.setJenisKelamin("Perempuan");
        }
        int umur = (Integer) umurSpinner.getValue();
        mhs.setUmur(umur);
        mhs.setAlamat(alamatTextArea.getText());

        mhs.setProvinsi(provinsiComboBox.getSelectedItem().toString());
        ArrayList<String> hobiList = new ArrayList<>();
        if(futsalCheckBox.isSelected()){
            hobiList.add("Futsal");
        }
        if(basketCheckBox.isSelected()){
            hobiList.add("Basket");
        }
        if(tidurCheckBox.isSelected()){
            hobiList.add("Tidur");
        }
        mhs.setHobi(hobiList);
//        Database.getInstance().insertMahasiswa(mhs);
//        clearForm();
//        JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
//        loadTableData();
        try {
            Database.getInstance().editMahasiswa(mhs, mhs.getNim());
            clearForm();
            JOptionPane.showMessageDialog(this, "Sukses Diganti");
            loadTableData();
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim(nimTextField.getText());
        mhs.setNama(namaTextField.getText());
        if(lakiRadioButton.isSelected()){
            mhs.setJenisKelamin("Laki-laki");
        }
        if(perempuanRadioButton.isSelected()){
            mhs.setJenisKelamin("Perempuan");
        }
        int umur = (Integer) umurSpinner.getValue();
        mhs.setUmur(umur);
        mhs.setAlamat(alamatTextArea.getText());

        mhs.setProvinsi(provinsiComboBox.getSelectedItem().toString());
        ArrayList<String> hobiList = new ArrayList<>();
        if(futsalCheckBox.isSelected()){
            hobiList.add("Futsal");
        }
        if(basketCheckBox.isSelected()){
            hobiList.add("Basket");
        }
        if(tidurCheckBox.isSelected()){
            hobiList.add("Tidur");
        }
        mhs.setHobi(hobiList);
//        Database.getInstance().insertMahasiswa(mhs);
//        clearForm();
//        JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
//        loadTableData();
        try {
            Database.getInstance().hapusMahasiswa(mhs, mhs.getNim());
            clearForm();
            JOptionPane.showMessageDialog(this, "Sukses Dihapus");
            loadTableData();
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void mahasiswaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mahasiswaTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)mahasiswaTable.getModel();
        
        String tblNim = dtm.getValueAt(mahasiswaTable.getSelectedRow(),0).toString();
        String tblNama = dtm.getValueAt(mahasiswaTable.getSelectedRow(),1).toString();
        String tblJenisKelamin = dtm.getValueAt(mahasiswaTable.getSelectedRow(),2).toString();
        int tblUmur = (int) dtm.getValueAt(mahasiswaTable.getSelectedRow(),3);
        String tblAlamat = dtm.getValueAt(mahasiswaTable.getSelectedRow(),4).toString();
        nimTextField.setText(tblNim);
        namaTextField.setText(tblNama);
        if(tblJenisKelamin.equals("Laki-laki")){
            lakiRadioButton.setSelected(true);
        }else{
            perempuanRadioButton.setSelected(true);
        }
        umurSpinner.setValue(tblUmur);
        alamatTextArea.setText(tblAlamat);
    }//GEN-LAST:event_mahasiswaTableMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatTextArea;
    private javax.swing.JCheckBox basketCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JCheckBox futsalCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton lakiRadioButton;
    private javax.swing.JTable mahasiswaTable;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JRadioButton perempuanRadioButton;
    private javax.swing.JComboBox<String> provinsiComboBox;
    private javax.swing.JButton simpanButton;
    private javax.swing.JCheckBox tidurCheckBox;
    private javax.swing.JSpinner umurSpinner;
    // End of variables declaration//GEN-END:variables
}