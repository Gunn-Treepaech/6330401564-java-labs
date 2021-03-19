/**
 * This PlayerFormV3 program
 * This program is similar to the PlayerFormV2 program
 * but will be added to the list of available games.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:March 14, 2021
 *
 **/

package treeechan.treepaech.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV3 extends PlayerFormV2{
    protected JPanel panelPlayerFormV3, panelListGame;

    public PlayerFormV3(String titleName){
        super(titleName);
    }

    @Override
    public void initComponents() {
        super.initComponents();
        panelPlayerFormV3 = new JPanel(new BorderLayout());
        panelListGame = new JPanel(new GridLayout(0,2));
    }

    @Override
    public void addComponents() {
        super.addComponents();

        JLabel labelGames = new JLabel("Games:");
        String[] game = {"Guess Number Game", "High-Low Game", "Monopoly Game"};
        JList<String> gameList = new JList<String>(game);
        panelListGame.add(labelGames);
        panelListGame.add(gameList);

        panelPlayerFormV3.add(panelContent, BorderLayout.NORTH);
        panelPlayerFormV3.add(panelListGame, BorderLayout.CENTER);
        panelPlayerFormV3.add(panelNoteAndButton, BorderLayout.SOUTH);
        setContentPane(panelPlayerFormV3);
    }

    public static void createAndShowGUI() {
        PlayerFormV3 msw = new PlayerFormV3("Player Form V3");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
