/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umjogador;

import javax.swing.JOptionPane;

/**
 *
 * @author tanak
 */
public class tela extends javax.swing.JFrame {

    private String jogador = "X";

    private boolean btn_1IsSelected = false;
    private boolean btn_2IsSelected = false;
    private boolean btn_3IsSelected = false;
    private boolean btn_4IsSelected = false;
    private boolean btn_5IsSelected = false;
    private boolean btn_6IsSelected = false;
    private boolean btn_7IsSelected = false;
    private boolean btn_8IsSelected = false;
    private boolean btn_9IsSelected = false;

    /**
     * Creates new form tela
     */
    public tela() {
        initComponents();
        setLocationRelativeTo(null);
        IAJoga();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_5 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        btn_5.setBackground(new java.awt.Color(0, 0, 0));
        btn_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setText(" ");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(0, 0, 0));
        btn_9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_1.setBackground(new java.awt.Color(0, 0, 0));
        btn_1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setText(" ");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(0, 0, 0));
        btn_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setText(" ");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(0, 0, 0));
        btn_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setText(" ");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(0, 0, 0));
        btn_3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setText(" ");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(0, 0, 0));
        btn_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setText(" ");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(0, 0, 0));
        btn_2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setText(" ");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(0, 0, 0));
        btn_8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setText(" ");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(btn_9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        if (!btn_5IsSelected) {
            btn_5.setText(jogador);
            btn_5IsSelected = true;

            valida();
            trocaJogador();
            IAJoga();
        }
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        if (!btn_9IsSelected) {
            btn_9.setText(jogador);
            btn_9IsSelected = true;

            valida();
            trocaJogador();
            IAJoga();
        }
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        if (!btn_1IsSelected) {
            btn_1.setText(jogador);
            btn_1IsSelected = true;
            valida();
            trocaJogador();
            IAJoga();
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        if (!btn_7IsSelected) {
            btn_7.setText(jogador);
            btn_7IsSelected = true;

            valida();
            trocaJogador();
            IAJoga();
        }
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        if (!btn_4IsSelected) {
            btn_4.setText(jogador);
            btn_4IsSelected = true;

            valida();
            trocaJogador();
            IAJoga();
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        if (!btn_3IsSelected) {
            btn_3.setText(jogador);
            btn_3IsSelected = true;

            valida();
            trocaJogador();
            IAJoga();
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        if (!btn_6IsSelected) {
            btn_6.setText(jogador);
            btn_6IsSelected = true;

            valida();
            trocaJogador();
            IAJoga();
        }
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        if (!btn_2IsSelected) {
            btn_2.setText(jogador);
            btn_2IsSelected = true;

            valida();
            trocaJogador();
            IAJoga();
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        if (!btn_8IsSelected) {
            btn_8.setText(jogador);
            btn_8IsSelected = true;

            valida();
            trocaJogador();
            IAJoga();
        }
    }//GEN-LAST:event_btn_8ActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    public void valida() {

//  conferindo se venceu na horizontal
        if (btn_1.getText().equals(btn_2.getText()) && btn_1.getText().equals(btn_3.getText()) && !btn_1.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Vitoria de " + jogador);
            recomecar();
        }
        if (btn_4.getText().equals(btn_5.getText()) && btn_4.getText().equals(btn_6.getText()) && !btn_4.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Vitoria de " + jogador);
            recomecar();
        }
        if (btn_7.getText().equals(btn_8.getText()) && btn_7.getText().equals(btn_9.getText()) && !btn_7.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Vitoria de " + jogador);
            recomecar();
        }

//  conferindo se venceu na vertical
        if (btn_1.getText().equals(btn_4.getText()) && btn_1.getText().equals(btn_7.getText()) && !btn_1.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Vit??ria de " + jogador);
            recomecar();
        }
        if (btn_2.getText().equals(btn_5.getText()) && btn_2.getText().equals(btn_8.getText()) && !btn_2.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Vit??ria de " + jogador);
            recomecar();
        }
        if (btn_3.getText().equals(btn_6.getText()) && btn_3.getText().equals(btn_9.getText()) && !btn_3.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Vit??ria de " + jogador);
            recomecar();
        }

//  conferindo se venceu na diagonal
        if (btn_1.getText().equals(btn_5.getText()) && btn_1.getText().equals(btn_9.getText()) && !btn_1.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Vit??ria de " + jogador);
            recomecar();
        }
        if (btn_3.getText().equals(btn_5.getText()) && btn_3.getText().equals(btn_7.getText()) && !btn_3.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Vit??ria de " + jogador);
            recomecar();
        }

        deuVelha();
    }

    public void trocaJogador() {
        if (jogador.equals("X")) {
            jogador = "O";
        } else {
            jogador = "X";
        }
        
    }

    public void deuVelha() {
        if (btn_1IsSelected && btn_2IsSelected && btn_3IsSelected
                && btn_4IsSelected && btn_5IsSelected && btn_6IsSelected
                && btn_7IsSelected && btn_8IsSelected && btn_9IsSelected) {
            JOptionPane.showMessageDialog(rootPane, "Deu velha !!!!");
            recomecar();
        }
    }

    public void recomecar() {
        btn_1.setText(" ");
        btn_2.setText(" ");
        btn_3.setText(" ");
        btn_4.setText(" ");
        btn_5.setText(" ");
        btn_6.setText(" ");
        btn_7.setText(" ");
        btn_8.setText(" ");
        btn_9.setText(" ");

        btn_1IsSelected = false;
        btn_2IsSelected = false;
        btn_3IsSelected = false;
        btn_4IsSelected = false;
        btn_5IsSelected = false;
        btn_6IsSelected = false;
        btn_7IsSelected = false;
        btn_8IsSelected = false;
        btn_9IsSelected = false;
    }

    public void IAJoga() {

//  conferindo se precisa bloquear o jogador na horizontal
        if (btn_1.getText().equals(btn_2.getText()) && !btn_1.getText().equals(" ") && !btn_3IsSelected) {
            btn_3.setText(jogador);
            btn_3IsSelected = true;
        } else if (btn_1.getText().equals(btn_3.getText()) && !btn_1.getText().equals(" ") && !btn_2IsSelected) {
            btn_2.setText(jogador);
            btn_2IsSelected = true;
        } else if (btn_2.getText().equals(btn_3.getText()) && !btn_2.getText().equals(" ") && !btn_1IsSelected) {
            btn_1.setText(jogador);
            btn_1IsSelected = true;
        } else if (btn_4.getText().equals(btn_5.getText()) && !btn_4.getText().equals(" ") && !btn_6IsSelected) {
            btn_6.setText(jogador);
            btn_6IsSelected = true;
        } else if (btn_4.getText().equals(btn_6.getText()) && !btn_4.getText().equals(" ") && !btn_5IsSelected) {
            btn_5.setText(jogador);
            btn_5IsSelected = true;
        } else if (btn_5.getText().equals(btn_6.getText()) && !btn_5.getText().equals(" ") && !btn_4IsSelected) {
            btn_4.setText(jogador);
            btn_4IsSelected = true;
        } else if (btn_7.getText().equals(btn_8.getText()) && !btn_7.getText().equals(" ") && !btn_9IsSelected) {
            btn_9.setText(jogador);
            btn_9IsSelected = true;
        } else if (btn_7.getText().equals(btn_9.getText()) && !btn_7.getText().equals(" ") && !btn_8IsSelected) {
            btn_8.setText(jogador);
            btn_8IsSelected = true;
        } else if (btn_8.getText().equals(btn_9.getText()) && !btn_8.getText().equals(" ") && !btn_7IsSelected) {
            btn_7.setText(jogador);
            btn_7IsSelected = true;

//  agora, come??ando a conferir se precisar bloquear o jogador na vertical
        } else if (btn_1.getText().equals(btn_4.getText()) && !btn_1.getText().equals(" ") && !btn_7IsSelected) {
            btn_7.setText(jogador);
            btn_7IsSelected = true;
        } else if (btn_1.getText().equals(btn_7.getText()) && !btn_1.getText().equals(" ") && !btn_4IsSelected) {
            btn_4.setText(jogador);
            btn_4IsSelected = true;
        } else if (btn_4.getText().equals(btn_7.getText()) && !btn_4.getText().equals(" ") && !btn_1IsSelected) {
            btn_1.setText(jogador);
            btn_1IsSelected = true;
        } else if (btn_2.getText().equals(btn_5.getText()) && !btn_2.getText().equals(" ") && !btn_8IsSelected) {
            btn_8.setText(jogador);
            btn_8IsSelected = true;
        } else if (btn_2.getText().equals(btn_8.getText()) && !btn_2.getText().equals(" ") && !btn_5IsSelected) {
            btn_5.setText(jogador);
            btn_5IsSelected = true;
        } else if (btn_5.getText().equals(btn_8.getText()) && !btn_5.getText().equals(" ") && !btn_2IsSelected) {
            btn_2.setText(jogador);
            btn_2IsSelected = true;
        } else if (btn_3.getText().equals(btn_6.getText()) && !btn_3.getText().equals(" ") && !btn_9IsSelected) {
            btn_9.setText(jogador);
            btn_9IsSelected = true;
        } else if (btn_3.getText().equals(btn_9.getText()) && !btn_3.getText().equals(" ") && !btn_6IsSelected) {
            btn_6.setText(jogador);
            btn_6IsSelected = true;
        } else if (btn_6.getText().equals(btn_9.getText()) && !btn_6.getText().equals(" ") && !btn_3IsSelected) {
            btn_3.setText(jogador);
            btn_3IsSelected = true;

//  agora, conferindo se precisa bloquear o jogador na diagonal
        } else if (btn_1.getText().equals(btn_5.getText()) && !btn_1.getText().equals(" ") && ! btn_9IsSelected) {
            btn_9.setText(jogador);
            btn_9IsSelected = true;
        } else if (btn_1.getText().equals(btn_9.getText()) && !btn_1.getText().equals(" ") && ! btn_5IsSelected) {
            btn_5.setText(jogador);
            btn_5IsSelected = true;
        } else if (btn_5.getText().equals(btn_9.getText()) && !btn_5.getText().equals(" ") && ! btn_1IsSelected) {
            btn_1.setText(jogador);
            btn_1IsSelected = true;
        } else if (btn_3.getText().equals(btn_5.getText()) && !btn_3.getText().equals(" ") && ! btn_7IsSelected) {
            btn_7.setText(jogador);
            btn_7IsSelected = true;
        } else if (btn_3.getText().equals(btn_7.getText()) && !btn_3.getText().equals(" ") && ! btn_5IsSelected) {
            btn_5.setText(jogador);
            btn_5IsSelected = true;
        } else if (btn_5.getText().equals(btn_7.getText()) && !btn_5.getText().equals(" ") && ! btn_3IsSelected) {
            btn_3.setText(jogador);
            btn_3IsSelected = true;

//  se chegou aqui, o jogador n??o vai ganhar nessa rodada   
//  marcar o meio
        } else if (!btn_5IsSelected) {
            btn_5.setText(jogador);
            btn_5IsSelected = true;
//  marcar um dos cantos
        } else if (!btn_1IsSelected) {
            btn_1.setText(jogador);
            btn_1IsSelected = true;
        } else if (!btn_3IsSelected) {
            btn_3.setText(jogador);
            btn_3IsSelected = true;
        } else if (!btn_7IsSelected) {
            btn_7.setText(jogador);
            btn_7IsSelected = true;
        } else if (!btn_9IsSelected) {
            btn_9.setText(jogador);
            btn_9IsSelected = true;

//  se chegou aqui,  todos os cantos est??o marcados
//  marcar um do meio
        } else if (!btn_2IsSelected) {
            btn_2.setText(jogador);
            btn_2IsSelected = true;
        } else if (!btn_4IsSelected) {
            btn_4.setText(jogador);
            btn_4IsSelected = true;
        } else if (!btn_6IsSelected) {
            btn_6.setText(jogador);
            btn_6IsSelected = true;
        } else if (!btn_8IsSelected) {
            btn_8.setText(jogador);
            btn_8IsSelected = true;
        }
        valida();
        deuVelha();
        trocaJogador();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
