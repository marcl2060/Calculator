package Command;

import Model.calculatorWindow;

public class five implements Command {
    private String currentNum;

    public five() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        if (this.currentNum.equals("0")) {
            this.currentNum = "5";
        } else {
            this.currentNum = this.currentNum + "5";
        }

        calculatorWindow.setWindow(this.currentNum);
        System.out.println(this.currentNum);
        this.currentNum = "";
    }

    public static void main(String[] args) {
        Command cmd = new five();
        cmd.execute();
    }
}
