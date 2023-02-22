package ICalcCommand;

import InputOperators.ListForCalculatorArguments;

import java.util.Stack;

public class PRINT implements ICalcCommand {
    String name = "ICalcCommand.ICalcCommand.PRINT";

    @Override
    public String getName() {
        return name;
    }

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
