package Command;

import Model.calculatorWindow;

public class two implements Command {
    private String currentNum;

    public two() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        if (this.currentNum.equals("0")) {
            this.currentNum = "2";
        } else {
            this.currentNum = this.currentNum + "2";
        }

        calculatorWindow.setWindow(this.currentNum);
        System.out.println(this.currentNum);
        this.currentNum = "";
    }

    public static void main(String[] args) {
        Command cmd = new two();
        cmd.execute();
    }
}
