package ICalcCommand;

import InputOperators.ListForCalculatorArguments;

import java.util.Stack;

public class POP implements ICalcCommand {
    private final String name = "ICalcCommand.ICalcCommand.POP";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        float outputNumber;
        System.out.println("ICalcCommand.ICalcCommand.POP result: ");
        if (!numbersStack.isEmpty()) {
            outputNumber = numbersStack.pop();
            System.out.print(outputNumber);
            System.out.println();
        } else System.out.print("Stack is empty...\n");
    }
}
