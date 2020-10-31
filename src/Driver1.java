import javax.swing.*;
import java.awt.*;

public class Driver1 {
    public static final int WIDTH = 640, HEIGHT = WIDTH/12 * 9;
    public static String TITLE = "DataStructures";

    public static void main(String[] args) {
        Window window = new Window(WIDTH,HEIGHT,TITLE);
        JButton button = new JButton("Test");
        // Add button to JPanel
        JPanel panel = new JPanel();
        panel.add(button);
        // And JPanel needs to be added to the JFrame itself!
        window.getContentPane().add(panel);
        window.setVisible(true);
    }

    
}
