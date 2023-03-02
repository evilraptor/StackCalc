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

    private Stack<Float> numbersStack = new Stack<>();
    private HashMap<String, Float> parameters = new HashMap<>();
    private ListForCalculatorArguments listForCalculatorArguments = new ListForCalculatorArguments();
    private CalcFactory calcFactory = new CalcFactory();

    void doCalculation(String input) {
        listForCalculatorArguments.add(numbersStack, parameters, input);
        calcFactory.doCalculation(listForCalculatorArguments);

    }
}
