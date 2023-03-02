package ArithmeticOperation;

import InputOperators.ListForCalculatorArguments;
import Major.ICalcInteract;

import java.util.Stack;

public final class SQRT implements ICalcInteract {
    private final String name = "IArithmeticOperation.SQRT";

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
