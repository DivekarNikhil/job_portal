/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job_portal_system;

/**
 *
 * @author ABHINAV KATHURI
 */
public class main_screen extends javax.swing.JFrame {

    /**
     * Creates new form main_screen
     */
    public main_screen() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        regjsbutton = new javax.swing.JMenuItem();
        loginjsbutton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        regcbutton = new javax.swing.JMenuItem();
        logincbutton = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        loginabutton = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to the Job Portal System");

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenu1.setText("Job Seeker");

        regjsbutton.setText("Register Job Seeker");
        regjsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regjsbuttonActionPerformed(evt);
            }
        });
        jMenu1.add(regjsbutton);

        loginjsbutton.setText("Login Job Seeker");
        loginjsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjsbuttonActionPerformed(evt);
            }
        });
        jMenu1.add(loginjsbutton);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Company");

        regcbutton.setText("Register Company");
        regcbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcbuttonActionPerformed(evt);
            }
        });
        jMenu2.add(regcbutton);

        logincbutton.setText("Login Company");
        logincbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logincbuttonActionPerformed(evt);
            }
        });
        jMenu2.add(logincbutton);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Admin");

        loginabutton.setText("Login Admin");
        loginabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginabuttonActionPerformed(evt);
            }
        });
        jMenu3.add(loginabutton);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regjsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regjsbuttonActionPerformed
        // TODO add your handling code here:
        regjobseeker c = new regjobseeker();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_regjsbuttonActionPerformed

    private void loginjsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjsbuttonActionPerformed
        // TODO add your handling code here:
        loginjobseeker c = new loginjobseeker();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_loginjsbuttonActionPerformed

    private void regcbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcbuttonActionPerformed
        // TODO add your handling code here:
        regcompany c = new regcompany();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_regcbuttonActionPerformed

    private void logincbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logincbuttonActionPerformed
        // TODO add your handling code here:
        logincompany l = new logincompany();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_logincbuttonActionPerformed

    private void loginabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginabuttonActionPerformed
        // TODO add your handling code here:
        loginadmin l = new loginadmin();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_loginabuttonActionPerformed

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
            java.util.logging.Logger.getLogger(main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem loginabutton;
    private javax.swing.JMenuItem logincbutton;
    private javax.swing.JMenuItem loginjsbutton;
    private javax.swing.JMenuItem regcbutton;
    private javax.swing.JMenuItem regjsbutton;
    // End of variables declaration//GEN-END:variables
}