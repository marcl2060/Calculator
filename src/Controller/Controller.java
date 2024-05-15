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
import java.util.Observable;

public class Controller extends Observable implements ActionListener {
    private calculatorView view;
    private calculatorPanel overallPanel;
    private static final Command[] commands = new Command[19];
    public static final int WIDTH = 510;
    public static final int HEIGHT = 850;

    public Controller() {
    }

    public void start() {
        this.view = new calculatorView(WIDTH, HEIGHT);
        this.overallPanel = new calculatorPanel(WIDTH, HEIGHT, this);
        this.overallPanel.setVisible(true);
        this.view.displayPanel(this.overallPanel);
        this.addObserver(this.overallPanel);
        initializeCommands();
        addKeyListenerToView();

        this.view.setFocusable(true);
        this.view.requestFocusInWindow();
        this.updateViews();
    }

    private void initializeCommands() {
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

    private void addKeyListenerToView() {
        this.view.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
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
                    default:
                        System.out.println("Invalid Option");
                        return;
                }
                updateViews();
            }
        });
    }

    public void updateViews() {
        this.setChanged();
        this.notifyObservers();
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        switch (command) {
            case "zero":
                commands[0].execute();
                break;
            case "decimal":
                commands[12].execute();
                break;
            case "delete":
                commands[18].execute();
                break;
            case "enter":
                commands[14].execute();
                break;
            case "one":
                commands[1].execute();
                break;
            case "two":
                commands[2].execute();
                break;
            case "three":
                commands[3].execute();
                break;
            case "four":
                commands[4].execute();
                break;
            case "five":
                commands[5].execute();
                break;
            case "six":
                commands[6].execute();
                break;
            case "seven":
                commands[7].execute();
                break;
            case "eight":
                commands[8].execute();
                break;
            case "nine":
                commands[9].execute();
                break;
            case "divide":
                commands[13].execute();
                break;
            case "times":
                commands[17].execute();
                break;
            case "add":
                commands[10].execute();
                break;
            case "subtract":
                commands[16].execute();
                break;
            case "negative":
                commands[15].execute();
                break;
            case "clear":
                commands[11].execute();
                break;
            default:
                System.out.println("Invalid Option");
                return;
        }

        updateViews();
        this.view.setFocusable(true);
        this.view.requestFocusInWindow();
    }
}
