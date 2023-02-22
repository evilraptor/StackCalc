package IArithmeticOperation;

import InputOperators.ListForCalculatorArguments;

import java.util.Stack;

public class MUL implements IArithmeticOperation {
    private final String name = "IArithmeticOperation.MUL";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement * secondElement;
        numbersStack.push(result);
    }
}
