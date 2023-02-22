package IArithmeticOperation;

import InputOperators.ListForCalculatorArguments;

import java.util.Stack;

public class DIV implements IArithmeticOperation {
    String name = "IArithmeticOperation.DIV";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement / secondElement;
        numbersStack.push(result);
    }
}
