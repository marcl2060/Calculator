package Command;

import Model.calculatorWindow;

public class clear implements Command {
    public clear() {
    }

    public void execute() {
        calculatorWindow.setBufferWindowNum("0");
        calculatorWindow.setWindow("0");
        calculatorWindow.setOperation("");
    }

    public static void main(String[] args) {
        Command cmd = new clear();
        cmd.execute();
    }
}
