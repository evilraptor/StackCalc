import java.util.Stack;

public class ArithmeticOperations {
    void ADD(ListForCalculatorOperation listForCalculatorOperation) {//Stack<Float> numbersStack
        Stack<Float> numbersStack = listForCalculatorOperation.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement + secondElement;
        numbersStack.push(result);
    }

    void SUB(ListForCalculatorOperation listForCalculatorOperation) {//Stack<Float> numbersStack
        Stack<Float> numbersStack = listForCalculatorOperation.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement - secondElement;
        numbersStack.push(result);
    }

    void MUL(ListForCalculatorOperation listForCalculatorOperation) {
        Stack<Float> numbersStack = listForCalculatorOperation.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement * secondElement;
        numbersStack.push(result);
    }

    void DIV(ListForCalculatorOperation listForCalculatorOperation) {
        Stack<Float> numbersStack = listForCalculatorOperation.getStack();
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement / secondElement;
        numbersStack.push(result);
    }

    void SQRT(ListForCalculatorOperation listForCalculatorOperation) {
        Stack<Float> numbersStack = listForCalculatorOperation.getStack();
        Float firstElement = numbersStack.pop();
        double tmp = firstElement.doubleValue();
        tmp = Math.sqrt(tmp);
        Float result = (float) tmp;
        numbersStack.push(result);
    }
}
