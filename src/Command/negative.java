package Command;

import Model.calculatorWindow;

public class negative implements Command {
    private String currentNum;

    public negative() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        this.currentNum = "-" + this.currentNum;
        calculatorWindow.setBufferWindowNum(this.currentNum);
        System.out.println(this.currentNum);
        this.currentNum = "";
    }

    public static void main(String[] args) {
        Command cmd = new negative();
        cmd.execute();
    }
}