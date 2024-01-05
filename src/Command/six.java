package Command;

import Model.calculatorWindow;

public class six implements Command {
    private String currentNum;

    public six() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        if (this.currentNum.equals("0")) {
            this.currentNum = "6";
        } else {
            this.currentNum = this.currentNum + "6";
        }

        calculatorWindow.setWindow(this.currentNum);
        System.out.println(this.currentNum);
        this.currentNum = "";
    }

    public static void main(String[] args) {
        Command cmd = new six();
        cmd.execute();
    }
}
