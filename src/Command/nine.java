package Command;

import Model.calculatorWindow;

public class nine implements Command {
    private String currentNum;

    public nine() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        if (this.currentNum.equals("0")) {
            this.currentNum = "9";
        } else {
            this.currentNum = this.currentNum + "9";
        }

        calculatorWindow.setWindow(this.currentNum);
        System.out.println(this.currentNum);
        this.currentNum = "";
    }

    public static void main(String[] args) {
        Command cmd = new nine();
        cmd.execute();
    }
}
