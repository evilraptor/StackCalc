import java.util.Stack;

public class SQRT implements IArithmeticOperation {

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
