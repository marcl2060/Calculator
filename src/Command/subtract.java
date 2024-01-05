package Command;

import Model.calculatorWindow;

public class subtract implements Command {
    public subtract() {
    }

    public void execute() {
        calculatorWindow.setOperation("-");
        calculatorWindow.setBufferWindowNum(calculatorWindow.getWindow());
        calculatorWindow.setWindow("0");
    }

    public static void main(String[] args) {
        Command cmd = new subtract();
        cmd.execute();
    }
}
