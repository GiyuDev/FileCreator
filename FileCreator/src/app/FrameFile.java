/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author rejec
 */
public class FrameFile extends javax.swing.JFrame {

    /**
     * Creates new form FrameFile
     */
    
    private final JFileChooser fileChooser;
    
    public FrameFile() {
        initComponents();
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text file", "txt", "YAML file", "yml"));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnFile = new javax.swing.JButton();
        labelDirectory = new javax.swing.JLabel();
        txtFieldFile = new javax.swing.JTextField();
        txtFieldDirectory = new javax.swing.JTextField();
        labelFile = new javax.swing.JLabel();
        labelExampleDir = new javax.swing.JLabel();
        labelTextHere = new javax.swing.JLabel();
        btnOpenFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File creator");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtArea.setBackground(new java.awt.Color(140, 158, 185));
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFile.setText("Create file");
        btnFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFileMouseClicked(evt);
            }
        });

        labelDirectory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDirectory.setText("Directory to save the file:");

        txtFieldFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFileActionPerformed(evt);
            }
        });

        txtFieldDirectory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldDirectoryActionPerformed(evt);
            }
        });

        labelFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelFile.setText("Name of the file:");

        labelExampleDir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelExampleDir.setText("Example: C:\\\\Users\\\\user\\\\Directory\\\\");
            labelExampleDir.setToolTipText("");

            labelTextHere.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            labelTextHere.setText("Insert your text here:");

            btnOpenFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            btnOpenFile.setText("Open file");
            btnOpenFile.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnOpenFileMouseClicked(evt);
                }
            });
            btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnOpenFileActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelDirectory)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtFieldDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelExampleDir)
                                    .addGap(0, 136, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(labelFile)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtFieldFile, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(labelTextHere, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnFile)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnOpenFile)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDirectory)
                        .addComponent(txtFieldDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelExampleDir))
                    .addGap(34, 34, 34)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFieldFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelFile))
                    .addGap(37, 37, 37)
                    .addComponent(labelTextHere)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFile)
                        .addComponent(btnOpenFile))
                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFileMouseClicked
        if (this.txtArea.getText() != null && this.txtFieldDirectory.getText() != null && this.txtFieldFile.getText() != null){
            if (this.txtFieldDirectory.getText().contains("\\")) {
                File dir = new File(this.txtFieldDirectory.getText());
                if (!(dir.exists())){
                    if (dir.mkdir()){
                    }
                }
        
                File file = new File(this.txtFieldDirectory.getText() + "\\" + this.txtFieldFile.getText() + ".txt");
                if (!(file.exists())){
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, ex.toString());
                    }
                }
        
                try (FileWriter writer = new FileWriter(file.getAbsoluteFile())){
                    try (BufferedWriter buffer = new BufferedWriter(writer)) {
                        buffer.write(this.txtArea.getText());
                    }
                    JOptionPane.showMessageDialog(null, "Text correctly saved!");
                    this.txtArea.setText("");
                    this.txtFieldDirectory.setText("");
                    this.txtFieldFile.setText("");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please insert the name in the correctly way!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please insert all the information required!");
        }
    }//GEN-LAST:event_btnFileMouseClicked

    private void txtFieldDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldDirectoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldDirectoryActionPerformed

    private void txtFieldFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldFileActionPerformed

    private void btnOpenFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenFileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOpenFileMouseClicked

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                String file_path = fileChooser.getSelectedFile().getAbsolutePath();
                String content = new String(Files.readAllBytes(Paths.get(file_path)));
                txtArea.setText(content);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a file!");
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed

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
            java.util.logging.Logger.getLogger(FrameFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDirectory;
    private javax.swing.JLabel labelExampleDir;
    private javax.swing.JLabel labelFile;
    private javax.swing.JLabel labelTextHere;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtFieldDirectory;
    private javax.swing.JTextField txtFieldFile;
    // End of variables declaration//GEN-END:variables
}
