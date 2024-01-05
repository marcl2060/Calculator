package Command;

import Model.calculatorWindow;

public class three implements Command {
    private String currentNum;

    public three() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        if (this.currentNum.equals("0")) {
            this.currentNum = "3";
        } else {
            this.currentNum = this.currentNum + "3";
        }

        calculatorWindow.setWindow(this.currentNum);
        System.out.println(this.currentNum);
        this.currentNum = "";
    }

    public static void main(String[] args) {
        Command cmd = new three();
        cmd.execute();
    }
}
