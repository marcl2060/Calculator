package Command;

import Model.calculatorWindow;

public class decimal implements Command {
    private String currentNum;

    public decimal() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        calculatorWindow.setWindow(this.currentNum + ".");
        System.out.println(this.currentNum);
        this.currentNum = "";
    }
}
