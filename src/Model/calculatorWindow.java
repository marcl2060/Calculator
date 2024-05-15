package Model;

import java.util.Observable;

public class calculatorWindow extends Observable {
    private static String windowNum = "0";
    private static String bufferWindowNum = "0";

    private static String operation = null;

    public calculatorWindow() {
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
