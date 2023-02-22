package IArithmeticOperation;

import IArithmeticOperation.IArithmeticOperation;
import InputOperators.ListForCalculatorArguments;

import java.util.Stack;

public class SUB implements IArithmeticOperation {
    String name = "IArithmeticOperation.SUB";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement - secondElement;
        numbersStack.push(result);
    }
}
