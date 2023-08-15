/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crudlp;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juliano
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
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

        lblTitulo = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();
        lblnome = new javax.swing.JLabel();
        lclcpf = new javax.swing.JLabel();
        lblnascimento = new javax.swing.JLabel();
        lblaltura = new javax.swing.JLabel();
        lblpeso = new javax.swing.JLabel();
        lblimc = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtcpf = new javax.swing.JTextField();
        txtnascimento = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        txtimc = new javax.swing.JTextField();
        btncalcular = new javax.swing.JButton();
        lblregistro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblregistro = new javax.swing.JTable();
        btninserir = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Cálculo de IMC");

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCadastrar.setText("Cadastrar");

        lblnome.setText("Nome");

        lclcpf.setText("CPF");

        lblnascimento.setText("Nascimento");

        lblaltura.setText("Altura");

        lblpeso.setText("Peso");

        lblimc.setText("IMC");

        btncalcular.setText("Calcular IMC");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        lblregistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblregistro.setText("Registro");

        tblregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF ", "Nascimento", "Altura", "Peso", "IMC"
            }
        ));
        jScrollPane1.setViewportView(tblregistro);

        btninserir.setText("Inserir");
        btninserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninserirActionPerformed(evt);
            }
        });

        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnatualizar.setText("Atualizar");
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });

        btnlimpar.setText("Limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btninserir, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblnome)
                                .addGap(93, 93, 93)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lclcpf)
                                .addGap(93, 93, 93)
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblpeso)
                                    .addComponent(lblnascimento))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblaltura)
                                .addGap(93, 93, 93)
                                .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblimc)
                                .addGap(94, 94, 94)
                                .addComponent(txtimc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblCadastrar))
                    .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblregistro)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnexcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadastrar)
                    .addComponent(lblregistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnome)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lclcpf)
                            .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnascimento)
                            .addComponent(txtnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblaltura)
                            .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpeso)
                            .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncalcular)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtimc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimc))
                        .addGap(5, 5, 5)
                        .addComponent(btninserir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpar)
                    .addComponent(btnexcluir)
                    .addComponent(btnatualizar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        lblCadastrar.getAccessibleContext().setAccessibleName("Cadastrar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
      String strAltura = txtaltura.getText();
      String strPeso = txtpeso.getText();
      
      double a1 = Double.valueOf(strAltura).doubleValue();
      double p1  = Double.valueOf(strPeso).doubleValue();
      
      double imc = ( p1 / (a1 * a1));
      String strResultado = Double.toString(imc);
      txtimc.setText(strResultado);
      
     
      
      
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btninserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninserirActionPerformed
      DefaultTableModel tbl = (DefaultTableModel)tblregistro.getModel();
           tbl.addRow(new Object[]{txtnome.getText(), txtcpf.getText(), txtnascimento.getText(), txtaltura.getText(), txtpeso.getText(),txtimc.getText()});
      
    }//GEN-LAST:event_btninserirActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
      DefaultTableModel tbl = (DefaultTableModel)tblregistro.getModel();
      
            int SelectedRowIndex = tblregistro.getSelectedRow();
            tbl.removeRow(SelectedRowIndex);
        
        
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        DefaultTableModel tbl = (DefaultTableModel)tblregistro.getModel();
      
            int SelectedRowIndex = tblregistro.getSelectedRow();
            
            String nnome = tbl.getValueAt(SelectedRowIndex, 0).toString();
            String ncpf = tbl.getValueAt(SelectedRowIndex, 0).toString();
            String nnascimento = tbl.getValueAt(SelectedRowIndex, 0).toString();
            String naltura = tbl.getValueAt(SelectedRowIndex, 0).toString();
            String npeso = tbl.getValueAt(SelectedRowIndex, 0).toString();
            String nimc = tbl.getValueAt(SelectedRowIndex, 0).toString();
            
            String Novonome = JOptionPane.showInputDialog(null, "Digite o novo nome", nnome);
            String Novocpf = JOptionPane.showInputDialog(null, "Digite o novo cpf", ncpf);
            String Novonascimento = JOptionPane.showInputDialog(null, "Digite o novo nascimento", nnascimento);
            String Novoaltura = JOptionPane.showInputDialog(null, "Digite o novo altura", naltura);
            String Novopeso = JOptionPane.showInputDialog(null, "Digite o novo peso", npeso);
            String Novoimc = JOptionPane.showInputDialog(null, "Digite o novo imc", nimc);
            
            tbl.setValueAt(Novonome, SelectedRowIndex, 0);
            tbl.setValueAt(Novocpf, SelectedRowIndex, 1);
            tbl.setValueAt(Novonascimento, SelectedRowIndex, 2);
            tbl.setValueAt(Novoaltura, SelectedRowIndex, 3);
            tbl.setValueAt(Novopeso, SelectedRowIndex, 4);
            tbl.setValueAt(Novoimc, SelectedRowIndex, 5);
        
    }//GEN-LAST:event_btnatualizarActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        txtnome.setText("");
        txtcpf.setText("");
        txtnascimento.setText("");
        txtaltura.setText("");
        txtpeso.setText("");
        txtimc.setText("");
        
        
    }//GEN-LAST:event_btnlimparActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btninserir;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblaltura;
    private javax.swing.JLabel lblimc;
    private javax.swing.JLabel lblnascimento;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblpeso;
    private javax.swing.JLabel lblregistro;
    private javax.swing.JLabel lclcpf;
    private javax.swing.JTable tblregistro;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtimc;
    private javax.swing.JTextField txtnascimento;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
