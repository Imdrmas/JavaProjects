/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myform1;

import java.awt.Color;

/**
 *
 * @author drmas
 */
public class frm2 extends javax.swing.JFrame {

    /**
     * Creates new form frm2
     */
    public frm2() {
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

        pnl = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        red = new javax.swing.JButton();
        green = new javax.swing.JButton();
        yellow = new javax.swing.JButton();
        orange = new javax.swing.JButton();
        blue = new javax.swing.JButton();
        black = new javax.swing.JButton();
        maron = new javax.swing.JButton();
        gray = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        btnName = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        red.setText("Red");
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });
        jToolBar1.add(red);

        green.setText("Green");
        green.setFocusable(false);
        green.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        green.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });
        jToolBar1.add(green);

        yellow.setText("Yellow");
        yellow.setFocusable(false);
        yellow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        yellow.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });
        jToolBar1.add(yellow);

        orange.setText("Orange");
        orange.setFocusable(false);
        orange.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        orange.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeActionPerformed(evt);
            }
        });
        jToolBar1.add(orange);

        blue.setText("Blue");
        blue.setFocusable(false);
        blue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blue.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueActionPerformed(evt);
            }
        });
        jToolBar1.add(blue);

        black.setText("Black");
        black.setFocusable(false);
        black.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        black.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });
        jToolBar1.add(black);

        maron.setText("Maron");
        maron.setFocusable(false);
        maron.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        maron.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        maron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maronActionPerformed(evt);
            }
        });
        jToolBar1.add(maron);

        gray.setText("Gray");
        gray.setFocusable(false);
        gray.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gray.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayActionPerformed(evt);
            }
        });
        jToolBar1.add(gray);

        btnName.setText("Ok");
        btnName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName)
                    .addComponent(btnName, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnName)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        lblMsg.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(153, 0, 102));
        lblMsg.setText("---");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jSplitPane1)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pnl.setBackground(Color.white);
    }//GEN-LAST:event_formWindowOpened

    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
       pnl.setBackground(Color.red);
    }//GEN-LAST:event_redActionPerformed

    private void greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenActionPerformed
      pnl.setBackground(Color.green);
    }//GEN-LAST:event_greenActionPerformed

    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
      pnl.setBackground(Color.YELLOW);
    }//GEN-LAST:event_yellowActionPerformed

    private void orangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeActionPerformed
      pnl.setBackground(Color.ORANGE);
    }//GEN-LAST:event_orangeActionPerformed

    private void blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueActionPerformed
      pnl.setBackground(Color.BLUE);
    }//GEN-LAST:event_blueActionPerformed

    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
      pnl.setBackground(Color.BLACK);
    }//GEN-LAST:event_blackActionPerformed

    private void maronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maronActionPerformed
      pnl.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_maronActionPerformed

    private void grayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayActionPerformed
      pnl.setBackground(Color.GRAY);
    }//GEN-LAST:event_grayActionPerformed

    private void btnNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameActionPerformed
        lblMsg.setText("Hello " + txtName.getText());
    }//GEN-LAST:event_btnNameActionPerformed

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
            java.util.logging.Logger.getLogger(frm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton black;
    private javax.swing.JButton blue;
    private javax.swing.JButton btnName;
    private javax.swing.JButton gray;
    private javax.swing.JButton green;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JButton maron;
    private javax.swing.JButton orange;
    private javax.swing.JPanel pnl;
    private javax.swing.JButton red;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton yellow;
    // End of variables declaration//GEN-END:variables
}