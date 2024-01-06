package Command;

import Model.calculatorWindow;

public class enter implements Command {
    public enter() {
    }

    public void execute() {
        double number1;
        double number2;
        double result;
        switch (calculatorWindow.getOperation()) {
            case "+" -> {
                number1 = Double.parseDouble(calculatorWindow.getWindow());
                number2 = Double.parseDouble(calculatorWindow.getBufferWindowNum());
                result = number1 + number2;
                String final_result = String.valueOf(result);
                calculatorWindow.setWindow(String.valueOf(result));
                calculatorWindow.setBufferWindowNum("0");
                System.out.println(result);
            }
            case "x" -> {
                number1 = Double.parseDouble(calculatorWindow.getWindow());
                number2 = Double.parseDouble(calculatorWindow.getBufferWindowNum());
                result = number1 * number2;
                calculatorWindow.setWindow(String.valueOf(result));
                calculatorWindow.setBufferWindowNum("0");
                System.out.println(result);
            }
            case "-" -> {
                number1 = Double.parseDouble(calculatorWindow.getWindow());
                number2 = Double.parseDouble(calculatorWindow.getBufferWindowNum());
                result = number2 - number1;
                calculatorWindow.setWindow(String.valueOf(result));
                calculatorWindow.setBufferWindowNum("0");
                System.out.println(result);
            }
            case "/" -> {
                number1 = Double.parseDouble(calculatorWindow.getWindow());
                number2 = Double.parseDouble(calculatorWindow.getBufferWindowNum());
                result = number2 / number1;
                String tempString = String.valueOf(result);
                if (tempString.length() > 12) {
                    tempString = tempString.substring(0, 13);
                }

                calculatorWindow.setWindow(String.valueOf(tempString));
                calculatorWindow.setBufferWindowNum("0");
                System.out.println(result);
            }
        }

    }
}
