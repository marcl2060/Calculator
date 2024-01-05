package Command;

import Model.calculatorWindow;

public class divide implements Command {
    public divide() {
    }

    public void execute() {
        calculatorWindow.setOperation("/");
        calculatorWindow.setBufferWindowNum(calculatorWindow.getWindow());
        calculatorWindow.setWindow("0");
    }

    public static void main(String[] args) {
        Command cmd = new divide();
        cmd.execute();
    }
}
