package View;

import Model.calculatorWindow;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;

public class calculatorPanel extends ViewPanel implements Observer {
    static final int BUTTON_WIDTH = 112;
    static final int BUTTON_HEIGHT = 112;
    static String text = "0";
    static final Font BUTTON_Font = new Font("Ariel", 0, 40);

    public calculatorPanel(int width, int height, ActionListener listener) {
        this.setSize(width, height);
        this.setBackground(Color.BLACK);
        this.setLayout((LayoutManager)null);
        JButton oneButton = new JButton("1");
        oneButton.setBackground(Color.DARK_GRAY);
        oneButton.setForeground(Color.WHITE);
        oneButton.setActionCommand("one");
        oneButton.addActionListener(listener);
        oneButton.setBounds(10, 596, 112, 112);
        oneButton.setFont(BUTTON_Font);
        this.add(oneButton);

        JButton zeroButton = new JButton("0");
        zeroButton.setBackground(Color.DARK_GRAY);
        zeroButton.setForeground(Color.WHITE);
        zeroButton.setActionCommand("zero");
        zeroButton.addActionListener(listener);
        zeroButton.setBounds(132, 718, 112, 112);
        zeroButton.setFont(BUTTON_Font);
        this.add(zeroButton);

        JButton decimalButton = new JButton(".");
        decimalButton.setBackground(Color.DARK_GRAY);
        decimalButton.setForeground(Color.WHITE);
        decimalButton.setActionCommand("decimal");
        decimalButton.addActionListener(listener);
        decimalButton.setBounds(10, 718, 112, 112);
        decimalButton.setFont(BUTTON_Font);
        this.add(decimalButton);

        JButton deleteButton = new JButton("DEL");
        deleteButton.setBackground(Color.DARK_GRAY);
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setActionCommand("delete");
        deleteButton.addActionListener(listener);
        deleteButton.setBounds(254, 718, 112, 112);
        deleteButton.setFont(BUTTON_Font);
        this.add(deleteButton);

        JButton enterButton = new JButton("=");
        enterButton.setBackground(Color.DARK_GRAY);
        enterButton.setForeground(Color.WHITE);
        enterButton.setActionCommand("enter");
        enterButton.addActionListener(listener);
        enterButton.setBounds(376, 596, 112, 234);
        enterButton.setFont(BUTTON_Font);
        this.add(enterButton);

        JButton twoButton = new JButton("2");
        twoButton.setBackground(Color.DARK_GRAY);
        twoButton.setForeground(Color.WHITE);
        twoButton.setActionCommand("two");
        twoButton.addActionListener(listener);
        twoButton.setBounds(132, 596, 112, 112);
        twoButton.setFont(BUTTON_Font);
        this.add(twoButton);

        JButton threeButton = new JButton("3");
        threeButton.setBackground(Color.DARK_GRAY);
        threeButton.setForeground(Color.WHITE);
        threeButton.setActionCommand("three");
        threeButton.addActionListener(listener);
        threeButton.setBounds(254, 596, 112, 112);
        threeButton.setFont(BUTTON_Font);
        this.add(threeButton);

        JButton fourButton = new JButton("4");
        fourButton.setBackground(Color.DARK_GRAY);
        fourButton.setForeground(Color.WHITE);
        fourButton.setActionCommand("four");
        fourButton.addActionListener(listener);
        fourButton.setBounds(10, 474, 112, 112);
        fourButton.setFont(BUTTON_Font);
        this.add(fourButton);

        JButton fiveButton = new JButton("5");
        fiveButton.setBackground(Color.DARK_GRAY);
        fiveButton.setForeground(Color.WHITE);
        fiveButton.setActionCommand("five");
        fiveButton.addActionListener(listener);
        fiveButton.setBounds(132, 474, 112, 112);
        fiveButton.setFont(BUTTON_Font);
        this.add(fiveButton);

        JButton sixButton = new JButton("6");
        sixButton.setBackground(Color.DARK_GRAY);
        sixButton.setForeground(Color.WHITE);
        sixButton.setActionCommand("six");
        sixButton.addActionListener(listener);
        sixButton.setBounds(254, 474, 112, 112);
        sixButton.setFont(BUTTON_Font);
        this.add(sixButton);

        JButton divideButton = new JButton("÷");
        divideButton.setBackground(Color.DARK_GRAY);
        divideButton.setForeground(Color.WHITE);
        divideButton.setActionCommand("divide");
        divideButton.addActionListener(listener);
        divideButton.setBounds(376, 474, 112, 112);
        divideButton.setFont(BUTTON_Font);
        this.add(divideButton);

        JButton sevenButton = new JButton("7");
        sevenButton.setForeground(Color.WHITE);
        sevenButton.setBackground(Color.DARK_GRAY);
        sevenButton.setActionCommand("seven");
        sevenButton.addActionListener(listener);
        sevenButton.setBounds(10, 352, 112, 112);
        sevenButton.setFont(BUTTON_Font);
        this.add(sevenButton);

        JButton eightButton = new JButton("8");
        eightButton.setBackground(Color.DARK_GRAY);
        eightButton.setForeground(Color.WHITE);
        eightButton.setActionCommand("eight");
        eightButton.addActionListener(listener);
        eightButton.setBounds(132, 352, 112, 112);
        eightButton.setFont(BUTTON_Font);
        this.add(eightButton);

        JButton nineButton = new JButton("9");
        nineButton.setBackground(Color.DARK_GRAY);
        nineButton.setForeground(Color.WHITE);
        nineButton.setActionCommand("nine");
        nineButton.addActionListener(listener);
        nineButton.setBounds(254, 352, 112, 112);
        nineButton.setFont(BUTTON_Font);
        this.add(nineButton);

        JButton timesButton = new JButton("×");
        timesButton.setBackground(Color.DARK_GRAY);
        timesButton.setForeground(Color.WHITE);
        timesButton.setActionCommand("times");
        timesButton.addActionListener(listener);
        timesButton.setBounds(376, 352, 112, 112);
        timesButton.setFont(BUTTON_Font);
        this.add(timesButton);

        JButton clearButton = new JButton("AC");
        clearButton.setBackground(Color.DARK_GRAY);
        clearButton.setForeground(Color.WHITE);
        clearButton.setActionCommand("clear");
        clearButton.addActionListener(listener);
        clearButton.setBounds(10, 230, 112, 112);
        clearButton.setFont(BUTTON_Font);
        this.add(clearButton);

        JButton negativeButton = new JButton("+/-");
        negativeButton.setBackground(Color.DARK_GRAY);
        negativeButton.setForeground(Color.WHITE);
        negativeButton.setActionCommand("negative");
        negativeButton.addActionListener(listener);
        negativeButton.setBounds(132, 230, 112, 112);
        negativeButton.setFont(BUTTON_Font);
        this.add(negativeButton);

        JButton subtractButton = new JButton("-");
        subtractButton.setBackground(Color.DARK_GRAY);
        subtractButton.setForeground(Color.WHITE);
        subtractButton.setActionCommand("subtract");
        subtractButton.addActionListener(listener);
        subtractButton.setBounds(254, 230, 112, 112);
        subtractButton.setFont(BUTTON_Font);
        this.add(subtractButton);

        JButton addButton = new JButton("+");
        addButton.setBackground(Color.DARK_GRAY);
        addButton.setForeground(Color.WHITE);
        addButton.setActionCommand("add");
        addButton.addActionListener(listener);
        addButton.setBounds(376, 230, 112, 112);
        addButton.setFont(BUTTON_Font);
        this.add(addButton);
        this.repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D calcDisplay = (Graphics2D)g;
        calcDisplay.setColor(Color.WHITE);
        calcDisplay.fillRect(10, 10, 480, 210);
        calcDisplay.setPaint(Color.BLACK);
        calcDisplay.setFont(new Font("Ariel", 0, 70));
        calcDisplay.drawString(text, 20, 170);
    }

    public void update(Observable o, Object arg) {
        text = calculatorWindow.getWindow();
        this.repaint();
    }
}
