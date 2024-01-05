package Command;

import Model.calculatorWindow;

public class delete implements Command {
    private String currentNum;

    public delete() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        calculatorWindow.setWindow(this.currentNum.substring(0, this.currentNum.length() - 1));
        this.currentNum = "";
    }
}