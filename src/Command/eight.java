package Command;

import Model.calculatorWindow;

public class eight implements Command {
    private String currentNum;

    public eight() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        if (this.currentNum.equals("0")) {
            this.currentNum = "8";
        } else {
            this.currentNum = this.currentNum + "8";
        }

        calculatorWindow.setWindow(this.currentNum);
        System.out.println(this.currentNum);
        this.currentNum = "";
    }

    public static void main(String[] args) {
        Command cmd = new eight();
        cmd.execute();
    }
}
