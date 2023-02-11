import java.util.Stack;

public class MUL implements IArithmeticOperation {

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement * secondElement;
        numbersStack.push(result);
    }
}
