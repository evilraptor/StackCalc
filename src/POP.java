import java.util.Stack;

public class POP implements ICalcCommand {

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        float outputNumber;
        System.out.println("POP result: ");
        if (!numbersStack.isEmpty()) {
            outputNumber = numbersStack.pop();
            System.out.print(outputNumber);
            System.out.println();
        } else System.out.print("Stack is empty...\n");
    }
}
