/**
 * This PlayerFormV6 program
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:April 5, 2021
 *
 **/

package treeechan.treepaech.lab10;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PlayerFormV6 extends PlayerFormV5 implements ItemListener {

    public PlayerFormV6(String titleName) {
        super(titleName);
    }

    @Override
    public void addListener(){
        male.addItemListener(this);
        female.addItemListener(this);
    }

    public static void createAndShowGUI() {
        PlayerFormV6 pfv6 = new PlayerFormV6("Player Form V6");
        pfv6.addComponents();
        pfv6.setFrameFeatures();
        pfv6.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String msg = "";
        if (e.getStateChange() == ItemEvent.SELECTED){
            Object source = e.getSource();
            if (source == male){
                msg = "Gender is updated " + male.getActionCommand();
            } else if (source == female){
                msg = "Gender is updated " + female.getActionCommand();
            }
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
