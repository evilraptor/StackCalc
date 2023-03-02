package CalcCommand;

import InputOperators.ListForCalculatorArguments;
import Major.ICalcInteract;
import Major.StackCalculator;

import java.util.HashMap;
import java.util.Stack;

public class PUSH implements ICalcInteract {
    private final String name = "ICalcCommand.ICalcCommand.PUSH";

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        HashMap<String, Float> parameters = listForCalculatorArguments.getParameters();
        String input = listForCalculatorArguments.getText();

        String[] inputArray = input.split(" ");
        Float tmp;
        if (!StackCalculator.isNumeric(inputArray[1])) {
            tmp = parameters.get(inputArray[1]);
            if (tmp == null) {
                System.out.println("there is no key like this");
            } //else System.out.println("ok");
        } else
            tmp = Float.valueOf(inputArray[1]);
        numbersStack.push(tmp);
    }
}
