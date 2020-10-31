import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(int width, int height, String title) {

        setTitle(title);

        setPreferredSize(new Dimension(width,height));
        setMaximumSize(new Dimension(width,height));
        setMinimumSize(new Dimension(width,height));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes game when closed
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
