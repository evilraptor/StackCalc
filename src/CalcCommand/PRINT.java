package CalcCommand;

import InputOperators.ListForCalculatorArguments;
import Major.ICalcInteract;

import java.util.Stack;

public class PRINT implements ICalcInteract {
    private final String name = "ICalcCommand.ICalcCommand.PRINT";

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        System.out.println("ICalcCommand.ICalcCommand.PRINT result: ");
        if (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.peek());
            System.out.println();
        } else System.out.print("Stack is empty...\n");
    }
}
