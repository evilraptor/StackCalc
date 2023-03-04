package CalcInteract;

import InputOperators.ListForCalculatorArguments;

import java.util.Stack;

public final class DIV implements ICalcInteract {
    private final String name = "IArithmeticOperation.DIV";

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement / secondElement;
        numbersStack.push(result);
    }
}
