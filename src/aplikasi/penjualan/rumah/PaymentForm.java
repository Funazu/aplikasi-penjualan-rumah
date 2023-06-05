 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package aplikasi.penjualan.rumah;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kimsu
 */
public class PaymentForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form PaymentForm
     */
    public PaymentForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        radioButton = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputOrderName = new javax.swing.JTextField();
        inputPriceLand = new javax.swing.JTextField();
        inputAreaComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t36RadioButton = new javax.swing.JRadioButton();
        t45RadioButton = new javax.swing.JRadioButton();
        t54RadioButton = new javax.swing.JRadioButton();
        inputBuildingPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputLargeLand = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputAvailableLand = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        inputTotalPrice = new javax.swing.JTextField();
        inputDP = new javax.swing.JTextField();
        inputJumlahCicilan = new javax.swing.JTextField();
        inputPPN = new javax.swing.JTextField();
        inputCicilanPerBulan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        inputAgreeCheckBox = new javax.swing.JCheckBox();
        processButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setTitle("FORM PENJUALAN");

        jLabel1.setText("Harga Tanah");

        jLabel2.setText("Area");

        jLabel3.setText("Nama Pemesan");

        inputPriceLand.setEditable(false);
        inputPriceLand.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        inputPriceLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPriceLandActionPerformed(evt);
            }
        });

        inputAreaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "= PILIH =", "PERUMNAS", "PRESIDENT", "PERMAI" }));
        inputAreaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAreaComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/rumah/rumah.jpg"))); // NOI18N

        jLabel6.setText("Harga Bangunan");

        jLabel7.setText("Tipe Rumah");

        radioButton.add(t36RadioButton);
        t36RadioButton.setText("Tipe - 36");
        t36RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t36RadioButtonActionPerformed(evt);
            }
        });

        radioButton.add(t45RadioButton);
        t45RadioButton.setText("Tipe - 45");
        t45RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t45RadioButtonActionPerformed(evt);
            }
        });

        radioButton.add(t54RadioButton);
        t54RadioButton.setText("Tipe - 54");
        t54RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t54RadioButtonActionPerformed(evt);
            }
        });

        inputBuildingPrice.setEditable(false);
        inputBuildingPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setText("Luas Tanah Asli");

        inputLargeLand.setEditable(false);
        inputLargeLand.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel9.setText("Luas Tanah Tersedia");

        inputAvailableLand.setEditable(false);
        inputAvailableLand.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel10.setText("Harga");

        jLabel11.setText("DP");

        jLabel12.setText("Lama Cicil");

        jLabel13.setText("PPN (10%)");

        jLabel14.setText("Cicilan / Bulan");

        inputTotalPrice.setEditable(false);
        inputTotalPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        inputDP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        inputJumlahCicilan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        inputPPN.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        inputCicilanPerBulan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel15.setText("Bulan");

        inputAgreeCheckBox.setText("Setuju");
        inputAgreeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAgreeCheckBoxActionPerformed(evt);
            }
        });

        processButton.setText("PROSES");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        saveButton.setText("SIMPAN");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("HAPUS");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPriceLand, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputOrderName)
                                .addComponent(inputAreaComboBox, 0, 120, Short.MAX_VALUE)))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(processButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t36RadioButton)
                    .addComponent(t45RadioButton)
                    .addComponent(t54RadioButton)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputBuildingPrice)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(inputLargeLand)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputAvailableLand)
                            .addComponent(inputTotalPrice)
                            .addComponent(inputDP)
                            .addComponent(inputJumlahCicilan)
                            .addComponent(inputPPN)
                            .addComponent(inputCicilanPerBulan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(inputAgreeCheckBox)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputOrderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(inputBuildingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(inputPriceLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputAreaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t36RadioButton)))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputLargeLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t45RadioButton)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t54RadioButton)
                            .addComponent(inputAvailableLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(inputTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(inputDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(inputJumlahCicilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(inputPPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(inputCicilanPerBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputAgreeCheckBox))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processButton)
                    .addComponent(saveButton)
                    .addComponent(deleteButton))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputPriceLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPriceLandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPriceLandActionPerformed

    private void inputAreaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAreaComboBoxActionPerformed
        // TODO add your handling code here:
        switch(inputAreaComboBox.getSelectedIndex()){
            case 0:
                inputPriceLand.setText("");
                inputBuildingPrice.setText("");
                
                radioButton.clearSelection();
                inputLargeLand.setText("");
                inputTotalPrice.setText("");
                inputAvailableLand.setText("");
                inputDP.setText("");
                inputCicilanPerBulan.setText("");
                inputJumlahCicilan.setText("");
                inputPPN.setText("");
                inputAgreeCheckBox.setSelected(false);
                break;
            case 1:
                inputPriceLand.setText("500000");
                inputBuildingPrice.setText("90000000");
                
                radioButton.clearSelection();
                inputLargeLand.setText("");
                inputTotalPrice.setText("");
                inputAvailableLand.setText("");
                inputDP.setText("");
                inputCicilanPerBulan.setText("");
                inputJumlahCicilan.setText("");
                inputPPN.setText("");
                inputAgreeCheckBox.setSelected(false);
                break;
            case 2:
                inputPriceLand.setText("600000");
                inputBuildingPrice.setText("120000000");
                
                radioButton.clearSelection();
                inputLargeLand.setText("");
                inputTotalPrice.setText("");
                inputAvailableLand.setText("");
                inputDP.setText("");
                inputCicilanPerBulan.setText("");
                inputJumlahCicilan.setText("");
                inputPPN.setText("");
                inputAgreeCheckBox.setSelected(false);
                break;
            default:
                inputPriceLand.setText("700000");
                inputBuildingPrice.setText("150000000");
                
                radioButton.clearSelection();
                inputLargeLand.setText("");
                inputTotalPrice.setText("");
                inputAvailableLand.setText("");
                inputDP.setText("");
                inputCicilanPerBulan.setText("");
                inputJumlahCicilan.setText("");
                inputPPN.setText("");
                inputAgreeCheckBox.setSelected(false);
                break; 
        }
        
    }//GEN-LAST:event_inputAreaComboBoxActionPerformed

    private void t36RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t36RadioButtonActionPerformed
        // TODO add your handling code here:
        if(inputAreaComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Pilih Area Terlebih Dahulu");
            radioButton.clearSelection();
        } else {
            inputLargeLand.setText("90");
            inputAvailableLand.setText("54");
            long landPrice = Long.parseLong(inputPriceLand.getText()),
                    buildingPrice = Long.parseLong(inputBuildingPrice.getText()),
                    availableLand = Long.parseLong(inputAvailableLand.getText()),
                    totalPrice;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            inputTotalPrice.setText("" + totalPrice);
            
            inputDP.setText("");
            inputPPN.setText("");
            inputJumlahCicilan.setText("");
            inputCicilanPerBulan.setText("");
        }
    }//GEN-LAST:event_t36RadioButtonActionPerformed

    private void t45RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t45RadioButtonActionPerformed
        // TODO add your handling code here:
        if(inputAreaComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Pilih Area Terlebih Dahulu");
            radioButton.clearSelection();
        } else {
            inputLargeLand.setText("120");
            inputAvailableLand.setText("75");
            long landPrice = Long.parseLong(inputPriceLand.getText()),
                    buildingPrice = Long.parseLong(inputBuildingPrice.getText()),
                    availableLand = Long.parseLong(inputAvailableLand.getText()),
                    totalPrice;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            inputTotalPrice.setText("" + totalPrice);
            
            inputDP.setText("");
            inputPPN.setText("");
            inputJumlahCicilan.setText("");
            inputCicilanPerBulan.setText("");

        }
    }//GEN-LAST:event_t45RadioButtonActionPerformed

    private void t54RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t54RadioButtonActionPerformed
        // TODO add your handling code here:
        if(inputAreaComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Pilih Area Terlebih Dahulu");
            radioButton.clearSelection();
        } else {
            inputLargeLand.setText("140");
            inputAvailableLand.setText("86");
            long landPrice = Long.parseLong(inputPriceLand.getText()),
                    buildingPrice = Long.parseLong(inputBuildingPrice.getText()),
                    availableLand = Long.parseLong(inputAvailableLand.getText()),
                    totalPrice;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            inputTotalPrice.setText("" + totalPrice);
            
            inputDP.setText("");
            inputPPN.setText("");
            inputJumlahCicilan.setText("");
            inputCicilanPerBulan.setText("");
        }
    }//GEN-LAST:event_t54RadioButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        inputOrderName.setText("");
        inputPriceLand.setText("");
        inputBuildingPrice.setText("");
        inputLargeLand.setText("");
        inputTotalPrice.setText("");
        inputAvailableLand.setText("");
        inputDP.setText("");
        inputCicilanPerBulan.setText("");
        inputJumlahCicilan.setText("");
        inputPPN.setText("");
        inputAreaComboBox.setSelectedIndex(0);
        radioButton.clearSelection();
        inputAgreeCheckBox.setSelected(false);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        // TODO add your handling code here:
        if(inputTotalPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilihan Belum Lengkap");
        } else if(inputDP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "DP harus di isi");
        } else if(inputJumlahCicilan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Isi jumlah cicilan yang diinginkan");
        } else {
            long landPrice = Long.parseLong(inputPriceLand.getText()),
                    buildingPrice = Long.parseLong(inputBuildingPrice.getText()),
                    availableLand = Long.parseLong(inputAvailableLand.getText()),
                    dp = Long.parseLong(inputDP.getText()),
                    jumlahCicilan = Long.parseLong(inputJumlahCicilan.getText()),
                    totalPrice, ppn, CicilanPerBulan;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            ppn = totalPrice * 10 / 100;
            CicilanPerBulan = (totalPrice + ppn) / jumlahCicilan;
            inputPPN.setText("" + ppn);
            inputCicilanPerBulan.setText("" + CicilanPerBulan);
        }
    }//GEN-LAST:event_processButtonActionPerformed

    private void inputAgreeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAgreeCheckBoxActionPerformed
        // TODO add your handling code here:
        if(inputOrderName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama pemesan harus diisi");
            inputAgreeCheckBox.setSelected(false);
        } else if(inputPPN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tekan tombol proses terlebih dahulu");
            inputAgreeCheckBox.setSelected(false);
        } else if(inputAgreeCheckBox.isSelected() == true) {
            JOptionPane.showMessageDialog(null, "Pemesan menyetujui");
            inputAgreeCheckBox.setSelected(true);
        } else {
            JOptionPane.showMessageDialog(null, "Pesanan belum disetujui");
            inputAgreeCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_inputAgreeCheckBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if (inputAgreeCheckBox.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Klik Setuju Untuk Menyimpan Data", "Error ",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String typeHouse;
            if (t36RadioButton.isSelected()) {
                typeHouse = "TIPE 36";
            } else if(t45RadioButton.isSelected()) {
                typeHouse = "TIPE 45";
            } else {
                typeHouse = "TIPE 54";
            }
            
            try {
                String sql = "INSERT INTO rumah (name, area, tipe, luas, harga, jumlah_cicilan, cicilan_bulan) VALUES ('"
                        + inputOrderName.getText() + "', '"
                        + inputAreaComboBox.getSelectedItem() + "', '"
                        + typeHouse + "', '"
                        + inputLargeLand.getText() + "', '"
                        + inputTotalPrice.getText() + "', '"
                        + inputJumlahCicilan.getText() + "', '"
                        + inputCicilanPerBulan.getText() + "')";
                Connection conn = (Connection) ConnectionDb.connectDatabase();
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                
            } catch (SQLException ex) {
                Logger.getLogger(PaymentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            OptionMenu optionMenu = new OptionMenu();
            optionMenu.setVisible(true);
            this.getDesktopPane().add(optionMenu);
            this.dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JCheckBox inputAgreeCheckBox;
    private javax.swing.JComboBox<String> inputAreaComboBox;
    private javax.swing.JTextField inputAvailableLand;
    private javax.swing.JTextField inputBuildingPrice;
    private javax.swing.JTextField inputCicilanPerBulan;
    private javax.swing.JTextField inputDP;
    private javax.swing.JTextField inputJumlahCicilan;
    private javax.swing.JTextField inputLargeLand;
    private javax.swing.JTextField inputOrderName;
    private javax.swing.JTextField inputPPN;
    private javax.swing.JTextField inputPriceLand;
    private javax.swing.JTextField inputTotalPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton processButton;
    private javax.swing.ButtonGroup radioButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JRadioButton t36RadioButton;
    private javax.swing.JRadioButton t45RadioButton;
    private javax.swing.JRadioButton t54RadioButton;
    // End of variables declaration//GEN-END:variables
}
