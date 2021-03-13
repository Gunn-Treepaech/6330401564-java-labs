package treeechan.treepaech.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV4 extends PlayerFormV3{
    protected  Menu menu, config, color, size;
    protected MenuBar menuBar;

    public PlayerFormV4(String titleName){
        super(titleName);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        addMenu();
    }

    public void addMenu(){
        MenuItem saveItem, openItem, newItem, exitItem;
        MenuItem colorRed, colorGreen, colorBlue;
        MenuItem size16, size20, size24;
        menuBar = new MenuBar();
        menu = new Menu("Menu");
        config = new Menu("Config");
        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        exitItem = new MenuItem("Exit");
        menu.add(newItem); menu.add(openItem); menu.add(saveItem); menu.add(exitItem);
        color = new Menu("Color");
        colorRed = new MenuItem("Red");
        colorBlue = new MenuItem("Blue");
        colorGreen = new MenuItem("Green");
        color.add(colorRed); color.add(colorGreen); color.add(colorBlue);
        size = new Menu("Size");
        size16 = new MenuItem("16");
        size20 = new MenuItem("20");
        size24 = new MenuItem("24");
        size.add(size16); size.add(size20); size.add(size24);
        config.add(color);
        config.add(size);
        menuBar.add(menu);
        menuBar.add(config);
        setMenuBar(menuBar);
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
