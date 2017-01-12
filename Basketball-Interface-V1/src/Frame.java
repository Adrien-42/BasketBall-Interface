import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Basketball Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel blueLabel = new JLabel();
        blueLabel.setOpaque(true);
        blueLabel.setBackground(new Color(112,166,255));
        blueLabel.setPreferredSize(new Dimension(200, 180));

        frame.getContentPane().add(blueLabel, BorderLayout.CENTER);

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