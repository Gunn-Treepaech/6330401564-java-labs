package treeechan.treepaech.test;

import javax.swing.*;

public class SimpleFormV4 extends SimpleFormV3{
    protected JMenu menu;
    protected JMenuItem openItem, newItem, quitItem;
    protected  JMenuBar menuBar;

    public SimpleFormV4(String title) {
        super(title);
    }

    @Override
    public void initComponents() {
        super.initComponents();
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        openItem.setIcon(new ImageIcon(getClass().getResource("open.png")));
        quitItem = new JMenuItem("Quit");

    }

    @Override
    public void addComponents() {
        super.addComponents();
        menu.add(newItem); menu.add(openItem); menu.add(quitItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    public static void createAndShowGUI() {
        SimpleFormV4 window = new SimpleFormV4("SimpleFormV4");
        window.addComponents();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
