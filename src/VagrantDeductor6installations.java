/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author olymer
 */
public class VagrantDeductor6installations extends javax.swing.JFrame {

    public boolean tbtnGuiToggled;
    /**
     * Creates new form VagrantDeductor
     */
    public VagrantDeductor6installations() {
        initComponents();
        tbtnGuiToggled = false;
        ifInfobox.setVisible(false);
        /*
        if (Global.guimodeHistory) {
            tbtnGui.setText("ON");
            tbtnForwardedToggled = true;
        } else {
            tbtnGui.setText("OFF");
            tbtnForwardedToggled = false;
        }
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        tbtnGui = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        ifInfobox = new javax.swing.JInternalFrame();
        lblInfobox = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel3.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 60, 60));

        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 60, 60));

        tbtnGui.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        tbtnGui.setText("OFF");
        tbtnGui.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbtnGuiStateChanged(evt);
            }
        });
        tbtnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnGuiActionPerformed(evt);
            }
        });
        jPanel3.add(tbtnGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, 200));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("GUI mode");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        ifInfobox.setClosable(true);
        ifInfobox.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ifInfobox.setTitle("VagrantDestructor");
        ifInfobox.setVisible(false);

        lblInfobox.setText(" ");

        org.jdesktop.layout.GroupLayout ifInfoboxLayout = new org.jdesktop.layout.GroupLayout(ifInfobox.getContentPane());
        ifInfobox.getContentPane().setLayout(ifInfoboxLayout);
        ifInfoboxLayout.setHorizontalGroup(
            ifInfoboxLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ifInfoboxLayout.createSequentialGroup()
                .addContainerGap()
                .add(lblInfobox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 266, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        ifInfoboxLayout.setVerticalGroup(
            ifInfoboxLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ifInfoboxLayout.createSequentialGroup()
                .add(27, 27, 27)
                .add(lblInfobox)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel3.add(ifInfobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 130));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("6/7");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel11.setText(":..");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new VagrantDeductor5installations().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // goto next step
        if (tbtnGui.getText().equals("ON")) {
            Global.gui ="config.vm.boot_mode = :gui";
            Global.guimodeHistory = true;
            new VagrantDeductor7installations().setVisible(true);
            this.setVisible(false);
            this.disable();
            Global.log7 = "GUI mode: enabled";
            
        } else {
            Global.gui ="# config.vm.boot_mode = :gui";
            Global.guimodeHistory = false;
            new VagrantDeductor7installations().setVisible(true);
            this.setVisible(false);
            this.disable();
            Global.log7 = "GUI mode: disabled";
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void tbtnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnGuiActionPerformed
        // Button toggled
        if (tbtnGuiToggled) {
            Global.gui ="# config.vm.boot_mode = :gui";
            tbtnGuiToggled = false;
            tbtnGui.setText("OFF");
        } else {
            Global.gui ="config.vm.boot_mode = :gui";
            tbtnGuiToggled = true;
            tbtnGui.setText("ON");
        }
    }//GEN-LAST:event_tbtnGuiActionPerformed

    private void tbtnGuiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbtnGuiStateChanged

    }//GEN-LAST:event_tbtnGuiStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VagrantDeductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VagrantDeductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VagrantDeductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VagrantDeductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VagrantDeductor1installations().setVisible(false);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JInternalFrame ifInfobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblInfobox;
    private javax.swing.JToggleButton tbtnGui;
    // End of variables declaration//GEN-END:variables
}
