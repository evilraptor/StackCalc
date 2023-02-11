import java.util.Stack;

public class ArithmeticOperations {
    void ADD(ListForCalculatorArguments listForCalculatorArguments) {//Stack<Float> numbersStack
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement + secondElement;
        numbersStack.push(result);
    }

    void SUB(ListForCalculatorArguments listForCalculatorArguments) {//Stack<Float> numbersStack
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement - secondElement;
        numbersStack.push(result);
    }

    void MUL(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement * secondElement;
        numbersStack.push(result);
    }

    void DIV(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement / secondElement;
        numbersStack.push(result);
    }

    void SQRT(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        Float firstElement = numbersStack.pop();
        double tmp = firstElement.doubleValue();
        tmp = Math.sqrt(tmp);
        Float result = (float) tmp;
        numbersStack.push(result);
    }
}
