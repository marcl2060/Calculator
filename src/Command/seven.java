package Command;

import Model.calculatorWindow;

public class seven implements Command {
    private String currentNum;

    public seven() {
    }

    public void execute() {
        this.currentNum = calculatorWindow.getWindow();
        if (this.currentNum.equals("0")) {
            this.currentNum = "7";
        } else {
            this.currentNum = this.currentNum + "7";
        }

        calculatorWindow.setWindow(this.currentNum);
        System.out.println(this.currentNum);
        this.currentNum = "";
    }

    public static void main(String[] args) {
        Command cmd = new seven();
        cmd.execute();
    }
}
