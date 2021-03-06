package controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import mechanics.MinMaxAlgorithm;
import mechanics.MinMaxAlgorithmRecursive;
import models.MinMaxBattleNode;
import models.Pokemon;

/* @author paolo*/
public class BattleStateController {

    public static void setPokemon(Pokemon pokemon, JLabel l_image_pokemon,
            JProgressBar pb_pokemon_life, JLabel l_pokemon_name,
            JLabel l_pokemon_status, int player, JButton l_move_1,
            JButton l_move_2, JButton l_move_3, JButton l_move_4) {
        String trainerType;

        if (player == 0) {
            trainerType = "opponent";
        } else {
            trainerType = "player";
            l_move_1.setText(pokemon.getChosenMoves().get(0).getName());
            l_move_2.setText(pokemon.getChosenMoves().get(1).getName());
            l_move_3.setText(pokemon.getChosenMoves().get(2).getName());
            l_move_4.setText(pokemon.getChosenMoves().get(3).getName());
        }

        ImageIcon opponentImage = new ImageIcon("assets" + File.separator
                + pokemon.getName() + "_" + trainerType + ".png");
        l_image_pokemon.setIcon(opponentImage);

        pb_pokemon_life.setStringPainted(true);
        pb_pokemon_life.setMaximum(pokemon.getTotalHitPoints());
        pb_pokemon_life.setMinimum(0);
        int currentKillStatus = pokemon.getHitPoints() < 0 ? 0 : pokemon.getHitPoints();
        pb_pokemon_life.setValue(currentKillStatus);
        pb_pokemon_life.setString(currentKillStatus + "/"
                + pokemon.getTotalHitPoints());

        l_pokemon_name.setText(pokemon.getName());

        l_pokemon_status.setText("");
    }

    public static void setChangeablePokemon(List<Pokemon> playerTeam, JComboBox<String> cb_change_pokemon) {
        for (Pokemon teamMember : playerTeam) {
            cb_change_pokemon.addItem(teamMember.getName());
        }
    }

    public static int enemyMove(List<Pokemon> enemyTeam, int currentEnemyPokemon,
            List<Pokemon> playerTeam, int currentPlayerPokemon) {
        int chosenMove = 0;
        List<Pokemon> copyEnemyTeam = copyTeam(enemyTeam);
        List<Pokemon> copyPlayerTeam = copyTeam(playerTeam);
        //Minimax crea el arbol
        MinMaxBattleNode root = MinMaxAlgorithm.generateMinMaxTree(
                copyEnemyTeam, currentEnemyPokemon,
                copyPlayerTeam, currentPlayerPokemon, 0, 0);
        root.setActualB(currentPlayerPokemon);
        root.setActualA(currentEnemyPokemon);
        root.setNivel(0);
        root.setTurnoAoB(0);
        root.setGeneticFlag(1);
        System.out.println("ROOT ANTES "+root.getChosenMove());
        MinMaxAlgorithmRecursive.nextMove(root);
        System.out.println("ROOT DESPUES "+root.getChosenMove());
        
        chosenMove= root.getChosenMove();
        //Minimax escoge con su heuristica el mejor camino
        //chosenMove = MinMaxAlgorithm.findInTree(root);
        return chosenMove;
    }

    private static List<Pokemon> copyTeam(List<Pokemon> originalTeam) {
        List<Pokemon> copyTeam = new ArrayList<>();
        for (int i = 0; i < originalTeam.size(); i++) {
            copyTeam.add(new Pokemon(originalTeam.get(i)));
        }
        return copyTeam;
    }
}
