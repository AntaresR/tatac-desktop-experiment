/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.BattleStateController;
import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import models.Pokemon;

/**
 *
 * @author paolo
 */
public class BattleInterface extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public BattleInterface() {
        initComponents();
        loadBattle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_battle_menu = new javax.swing.JPanel();
        l_move_1 = new javax.swing.JLabel();
        l_move_3 = new javax.swing.JLabel();
        l_move_4 = new javax.swing.JLabel();
        b_change_pokemon = new javax.swing.JButton();
        l_move_2 = new javax.swing.JLabel();
        p_player_pokemon = new javax.swing.JPanel();
        l_player_pokemon_name = new javax.swing.JLabel();
        pb_player_pokemon_life = new javax.swing.JProgressBar();
        l_image_player_pokemon = new javax.swing.JLabel();
        l_player_pokemon_status = new javax.swing.JLabel();
        p_enemy_pokemon = new javax.swing.JPanel();
        l_enemy_pokemon_name = new javax.swing.JLabel();
        pb_enemy_pokemon_life = new javax.swing.JProgressBar();
        l_image_enemy_pokemon = new javax.swing.JLabel();
        l_enemy_pokemon_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        p_battle_menu.setBackground(new java.awt.Color(0, 0, 0));
        p_battle_menu.setForeground(new java.awt.Color(255, 255, 255));
        p_battle_menu.setOpaque(false);

        l_move_1.setBackground(new java.awt.Color(221, 198, 175));
        l_move_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_move_1.setText("Move 1");
        l_move_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        l_move_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_move_3.setText("Move 3");
        l_move_3.setToolTipText("");
        l_move_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        l_move_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_move_4.setText("Move 4");
        l_move_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        b_change_pokemon.setText("Change Pokemon");

        l_move_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_move_2.setText("Move 2");
        l_move_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout p_battle_menuLayout = new javax.swing.GroupLayout(p_battle_menu);
        p_battle_menu.setLayout(p_battle_menuLayout);
        p_battle_menuLayout.setHorizontalGroup(
            p_battle_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_battle_menuLayout.createSequentialGroup()
                .addGroup(p_battle_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_move_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_move_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p_battle_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_move_4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_move_2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_change_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        p_battle_menuLayout.setVerticalGroup(
            p_battle_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_battle_menuLayout.createSequentialGroup()
                .addGroup(p_battle_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_move_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_change_pokemon)
                    .addComponent(l_move_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(p_battle_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_move_3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(l_move_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        p_player_pokemon.setBackground(new java.awt.Color(0, 0, 0));
        p_player_pokemon.setForeground(new java.awt.Color(255, 255, 255));

        l_player_pokemon_name.setForeground(new java.awt.Color(255, 255, 255));
        l_player_pokemon_name.setText("Player Pokemon Name");

        l_player_pokemon_status.setForeground(new java.awt.Color(255, 255, 255));
        l_player_pokemon_status.setText("Pokemon Status");

        javax.swing.GroupLayout p_player_pokemonLayout = new javax.swing.GroupLayout(p_player_pokemon);
        p_player_pokemon.setLayout(p_player_pokemonLayout);
        p_player_pokemonLayout.setHorizontalGroup(
            p_player_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_player_pokemonLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(l_image_player_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(p_player_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_player_pokemon_status)
                    .addComponent(l_player_pokemon_name)
                    .addComponent(pb_player_pokemon_life, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        p_player_pokemonLayout.setVerticalGroup(
            p_player_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_player_pokemonLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(l_player_pokemon_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pb_player_pokemon_life, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_player_pokemon_status)
                .addContainerGap(80, Short.MAX_VALUE))
            .addComponent(l_image_player_pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        p_enemy_pokemon.setBackground(new java.awt.Color(0, 0, 0));

        l_enemy_pokemon_name.setForeground(new java.awt.Color(245, 231, 231));
        l_enemy_pokemon_name.setText("Enemy Pokemon Name");

        l_image_enemy_pokemon.setBackground(new Color(0,255,0,0));
        l_image_enemy_pokemon.setForeground(new Color(0,225,0,0));
        l_image_enemy_pokemon.setOpaque(true);

        l_enemy_pokemon_status.setForeground(new java.awt.Color(255, 255, 255));
        l_enemy_pokemon_status.setText("Pokemon Status");

        javax.swing.GroupLayout p_enemy_pokemonLayout = new javax.swing.GroupLayout(p_enemy_pokemon);
        p_enemy_pokemon.setLayout(p_enemy_pokemonLayout);
        p_enemy_pokemonLayout.setHorizontalGroup(
            p_enemy_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_enemy_pokemonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_enemy_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pb_enemy_pokemon_life, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_enemy_pokemon_name, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_enemy_pokemon_status))
                .addGap(80, 80, 80)
                .addComponent(l_image_enemy_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        p_enemy_pokemonLayout.setVerticalGroup(
            p_enemy_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_enemy_pokemonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(l_enemy_pokemon_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pb_enemy_pokemon_life, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_enemy_pokemon_status)
                .addContainerGap(87, Short.MAX_VALUE))
            .addComponent(l_image_enemy_pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_enemy_pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_battle_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_player_pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_enemy_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_player_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_battle_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BattleInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BattleInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_change_pokemon;
    private javax.swing.JLabel l_enemy_pokemon_name;
    private javax.swing.JLabel l_enemy_pokemon_status;
    private javax.swing.JLabel l_image_enemy_pokemon;
    private javax.swing.JLabel l_image_player_pokemon;
    private javax.swing.JLabel l_move_1;
    private javax.swing.JLabel l_move_2;
    private javax.swing.JLabel l_move_3;
    private javax.swing.JLabel l_move_4;
    private javax.swing.JLabel l_player_pokemon_name;
    private javax.swing.JLabel l_player_pokemon_status;
    private javax.swing.JPanel p_battle_menu;
    private javax.swing.JPanel p_enemy_pokemon;
    private javax.swing.JPanel p_player_pokemon;
    private javax.swing.JProgressBar pb_enemy_pokemon_life;
    private javax.swing.JProgressBar pb_player_pokemon_life;
    // End of variables declaration//GEN-END:variables

    private void loadBattle() {
        Pokemon dummyEnemyPokemon = new Pokemon();
        dummyEnemyPokemon.setName("Milotic");
        dummyEnemyPokemon.setTotalHitPoints(141);
        dummyEnemyPokemon.setHitPoints(141);
        
        Pokemon dummyPlayerPokemon = new Pokemon();
        dummyPlayerPokemon.setName("Milotic");
        dummyPlayerPokemon.setTotalHitPoints(141);
        dummyPlayerPokemon.setHitPoints(141);
        
        BattleStateController.setPokemon(dummyEnemyPokemon, l_image_enemy_pokemon,
                pb_enemy_pokemon_life, l_enemy_pokemon_name, l_enemy_pokemon_status, 0);
        
        BattleStateController.setPokemon(dummyPlayerPokemon, l_image_player_pokemon,
                pb_player_pokemon_life, l_player_pokemon_name, 
                l_player_pokemon_status, 1);
       
    }
}