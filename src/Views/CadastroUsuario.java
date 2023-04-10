/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controllers.CadastroUsuarioController;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author tulio
 */
public class CadastroUsuario extends javax.swing.JFrame {

    private final CadastroUsuarioController controller;

    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
        initComponents();
        
        controller = new CadastroUsuarioController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCpfUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLoginUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCadastraUsuario = new javax.swing.JButton();
        btnRemoverUsuario = new javax.swing.JButton();
        passSenhaUsuario = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Id: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 340, -1));

        jLabel2.setText("Nome: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        getContentPane().add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 340, -1));

        jLabel3.setText("Cpf:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(txtCpfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 340, -1));

        jLabel4.setText("Login: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        getContentPane().add(txtLoginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 340, -1));

        jLabel5.setText("Senha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        btnCadastraUsuario.setText("Cadastrar ");
        btnCadastraUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastraUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 270, 140, -1));

        btnRemoverUsuario.setText("Remover Existente");
        btnRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoverUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));
        getContentPane().add(passSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 340, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Images/locadora_1.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 450));

        setSize(new java.awt.Dimension(449, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioActionPerformed

    private void btnCadastraUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraUsuarioActionPerformed
        controller.cadastraUsuario();
    }//GEN-LAST:event_btnCadastraUsuarioActionPerformed

    private void btnRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverUsuarioActionPerformed
        controller.removerUsuario();
    }//GEN-LAST:event_btnRemoverUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
        
        
    }

    public JTextField getTxtCpfUsuario() {
        return txtCpfUsuario;
    }

    public void setTxtCpfUsuario(JTextField txtCpfUsuario) {
        this.txtCpfUsuario = txtCpfUsuario;
    }

    public JTextField getTxtIdUsuario() {
        return txtIdUsuario;
    }

    public void setTxtIdUsuario(JTextField txtIdUsuario) {
        this.txtIdUsuario = txtIdUsuario;
    }

    public JTextField getTxtLoginUsuario() {
        return txtLoginUsuario;
    }

    public void setTxtLoginUsuario(JTextField txtLoginUsuario) {
        this.txtLoginUsuario = txtLoginUsuario;
    }

    public JTextField getTxtNomeUsuario() {
        return txtNomeUsuario;
    }

    public void setTxtNomeUsuario(JTextField txtNomeUsuario) {
        this.txtNomeUsuario = txtNomeUsuario;
    }

    public JPasswordField getPassSenhaUsuario() {
        return passSenhaUsuario;
    }

    public void setPassSenhaUsuario(JPasswordField passSenhaUsuario) {
        this.passSenhaUsuario = passSenhaUsuario;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastraUsuario;
    private javax.swing.JButton btnRemoverUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passSenhaUsuario;
    private javax.swing.JTextField txtCpfUsuario;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtLoginUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
