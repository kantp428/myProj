/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.*;
import java.io.*;

/**
 *
 * @author This pc
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form FileFrame
     */
    public Main() {
        initComponents();
        fc.setMultiSelectionEnabled(true);
        fc.setCurrentDirectory(new File("C:\\"));
        
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InputPanel = new javax.swing.JPanel();
        fileLb = new javax.swing.JLabel();
        filePathLb = new javax.swing.JLabel();
        chooseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InputPanel.setBackground(new java.awt.Color(255, 255, 255));

        fileLb.setFont(new java.awt.Font("TH Krub", 0, 24)); // NOI18N
        fileLb.setText("File:");

        filePathLb.setFont(new java.awt.Font("TH Krub", 0, 24)); // NOI18N
        filePathLb.setText("C:\\\\");

            chooseButton.setFont(new java.awt.Font("TH Krub", 0, 18)); // NOI18N
            chooseButton.setText("choose file");
            chooseButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    chooseButtonMouseClicked(evt);
                }
            });

            javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
            InputPanel.setLayout(InputPanelLayout);
            InputPanelLayout.setHorizontalGroup(
                InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InputPanelLayout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chooseButton)
                        .addGroup(InputPanelLayout.createSequentialGroup()
                            .addComponent(fileLb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(filePathLb, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(33, Short.MAX_VALUE))
            );
            InputPanelLayout.setVerticalGroup(
                InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPanelLayout.createSequentialGroup()
                    .addContainerGap(344, Short.MAX_VALUE)
                    .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fileLb)
                        .addComponent(filePathLb))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(chooseButton)
                    .addGap(101, 101, 101))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 440, Short.MAX_VALUE)
                    .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(InputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void chooseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseButtonMouseClicked
        // TODO add your handling code here:
        int returnVal = fc.showDialog(this, "Choose");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            filePathLb.setText(file.getPath()+"");
        }
    }//GEN-LAST:event_chooseButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    JFileChooser fc = new JFileChooser();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InputPanel;
    private javax.swing.JButton chooseButton;
    private javax.swing.JLabel fileLb;
    private javax.swing.JLabel filePathLb;
    // End of variables declaration//GEN-END:variables
}
