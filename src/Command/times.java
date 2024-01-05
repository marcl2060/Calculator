package Command;

import Model.calculatorWindow;

public class times implements Command {
    public times() {
    }

    public void execute() {
        calculatorWindow.setOperation("x");
        calculatorWindow.setBufferWindowNum(calculatorWindow.getWindow());
        calculatorWindow.setWindow("0");
    }

    public static void main(String[] args) {
        Command cmd = new times();
        cmd.execute();
    }
}
