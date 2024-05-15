package Controller;

import Command.Command;
import Command.add;
import Command.clear;
import Command.decimal;
import Command.delete;
import Command.divide;
import Command.eight;
import Command.enter;
import Command.five;
import Command.four;
import Command.negative;
import Command.nine;
import Command.one;
import Command.seven;
import Command.six;
import Command.subtract;
import Command.three;
import Command.times;
import Command.two;
import Command.zero;
import View.calculatorPanel;
import View.calculatorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

public class Controller extends Observable implements ActionListener {
    private calculatorView view;
    private calculatorPanel overallPanel;

    public String currentNum = "";
    private static final Command[] commands = new Command[19];
    public static final int WIDTH = 510;
    public static final int HEIGHT = 850;

    public Controller() {
    }

    public void start() {
        this.view = new calculatorView(WIDTH,HEIGHT);
        this.overallPanel = new calculatorPanel(WIDTH, HEIGHT, this);
        this.overallPanel.setVisible(true);
        this.view.displayPanel(this.overallPanel);
        this.addObserver(this.overallPanel);
        commands[0] = new zero();
        commands[1] = new one();
        commands[2] = new two();
        commands[3] = new three();
        commands[4] = new four();
        commands[5] = new five();
        commands[6] = new six();
        commands[7] = new seven();
        commands[8] = new eight();
        commands[9] = new nine();
        commands[10] = new add();
        commands[11] = new clear();
        commands[12] = new decimal();
        commands[13] = new divide();
        commands[14] = new enter();
        commands[15] = new negative();
        commands[16] = new subtract();
        commands[17] = new times();
        commands[18] = new delete();
    }

    public void updateViews() {
        this.setChanged();
        this.notifyObservers();
    }

    public void actionPerformed(ActionEvent event) {
        switch (event.getActionCommand()) {
            case "zero":
                commands[0].execute();
                this.updateViews();
                break;
            case "decimal":
                commands[12].execute();
                this.updateViews();
                break;
            case "delete":
                commands[18].execute();
                this.updateViews();
                break;
            case "enter":
                commands[14].execute();
                this.updateViews();
                break;
            case "one":
                commands[1].execute();
                this.updateViews();
                break;
            case "two":
                commands[2].execute();
                this.updateViews();
                break;
            case "three":
                commands[3].execute();
                this.updateViews();
                break;
            case "four":
                commands[4].execute();
                this.updateViews();
                break;
            case "five":
                commands[5].execute();
                this.updateViews();
                break;
            case "six":
                commands[6].execute();
                this.updateViews();
                break;
            case "seven":
                commands[7].execute();
                this.updateViews();
                break;
            case "eight":
                commands[8].execute();
                this.updateViews();
                break;
            case "nine":
                commands[9].execute();
                this.updateViews();
                break;
            case "divide":
                commands[13].execute();
                this.updateViews();
                break;
            case "times":
                commands[17].execute();
                this.updateViews();
                break;
            case "add":
                commands[10].execute();
                this.updateViews();
                break;
            case "subtract":
                commands[16].execute();
                this.updateViews();
                break;
            case "negative":
                commands[15].execute();
                this.updateViews();
                break;
            case "clear":
                commands[11].execute();
                this.updateViews();
                break;
            default:
                System.out.println("invalid Option");
        }

        this.view.setFocusable(true);
        this.view.requestFocusInWindow();
        this.view.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_0:
                        commands[0].execute();
                        break;
                    case KeyEvent.VK_1:
                        commands[1].execute();
                        break;
                    case KeyEvent.VK_2:
                        commands[2].execute();
                        break;
                    case KeyEvent.VK_3:
                        commands[3].execute();
                        break;
                    case KeyEvent.VK_4:
                        commands[4].execute();
                        break;
                    case KeyEvent.VK_5:
                        commands[5].execute();
                        break;
                    case KeyEvent.VK_6:
                        commands[6].execute();
                        break;
                    case KeyEvent.VK_7:
                        commands[7].execute();
                        break;
                    case KeyEvent.VK_8:
                        commands[8].execute();
                        break;
                    case KeyEvent.VK_9:
                        commands[9].execute();
                        break;
                    case KeyEvent.VK_PERIOD:
                        commands[12].execute();
                        break;
                    case KeyEvent.VK_BACK_SPACE:
                        commands[18].execute();
                        break;
                    case KeyEvent.VK_ENTER:
                        commands[14].execute();
                        break;
                    // Add additional cases for other keys
                }
                updateViews();
            }
        });

    }

}