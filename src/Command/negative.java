package Command;

import Model.calculatorWindow;

public class negative implements Command {
    private String currentNum;

    public negative() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        if (!this.currentNum.contains("-")) {
            this.currentNum = "-" + this.currentNum;
        } else {
            this.currentNum = this.currentNum.substring(1);
        }
        calculatorWindow.setWindow(this.currentNum);
        System.out.println(this.currentNum);
        this.currentNum = "";
    }
}