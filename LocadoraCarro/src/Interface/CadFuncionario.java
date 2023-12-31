/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Color;

/**
 *
 * @author dmc
 */
public class CadFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadFuncionario
     */
    public CadFuncionario() {
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

        jLabel2 = new javax.swing.JLabel();
        CodFun = new javax.swing.JTextField();
        NomeFun = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro novo funcionário");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1039, 661));
        setSize(new java.awt.Dimension(0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Logo.png"))); // NOI18N

        CodFun.setForeground(new java.awt.Color(204, 204, 204));
        CodFun.setText("Código Funcionário");
        CodFun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CodFunFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CodFunFocusLost(evt);
            }
        });

        NomeFun.setText("Nome do Funcionário");
        NomeFun.setCaretColor(new java.awt.Color(153, 153, 153));
        NomeFun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NomeFunFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NomeFunFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(353, 353, 353))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(CodFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(NomeFun, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(CodFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodFunFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CodFunFocusGained
       if (CodFun.getText(). equals("Código Funcionário")) {
            CodFun.setText("");
            CodFun.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_CodFunFocusGained
    }
    private void CodFunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CodFunFocusLost
        if (CodFun.getText(). equals("")) {
            CodFun.setText("Código Funcionário");
            CodFun.setForeground(new Color(153,153,153));
    }     
    }//GEN-LAST:event_CodFunFocusLost

    private void NomeFunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NomeFunFocusLost
        if (NomeFun.getText(). equals("")) {
            NomeFun.setText("Nome do funcionário");
            NomeFun.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_NomeFunFocusLost
    }
    
    private void NomeFunFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NomeFunFocusGained
        if (NomeFun.getText(). equals("Nome do Funcionário")) {
            NomeFun.setText("");
            NomeFun.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_NomeFunFocusGained
    }
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
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodFun;
    private javax.swing.JTextField NomeFun;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
