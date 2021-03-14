/**
 * This PlayerFormV4 program
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

    public PlayerFormV4(String titleName){
        super(titleName);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        addMenu();
    }

    public void addMenu(){
        panelPlayerFormV4 = new JPanel(new BorderLayout());
        JMenuItem saveItem, openItem, newItem, exitItem;
        JMenuItem colorRed, colorGreen, colorBlue;
        JMenuItem size16, size20, size24;
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        config = new JMenu("Config");
        newItem = new JMenuItem("New");
        newItem.setIcon(new ImageIcon(getClass().getResource("new.png")));
        openItem = new JMenuItem("Open");
        openItem.setIcon(new ImageIcon(getClass().getResource("open.png")));
        saveItem = new JMenuItem("Save");
        saveItem.setIcon(new ImageIcon(getClass().getResource("save.png")));
        exitItem = new JMenuItem("Exit");
        menu.add(newItem); menu.add(openItem); menu.add(saveItem); menu.add(exitItem);
        color = new JMenu("Color");
        colorRed = new JMenuItem("Red");
        colorBlue = new JMenuItem("Blue");
        colorGreen = new JMenuItem("Green");
        color.add(colorRed); color.add(colorGreen); color.add(colorBlue);
        size = new JMenu("Size");
        size16 = new JMenuItem("16");
        size20 = new JMenuItem("20");
        size24 = new JMenuItem("24");
        size.add(size16); size.add(size20); size.add(size24);
        config.add(color);
        config.add(size);
        menuBar.add(menu);
        menuBar.add(config);
        menuBar.setBackground(Color.yellow);
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
