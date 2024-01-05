package Command;

import Model.calculatorWindow;

public class zero implements Command {
    public String currentNum;

    public zero() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        if (this.currentNum.equals("0")) {
            this.currentNum = "0";
        } else {
            this.currentNum = this.currentNum + "0";
        }

        calculatorWindow.setWindow(this.currentNum);
        System.out.println(this.currentNum);
        this.currentNum = "";
    }

    public static void main(String[] args) {
        Command cmd = new zero();
        cmd.execute();
    }
}
