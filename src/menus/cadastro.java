/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menus;

import fazendinha.Animais;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan Diniz
 */
public class cadastro extends javax.swing.JFrame {

    /**
     * Creates new form cadastro
     */
    public cadastro() {
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

        id_cadastro = new javax.swing.JFormattedTextField();
        nome_cadastro = new javax.swing.JFormattedTextField();
        raca_cadastro = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        cadastrar_animal = new javax.swing.JButton();
        sexo_cadastro = new javax.swing.JComboBox<>();
        categoria_cadastro = new javax.swing.JComboBox<>();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        peso_cadastro = new javax.swing.JFormattedTextField();
        voltar_cadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TELA DE CADASTRO");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        id_cadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        id_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(id_cadastro);
        id_cadastro.setBounds(80, 230, 80, 22);

        nome_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_cadastroActionPerformed(evt);
            }
        });
        nome_cadastro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nome_cadastroPropertyChange(evt);
            }
        });
        getContentPane().add(nome_cadastro);
        nome_cadastro.setBounds(80, 110, 160, 22);

        raca_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raca_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(raca_cadastro);
        raca_cadastro.setBounds(80, 140, 160, 22);

        jFormattedTextField4.setEditable(false);
        jFormattedTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFormattedTextField4.setText("RACA");
        jFormattedTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField4);
        jFormattedTextField4.setBounds(20, 140, 50, 22);

        cadastrar_animal.setText("CADASTRAR");
        cadastrar_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_animalActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar_animal);
        cadastrar_animal.setBounds(290, 260, 110, 23);

        sexo_cadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Femea" }));
        sexo_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexo_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(sexo_cadastro);
        sexo_cadastro.setBounds(80, 170, 80, 22);

        categoria_cadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bovino", "Equino", "Suino", "Aves" }));
        categoria_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(categoria_cadastro);
        categoria_cadastro.setBounds(110, 80, 72, 22);

        jFormattedTextField5.setEditable(false);
        jFormattedTextField5.setText("ID");
        jFormattedTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField5);
        jFormattedTextField5.setBounds(20, 230, 50, 22);

        jFormattedTextField6.setEditable(false);
        jFormattedTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFormattedTextField6.setText("CATEGORIA");
        jFormattedTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField6);
        jFormattedTextField6.setBounds(20, 80, 80, 22);

        jFormattedTextField7.setEditable(false);
        jFormattedTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFormattedTextField7.setText("NOME");
        jFormattedTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField7);
        jFormattedTextField7.setBounds(20, 110, 50, 22);

        jFormattedTextField8.setEditable(false);
        jFormattedTextField8.setText("SEXO");
        jFormattedTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField8);
        jFormattedTextField8.setBounds(20, 170, 50, 22);

        jFormattedTextField9.setEditable(false);
        jFormattedTextField9.setText("PESO");
        jFormattedTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField9);
        jFormattedTextField9.setBounds(20, 200, 50, 22);

        peso_cadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        peso_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(peso_cadastro);
        peso_cadastro.setBounds(80, 200, 80, 22);

        voltar_cadastro.setText("VOLTAR");
        voltar_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(voltar_cadastro);
        voltar_cadastro.setBounds(190, 260, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 520, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_cadastroActionPerformed

    private void nome_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_cadastroActionPerformed


// TODO add your handling code here:
       
    }//GEN-LAST:event_nome_cadastroActionPerformed

    private void raca_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raca_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raca_cadastroActionPerformed

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField4ActionPerformed

    private void sexo_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexo_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexo_cadastroActionPerformed

    private void jFormattedTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField5ActionPerformed

    private void categoria_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoria_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoria_cadastroActionPerformed

    private void cadastrar_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_animalActionPerformed
            
            String jdbcUrl = "jdbc:mysql://localhost:3306/fazenda?serverTimezone=America/Sao_Paulo";
            String username = "root";
            String password = "root";
     
            try (Scanner teclado = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            
            String tabela = "fazenda.animais";
            
            String categoria=(String) categoria_cadastro.getSelectedItem();
            String nome=nome_cadastro.getText();
            String raca=raca_cadastro.getText();
            String sexo=(String) sexo_cadastro.getSelectedItem();
            double peso=Double.parseDouble(peso_cadastro.getText().replace(",", "."));
            int id=Integer.parseInt(id_cadastro.getText());
            
            if(peso<=0||nome.trim().isEmpty() || raca.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos com valores validos ");
            }
            else{    
        
        Animais animal = new Animais (id,nome,categoria,raca,sexo,peso);

        int opcao = JOptionPane.showConfirmDialog(null,"Todos os dados estao corretos ? ","Confirmacao",JOptionPane.YES_NO_OPTION);
        
        
        if(opcao == JOptionPane.YES_OPTION){
         
            String insertQuery = "INSERT INTO " + tabela + " (id,especie,raca, nome, sexo, peso) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement psInsert = connection.prepareStatement(insertQuery);
            
            psInsert.setInt(1, animal.getId());
            psInsert.setString(2, animal.getEspecie());
            psInsert.setString(3, animal.getRaca());
            psInsert.setString(4, animal.getNome());
            psInsert.setString(5, animal.getSexo());
            psInsert.setDouble(6, animal.getPeso());
            psInsert.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso");
             
              nome_cadastro.setText("");
              raca_cadastro.setText("");
              peso_cadastro.setText("");
              id_cadastro.setText("");
              categoria_cadastro.setSelectedIndex(0);
              sexo_cadastro.setSelectedIndex(0);             
        }
        else{
            
        }
            }
        
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no cadastro ! Confirme os dados e verifique se estar tentando cadastrar um ID repetido, apos isso tente novamente ");
           // System.err.println();
            e.printStackTrace();}
                    
            
            
            // TODO add your handling code here:
        
    }//GEN-LAST:event_cadastrar_animalActionPerformed

    private void nome_cadastroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nome_cadastroPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_cadastroPropertyChange

    private void jFormattedTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField6ActionPerformed

    private void jFormattedTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField7ActionPerformed

    private void jFormattedTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField8ActionPerformed

    private void jFormattedTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField9ActionPerformed

    private void peso_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso_cadastroActionPerformed

    private void voltar_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_cadastroActionPerformed
                javax.swing.SwingUtilities.getWindowAncestor(voltar_cadastro).dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_voltar_cadastroActionPerformed

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
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar_animal;
    private javax.swing.JComboBox<String> categoria_cadastro;
    private javax.swing.JFormattedTextField id_cadastro;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JFormattedTextField nome_cadastro;
    private javax.swing.JFormattedTextField peso_cadastro;
    private javax.swing.JFormattedTextField raca_cadastro;
    private javax.swing.JComboBox<String> sexo_cadastro;
    private javax.swing.JButton voltar_cadastro;
    // End of variables declaration//GEN-END:variables
}