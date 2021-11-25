/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.uno;

import com.mycompany.uno.Game.*;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JButton;

/**
 *
 * @author Aditya
 */
public class PopUp extends javax.swing.JFrame {
    
    String cardImage = "";
    Game game;
    ArrayList<Card> playerHand;
    int choice;
    ArrayList<JButton> cardButtons;
    GameWindow GameWindow;
    JButton topCardButton;
    Card.Color declaredColor;

    /**
     * Creates new form PopUp
     */
    public PopUp(){};
    
    public PopUp(String cardName, Game game, int index, ArrayList<JButton> cardButtons,  GameWindow GameWindow, JButton topCardButton) {
        initComponents();
        cardImage = cardName;
        this.game = game;
        playerHand = game.getPlayerHand(game.getpresPlayer());
        choice = index;
        this.cardButtons = cardButtons;
//        cardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGs/large"+cardImage+".png")));
        cardLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aditya\\Desktop\\images\\PNGs\\large\\"+cardImage+".png"));
        this.GameWindow = GameWindow;
        this.topCardButton = topCardButton;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        useCardButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        cardLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        useCardButton.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        useCardButton.setText("Use Card");
        useCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useCardButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        cardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(useCardButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(cardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(cardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useCardButtonActionPerformed
        
        PickColorFrame pickColor = new PickColorFrame(this);
        declaredColor = pickColor.choseColor(playerHand.get(choice));
        
        if(declaredColor != null){
            try{
                game.submitPlayerCard(game.getpresPlayer(), playerHand.get(choice), declaredColor);
            }
            catch(InvalidColorSubmissionException ex){
                Logger.getLogger(PopUp.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
            catch(InvalidValueSubmissionException ex){
                Logger.getLogger(PopUp.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
            catch(InvalidPlayerTurnException ex){
                Logger.getLogger(PopUp.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
            this.revalidate();
            if(declaredColor != Card.Color.Wild){
                GameWindow.setPidName(game.getpresPlayer());
                GameWindow.setButtonIcons();
//                topCardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNGs/small/"+game.getTopCardImage())));
                topCardButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aditya\\Desktop\\images\\PNGs\\small\\"+game.getTopCardImage()));

                this.dispose();
            }
            
        }
    }//GEN-LAST:event_useCardButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cardLabel;
    private javax.swing.JButton useCardButton;
    // End of variables declaration//GEN-END:variables
}