/**
 * This PlayerFormV4 program
 * This program is similar to the PlayerFormV3 program but is added to the menu.
 * The menu consists of 2 categories: File has 4 options: New, Open, Save, Exit
 * and Config has 2 options: Color, Size.
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

public class PlayerFormV4 extends PlayerFormV3{
    protected  JMenu menu, config, color, size;
    protected  JMenuBar menuBar;
    protected  JPanel panelPlayerFormV4;
    protected  JMenuItem saveItem, openItem, newItem, exitItem;
    protected  JMenuItem colorRed, colorGreen, colorBlue;
    protected  JMenuItem size16, size20, size24;

    public PlayerFormV4(String titleName){
        super(titleName);
    }

    @Override
    public void initComponents() {
        super.initComponents();
        panelPlayerFormV4 = new JPanel(new BorderLayout());
        menuBar = new JMenuBar();  // Create a menu bar
        menu = new JMenu("Menu");
        config = new JMenu("Config");
        newItem = new JMenuItem("New");
        newItem.setIcon(new ImageIcon("images/new.png"));  // Set icon image
        openItem = new JMenuItem("Open");
        openItem.setIcon(new ImageIcon("images/open.png"));  // Set icon image
        saveItem = new JMenuItem("Save");
        saveItem.setIcon(new ImageIcon("images/save.png"));  // Set icon image
        exitItem = new JMenuItem("Exit");
        color = new JMenu("Color");
        colorRed = new JMenuItem("Red");
        colorBlue = new JMenuItem("Blue");
        colorGreen = new JMenuItem("Green");
        size = new JMenu("Size");
        size16 = new JMenuItem("16");
        size20 = new JMenuItem("20");
        size24 = new JMenuItem("24");
    }

    @Override
    public void addComponents() {
        super.addComponents();
        addMenu();
    }

    public void addMenu(){
        menu.add(newItem);
        menu.add(openItem);
        menu.add(saveItem);
        menu.addSeparator();
        menu.add(exitItem);
        color.add(colorRed);
        color.add(colorGreen);
        color.add(colorBlue);
        size.add(size16);
        size.add(size20);
        size.add(size24);
        config.add(color);
        config.add(size);
        menuBar.add(menu);
        menuBar.add(config);
       // menuBar.setBackground(Color.yellow);
        setJMenuBar(menuBar);
    }

    public static void createAndShowGUI() {
        PlayerFormV4 msw = new PlayerFormV4("Player Form V4");
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
