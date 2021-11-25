/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.uno;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aditya
 */
public class AddPlayerNames extends javax.swing.JFrame {
    public ArrayList<String> playerIds;

    /**
     * Creates new form AddPlayerNames
     */
    public AddPlayerNames() {
        initComponents();
        playerIds = new ArrayList<>();
    }
    
    public String[] getPids(){
        String[] pids = playerIds.toArray(new String[playerIds.size()]);
        return pids;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        pidTextBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pid1 = new javax.swing.JLabel();
        pid2 = new javax.swing.JLabel();
        pid3 = new javax.swing.JLabel();
        pid4 = new javax.swing.JLabel();
        pid5 = new javax.swing.JLabel();
        pid6 = new javax.swing.JLabel();
        pid7 = new javax.swing.JLabel();
        pid8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setText("Add the names of the players :");

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        doneButton.setText("Let's Play! ");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        pidTextBox.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        pidTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidTextBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setText("Enter Name:");

        pid1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        pid2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        pid3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        pid4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        pid5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        pid6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        pid7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        pid8.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244)
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pid5, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pid6, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pid7, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(pid3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pid4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pid8, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGap(2, 2, 2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pidTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pidTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pid1)
                    .addComponent(pid2)
                    .addComponent(pid3)
                    .addComponent(pid4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pid5)
                    .addComponent(pid6)
                    .addComponent(pid7)
                    .addComponent(pid8))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if(pidTextBox.getText().isBlank()){
            JLabel message = new JLabel("Please enter a name!");
            message.setFont(new Font("Arial", Font.BOLD, 48));
            JOptionPane.showMessageDialog(null,message);
        }
        else{
            String name = pidTextBox.getText().trim();
            playerIds.add(name);
            
            if(playerIds.size() == 1){
                pid1.setText(playerIds.get(0));
            }
            else if(playerIds.size() == 2){
                pid1.setText(playerIds.get(0));
                pid2.setText(playerIds.get(1));
            }
            else if(playerIds.size() == 3){
                pid1.setText(playerIds.get(0));
                pid2.setText(playerIds.get(1));
                pid3.setText(playerIds.get(2));
            }
            else if(playerIds.size() == 4){
                pid1.setText(playerIds.get(0));
                pid2.setText(playerIds.get(1));
                pid3.setText(playerIds.get(2));
                pid4.setText(playerIds.get(3));
            }
            else if(playerIds.size() == 5){
                pid1.setText(playerIds.get(0));
                pid2.setText(playerIds.get(1));
                pid3.setText(playerIds.get(2));
                pid4.setText(playerIds.get(3));
                pid5.setText(playerIds.get(4));
            }
            else if(playerIds.size() == 6){
                pid1.setText(playerIds.get(0));
                pid2.setText(playerIds.get(1));
                pid3.setText(playerIds.get(2));
                pid4.setText(playerIds.get(3));
                pid5.setText(playerIds.get(4));
                pid6.setText(playerIds.get(5));
            }
            else if(playerIds.size() == 7){
                pid1.setText(playerIds.get(0));
                pid2.setText(playerIds.get(1));
                pid3.setText(playerIds.get(2));
                pid4.setText(playerIds.get(3));
                pid5.setText(playerIds.get(4));
                pid6.setText(playerIds.get(5));
                pid7.setText(playerIds.get(6));
            }
            else if(playerIds.size() == 8){
                pid1.setText(playerIds.get(0));
                pid2.setText(playerIds.get(1));
                pid3.setText(playerIds.get(2));
                pid4.setText(playerIds.get(3));
                pid5.setText(playerIds.get(4));
                pid6.setText(playerIds.get(5));
                pid7.setText(playerIds.get(6));
                pid8.setText(playerIds.get(7));
            }

            if(playerIds.size()>0 && playerIds.size()<9){
                JLabel message = new JLabel("Saved successfully!");
                message.setFont(new Font("Arial", Font.BOLD, 48));
                JOptionPane.showMessageDialog(null,message);
                pidTextBox.setText("");
            }

            if (playerIds.size() == 9){
                playerIds.remove(name);
                JLabel message = new JLabel("There can only be 2-8 players!");
                message.setFont(new Font("Arial", Font.BOLD, 48));
                JOptionPane.showMessageDialog(null,message);
                pidTextBox.setText("");
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        if (playerIds.size() < 2){
                JLabel message = new JLabel("There must be atleast 2 players");
                message.setFont(new Font("Arial", Font.BOLD, 48));
                JOptionPane.showMessageDialog(null,message);
            
        }
        
        else{
            this.dispose();
            new GameWindow(playerIds).setVisible(true);
        }
        
    }//GEN-LAST:event_doneButtonActionPerformed

    private void pidTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidTextBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AddPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPlayerNames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pid1;
    private javax.swing.JLabel pid2;
    private javax.swing.JLabel pid3;
    private javax.swing.JLabel pid4;
    private javax.swing.JLabel pid5;
    private javax.swing.JLabel pid6;
    private javax.swing.JLabel pid7;
    private javax.swing.JLabel pid8;
    private javax.swing.JTextField pidTextBox;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}