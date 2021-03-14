/**
 * This PlayerFormV2 program
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
    protected JPanel panelPlayerFormV3;

    public PlayerFormV3(String title){
        super(title);
        gridLayoutRow = 6;
    }

    @Override
    public void addComponents() {
        super.addComponents();
        panelPlayerFormV3 = new JPanel(new BorderLayout());
        JLabel labelGames = new JLabel("Games:");
        panelLabelAndTextField.add(labelGames);
        JTextArea gameList = new JTextArea(3,15);
        gameList.setLineWrap(true);
        gameList.setWrapStyleWord(true);
        gameList.setText("Guess Number Game\n");
        gameList.append("High-Low Game\n");
        gameList.append("Monopoly Game");
        panelLabelAndTextField.add(gameList);
        panelPlayerFormV3.add(panelLabelAndTextField, BorderLayout.CENTER);
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
