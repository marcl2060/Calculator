package View;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class calculatorView extends JFrame {
    public static final int TITLE_BAR_HEIGHT = 32;
    public static final int BORDER_WIDTH = 6;

    public calculatorView(int width, int height) {
        this.setDefaultCloseOperation(3);
        this.setTitle("Calculator");
        this.setSize(width + 6, height + 32);
        this.setResizable(false);
        this.getContentPane().setLayout(new BorderLayout());
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        double horizontal = (dimension.getWidth() - (double)width) / 2.0;
        this.setLocation((int)horizontal, 20);
    }

    public void displayPanel(ViewPanel panel) {
        this.getContentPane().removeAll();
        this.getContentPane().add(panel, "Center");
        this.getContentPane().validate();
        Component focusComponent = panel.getFocusComponent();
        if (focusComponent != null) {
            focusComponent.requestFocusInWindow();
        }

        this.setVisible(true);
    }
}
