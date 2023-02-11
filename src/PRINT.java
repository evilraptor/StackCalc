import java.util.Stack;

public class PRINT implements ICalcCommand {

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        System.out.println("PRINT result: ");
        if (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.peek());
            System.out.println();
        } else System.out.print("Stack is empty...\n");
    }
}
