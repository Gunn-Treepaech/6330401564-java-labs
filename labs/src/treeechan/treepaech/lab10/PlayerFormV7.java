/**
 * This PlayerFormV7 program
 * when the user selects any game in the list, the program shows the selected game.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:April 5, 2021
 *
 **/

package treeechan.treepaech.lab10;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;

public class PlayerFormV7 extends PlayerFormV6 implements ListSelectionListener {

    public PlayerFormV7(String titleName) {
        super(titleName);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        gameList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // set JList to multiple mode
    }

    @Override
    public void addListener(){
        // add listener
        super.addListener();
        gameList.addListSelectionListener(this);
    }

    public static void createAndShowGUI() {
        PlayerFormV7 pfv7 = new PlayerFormV7("Player Form V7");
        pfv7.addComponents();
        pfv7.setFrameFeatures();
        pfv7.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        StringBuffer msg = new StringBuffer();
        boolean isAdjusting = e.getValueIsAdjusting();
        if (!isAdjusting) {
            // Pull the selection in array list
            List<String> userSelected =  gameList.getSelectedValuesList();
            int numSelected = userSelected.size();
            for (int i = 0; i < numSelected; i++) {
                    msg.append(userSelected.get(i));
                    if(i != numSelected - 1){
                        // If it is the last one, it will not put.
                        msg.append(", ");
                    }
            }
            JOptionPane.showMessageDialog(null, msg.toString());
        }
    }

}
