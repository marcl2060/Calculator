package Model;

import java.util.Observable;

public class calculatorWindow extends Observable {
    private static String windowNum = "0";
    private static String bufferWindowNum = "0";
    private static double calcNum = 0.0;
    private static double bufferNum = 0.0;
    private static String operation = null;
    private static calculatorWindow instance = null;

    public calculatorWindow() {
    }

    private void calculatorWindow() {
    }

    public calculatorWindow getInstance() {
        if (instance == null) {
            instance = new calculatorWindow();
            this.updateViews();
        }

        return instance;
    }

    public void updateViews() {
        this.setChanged();
        this.notifyObservers();
    }

    public static void setCalcNum(double number) {
        calcNum = number;
    }

    public static double getCalcNum() {
        return calcNum;
    }

    public static void setBufferNum(double number) {
        bufferNum = number;
    }

    public static double getBufferNum() {
        return bufferNum;
    }

    public static void setWindow(String number) {
        windowNum = number;
    }

    public static String getWindow() {
        return windowNum;
    }

    public static void setBufferWindowNum(String number) {
        bufferWindowNum = number;
    }

    public static String getBufferWindowNum() {
        return bufferWindowNum;
    }

    public static void setOperation(String op) {
        operation = op;
    }

    public static String getOperation() {
        return operation;
    }
}
