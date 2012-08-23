
import java.io.File;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olymer
 */
public class VagrantDeductor4installations extends javax.swing.JFrame {

    public boolean tbtnSSHToggled;
    /**
     * Creates new form VagrantDeductor
     */
    public VagrantDeductor4installations() {
        initComponents();
        tbtnSSHToggled = false;
        ifInfobox.setVisible(false);
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
        ifInfobox = new javax.swing.JInternalFrame();
        lblInfobox = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbtnSSH = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel1.setText("Copy SSH key");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("4/7");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel4.setText(":..");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        tbtnSSH.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        tbtnSSH.setText("OFF");
        tbtnSSH.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbtnSSHStateChanged(evt);
            }
        });
        tbtnSSH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnSSHActionPerformed(evt);
            }
        });
        jPanel3.add(tbtnSSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, 200));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("not implemented yet");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 60));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // goto next step
        if (tbtnSSH.getText().equals("ON")) {
            
            Global.ssh =     "# If to not ask everytime\n"
    + "first = ARGV\n"
    + "up_array = Array[ \"up\" ]\n"

    + "if first == up_array\n"

    +  "puts \"Please enter your ssh password (your ssh-key will be cloned to the box)\"\n"

    +  "system \"stty -echo\"\n" 

    +  "chef.json.merge!( :ssh_key =>\n" 
    +  "                  {\n"
    +  "                          :private => File.read(ENV['HOME']+'/.ssh/id_rsa'),\n"
    +  "                          :public => File.read(ENV['HOME']+'/.ssh/id_rsa.pub'),\n"
    +  "                         :password => STDIN.gets.chomp\n"
    +  "                  })\n"
    +  "# p chef.json[:ssh_key][:password]\n" 
    +  "system \"stty echo\"\n"
    +"end\n";
            Global.sshHistory = true;
            new VagrantDeductor5installations().setVisible(true);
            this.setVisible(false);
            this.disable();
            Global.log8 = "SSH key: will be copied";
            
        } else {
            Global.ssh ="";
            Global.sshHistory = false;
            new VagrantDeductor5installations().setVisible(true);
            this.setVisible(false);
            this.disable();
            Global.log8 = "SSH key: won't be copied";
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new VagrantDeductor3installations().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tbtnSSHStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbtnSSHStateChanged

   }//GEN-LAST:event_tbtnSSHStateChanged

    private void tbtnSSHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnSSHActionPerformed
        // Button toggled
        if (tbtnSSHToggled) {
            Global.gui = "# config.vm.boot_mode = :gui";
            tbtnSSHToggled = false;
            tbtnSSH.setText("OFF");
        } else {
            Global.gui = "config.vm.boot_mode = :gui";
            tbtnSSHToggled = true;
            tbtnSSH.setText("ON");
        }
    }//GEN-LAST:event_tbtnSSHActionPerformed

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
                new VagrantDeductor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JInternalFrame ifInfobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblInfobox;
    private javax.swing.JToggleButton tbtnSSH;
    // End of variables declaration//GEN-END:variables
}