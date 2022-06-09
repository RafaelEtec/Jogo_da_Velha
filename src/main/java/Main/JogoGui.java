/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.Color;

/**
 *
 * @author raf
 */
public class JogoGui extends javax.swing.JFrame {

    public static String nomeP1, nomeP2;
    
    public JogoGui() {
        initComponents();
        jL_Mensagem.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Background = new javax.swing.JPanel();
        jP_BGTop = new javax.swing.JPanel();
        jP_BGTittle = new javax.swing.JPanel();
        jL_TikTakToe = new javax.swing.JLabel();
        jL_Credito = new javax.swing.JLabel();
        jL_JogoDaVelha = new javax.swing.JLabel();
        jP_BGBottom = new javax.swing.JPanel();
        jP_BGP1 = new javax.swing.JPanel();
        jL_NomeP1 = new javax.swing.JLabel();
        jTF_P1 = new javax.swing.JTextField();
        jP_BGP2 = new javax.swing.JPanel();
        jL_NomeP2 = new javax.swing.JLabel();
        jTF_P2 = new javax.swing.JTextField();
        jB_Jogar = new javax.swing.JButton();
        jL_Mensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jP_Background.setBackground(new java.awt.Color(153, 153, 153));

        jP_BGTop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jP_BGTopLayout = new javax.swing.GroupLayout(jP_BGTop);
        jP_BGTop.setLayout(jP_BGTopLayout);
        jP_BGTopLayout.setHorizontalGroup(
            jP_BGTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jP_BGTopLayout.setVerticalGroup(
            jP_BGTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jP_BGTittle.setBackground(new java.awt.Color(255, 255, 255));

        jL_TikTakToe.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jL_TikTakToe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_TikTakToe.setText("Tik Tak Toe");

        jL_Credito.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jL_Credito.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_Credito.setText("Por Rafael Ferreira Goulart");
        jL_Credito.setToolTipText("https://github.com/RafaelEtec/Jogo_da_Velha");

        jL_JogoDaVelha.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jL_JogoDaVelha.setText("#");

        javax.swing.GroupLayout jP_BGTittleLayout = new javax.swing.GroupLayout(jP_BGTittle);
        jP_BGTittle.setLayout(jP_BGTittleLayout);
        jP_BGTittleLayout.setHorizontalGroup(
            jP_BGTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BGTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_BGTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_TikTakToe, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Credito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_JogoDaVelha, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );
        jP_BGTittleLayout.setVerticalGroup(
            jP_BGTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BGTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_BGTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_BGTittleLayout.createSequentialGroup()
                        .addComponent(jL_TikTakToe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_Credito))
                    .addComponent(jL_JogoDaVelha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP_BGBottom.setBackground(new java.awt.Color(255, 255, 255));

        jP_BGP1.setBackground(new java.awt.Color(153, 153, 153));

        jL_NomeP1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jL_NomeP1.setText("Nome Jogador 1:");

        jTF_P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_P1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_BGP1Layout = new javax.swing.GroupLayout(jP_BGP1);
        jP_BGP1.setLayout(jP_BGP1Layout);
        jP_BGP1Layout.setHorizontalGroup(
            jP_BGP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BGP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NomeP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_P1)
                .addContainerGap())
        );
        jP_BGP1Layout.setVerticalGroup(
            jP_BGP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BGP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_BGP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_NomeP1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jTF_P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jP_BGP2.setBackground(new java.awt.Color(153, 153, 153));

        jL_NomeP2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jL_NomeP2.setText("Nome Jogador 2:");

        jTF_P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_P2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_BGP2Layout = new javax.swing.GroupLayout(jP_BGP2);
        jP_BGP2.setLayout(jP_BGP2Layout);
        jP_BGP2Layout.setHorizontalGroup(
            jP_BGP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BGP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NomeP2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_P2)
                .addContainerGap())
        );
        jP_BGP2Layout.setVerticalGroup(
            jP_BGP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BGP2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_BGP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_NomeP2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jTF_P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jB_Jogar.setBackground(new java.awt.Color(153, 153, 153));
        jB_Jogar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jB_Jogar.setText("Jogar");
        jB_Jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_JogarActionPerformed(evt);
            }
        });

        jL_Mensagem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_Mensagem.setForeground(new java.awt.Color(255, 0, 0));
        jL_Mensagem.setText("mensagem");

        javax.swing.GroupLayout jP_BGBottomLayout = new javax.swing.GroupLayout(jP_BGBottom);
        jP_BGBottom.setLayout(jP_BGBottomLayout);
        jP_BGBottomLayout.setHorizontalGroup(
            jP_BGBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BGBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_BGBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_BGP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_BGP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_Jogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jL_Mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jP_BGBottomLayout.setVerticalGroup(
            jP_BGBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BGBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_BGP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_BGP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jP_BackgroundLayout = new javax.swing.GroupLayout(jP_Background);
        jP_Background.setLayout(jP_BackgroundLayout);
        jP_BackgroundLayout.setHorizontalGroup(
            jP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jP_BGTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_BGTop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_BGBottom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jP_BackgroundLayout.setVerticalGroup(
            jP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BackgroundLayout.createSequentialGroup()
                .addComponent(jP_BGTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_BGTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_BGBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_JogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_JogarActionPerformed
        if (confereNomes()) {
            nomeP1 = jTF_P1.getText();
            nomeP2 = jTF_P2.getText();
            
            Jogar jogo = new Jogar();
            jogo.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jB_JogarActionPerformed

    private void jTF_P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_P1ActionPerformed
        confereNomes();
    }//GEN-LAST:event_jTF_P1ActionPerformed

    private void jTF_P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_P2ActionPerformed
        confereNomes();
    }//GEN-LAST:event_jTF_P2ActionPerformed
    
    public boolean confereNomes() {
        boolean confereNomes = true;
        String t1 = "", t2 = "", t3 = "";
        if (jTF_P1.getText().equals("")) {
            t1 = "Insira o nome do Jogador 1  ";
            confereNomes = false;
            jP_BGP1.setBackground(Color.red);
        } else {
            jP_BGP1.setBackground(new Color(153,153,153));
        }
        if (jTF_P2.getText().equals("")) {
            t2 = "Insira o nome do Jogador 2";
            confereNomes = false;
            jP_BGP2.setBackground(Color.red);
        } else {
            jP_BGP2.setBackground(new Color(153,153,153));
        }
        if (!jTF_P1.getText().equals("") && !jTF_P2.getText().equals("")) {
            if (jTF_P1.getText().equals(jTF_P2.getText())) {
                t3 = "Os nomes não podem ser Iguais!";
                confereNomes = false;
                jP_BGP1.setBackground(Color.red);
                jP_BGP2.setBackground(Color.red);
            } else {
                jP_BGP1.setBackground(new Color(153,153,153));
                jP_BGP2.setBackground(new Color(153,153,153));
            }
        }
        jL_Mensagem.setText(t1 + t2 + t3);
        return confereNomes;
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
            java.util.logging.Logger.getLogger(JogoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Jogar;
    private javax.swing.JLabel jL_Credito;
    private javax.swing.JLabel jL_JogoDaVelha;
    private javax.swing.JLabel jL_Mensagem;
    private javax.swing.JLabel jL_NomeP1;
    private javax.swing.JLabel jL_NomeP2;
    private javax.swing.JLabel jL_TikTakToe;
    private javax.swing.JPanel jP_BGBottom;
    private javax.swing.JPanel jP_BGP1;
    private javax.swing.JPanel jP_BGP2;
    private javax.swing.JPanel jP_BGTittle;
    private javax.swing.JPanel jP_BGTop;
    private javax.swing.JPanel jP_Background;
    private javax.swing.JTextField jTF_P1;
    private javax.swing.JTextField jTF_P2;
    // End of variables declaration//GEN-END:variables
}