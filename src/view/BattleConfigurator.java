/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.PokemonLoaderController;
import java.util.ArrayList;
import java.util.List;
import models.Pokemon;

/**
 *
 * @author paolo
 */
public class BattleConfigurator extends javax.swing.JFrame {

    /**
     * Creates new form BattleConfigurator
     */
    public BattleConfigurator() {
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

        b_training = new javax.swing.JButton();
        b_battle = new javax.swing.JButton();
        b_trained_minimax = new javax.swing.JButton();
        b_barcenamon_battle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_training.setText("Train Computer");
        b_training.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_trainingActionPerformed(evt);
            }
        });

        b_battle.setText("Minimax");
        b_battle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_battleActionPerformed(evt);
            }
        });

        b_trained_minimax.setText("Trained Minimax");
        b_trained_minimax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_trained_minimaxActionPerformed(evt);
            }
        });

        b_barcenamon_battle.setText("Random");
        b_barcenamon_battle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_barcenamon_battleActionPerformed(evt);
            }
        });

        jLabel1.setText("Pokemon Battle Simulator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_trained_minimax, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_training, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_battle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_barcenamon_battle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(b_training, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_trained_minimax, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_battle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_barcenamon_battle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// ORIGINAL MINIMAX (COMPLETED ONE)
    private void b_battleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_battleActionPerformed
        int numberOfPokemonsOnDatabase = 7;
        int numberOfPokemonsPerTeam = 3;
        List<Pokemon> allPokemons = PokemonLoaderController.loadPokemon(numberOfPokemonsOnDatabase);
        List<Pokemon> playerTeam = new ArrayList<>();
        List<Pokemon> computerTeam = new ArrayList<>();
        PokemonLoaderController.init(allPokemons, playerTeam, computerTeam, numberOfPokemonsPerTeam,
                numberOfPokemonsOnDatabase);
        BattleInterface battleInterface = new BattleInterface(playerTeam, computerTeam, false);
        battleInterface.setVisible(true);
    }//GEN-LAST:event_b_battleActionPerformed

//GENETICALLY TRAINED MINIMAX
    private void b_trained_minimaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_trained_minimaxActionPerformed
        int numberOfPokemonsOnDatabase = 7;
        int numberOfPokemonsPerTeam = 3;
        List<Pokemon> allPokemons = PokemonLoaderController.loadPokemon(numberOfPokemonsOnDatabase);
        List<Pokemon> playerTeam = new ArrayList<>();
        List<Pokemon> computerTeam = new ArrayList<>();
        PokemonLoaderController.init(allPokemons, playerTeam, computerTeam, numberOfPokemonsPerTeam,
                numberOfPokemonsOnDatabase);
        BattleInterface battleInterface = new BattleInterface(playerTeam, computerTeam, true);
        battleInterface.setVisible(true);
    }//GEN-LAST:event_b_trained_minimaxActionPerformed

//RANDOM ALGORITHM
    private void b_barcenamon_battleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_barcenamon_battleActionPerformed
        int numberOfPokemonsOnDatabase = 7;
        int numberOfPokemonsPerTeam = 3;
        List<Pokemon> allPokemons = PokemonLoaderController.loadPokemon(numberOfPokemonsOnDatabase);
        List<Pokemon> playerTeam = new ArrayList<>();
        List<Pokemon> computerTeam = new ArrayList<>();
        PokemonLoaderController.init(allPokemons, playerTeam, computerTeam, numberOfPokemonsPerTeam,
                numberOfPokemonsOnDatabase);
        BattleInterfaceRandom battleInterface = new BattleInterfaceRandom(playerTeam, computerTeam);
        battleInterface.setVisible(true);
    }//GEN-LAST:event_b_barcenamon_battleActionPerformed

//AUTOMATIC TRAINING FOR THE GENETIC
    private void b_trainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_trainingActionPerformed
        int numberOfPokemonsOnDatabase = 7;
        int numberOfPokemonsPerTeam = 3;
        List<Pokemon> allPokemons = PokemonLoaderController.loadPokemon(numberOfPokemonsOnDatabase);
        List<Pokemon> playerTeam = new ArrayList<>();
        List<Pokemon> computerTeam = new ArrayList<>();
        PokemonLoaderController.init(allPokemons, playerTeam, computerTeam, numberOfPokemonsPerTeam,
                numberOfPokemonsOnDatabase);
        //THIS SHOULD CALL THE GENETIC CLASS (NO SCREEN NECCESARY).
    }//GEN-LAST:event_b_trainingActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BattleConfigurator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BattleConfigurator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_barcenamon_battle;
    private javax.swing.JButton b_battle;
    private javax.swing.JButton b_trained_minimax;
    private javax.swing.JButton b_training;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
