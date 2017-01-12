package components;

import javax.swing.*;
import java.awt.*;

public class BasicFrame {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("TopLevelDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("I am a Label");

        JPanel contentPane = new JPanel();
        contentPane.setOpaque(true);
        contentPane.add(label);
        contentPane.setPreferredSize(new Dimension(200, 180));

        JMenuBar blueMenu = new JMenuBar();
        blueMenu.setOpaque(true);
        blueMenu.setBackground(Color.blue);
        blueMenu.add(label);
        blueMenu.setPreferredSize(new Dimension(200, 20));

        frame.add(blueMenu);
        frame.add(contentPane);

        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}