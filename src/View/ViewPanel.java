package View;

import java.awt.Component;
import javax.swing.JPanel;

public class ViewPanel extends JPanel {
    protected Component focusComponent;

    public ViewPanel() {
    }

    public Component getFocusComponent() {
        return this.focusComponent;
    }

    public void setFocusComponent(Component focusComponent) {
        this.focusComponent = focusComponent;
    }
}