package IArithmeticOperation;

import InputOperators.ListForCalculatorArguments;

import java.util.Stack;

public class ADD implements IArithmeticOperation {
    String name = "IArithmeticOperation.IArithmeticOperation.ADD";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement + secondElement;
        numbersStack.push(result);
    }
}