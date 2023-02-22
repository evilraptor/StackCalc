package IArithmeticOperation;

import InputOperators.ListForCalculatorArguments;

import java.util.Stack;

public class SQRT implements IArithmeticOperation {
    private final String name = "IArithmeticOperation.SQRT";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        double tmp = firstElement.doubleValue();
        tmp = Math.sqrt(tmp);
        Float result = (float) tmp;
        numbersStack.push(result);
    }
}
