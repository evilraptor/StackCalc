package Major;

import InputOperators.ListForCalculatorArguments;

import java.util.HashMap;
import java.util.Stack;

public class StackCalculator {
    public static boolean isNumeric(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    Stack<Float> numbersStack = new Stack<>();
    HashMap<String, Float> parameters = new HashMap<>();
    ListForCalculatorArguments listForCalculatorArguments = new ListForCalculatorArguments();
    CalcFactory calcFactory = new CalcFactory();

    void doCalculation(String input) {
        listForCalculatorArguments.add(numbersStack, parameters, input);
        calcFactory.doCalc(listForCalculatorArguments);

    }
}
