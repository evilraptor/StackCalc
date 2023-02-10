import java.util.Stack;

public class ArithmeticOperations {
    void realization(String operator, Stack<Float> numbersStack) {
        if (operator == "+") ADD(numbersStack);
        if (operator == "-") SUB(numbersStack);
        if (operator == "*") MUL(numbersStack);
        if (operator == "/") DIV(numbersStack);
        if (operator == "SQRT") SQRT(numbersStack);
    }

    void ADD(Stack<Float> numbersStack) {
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement + secondElement;
        numbersStack.push(result);
    }

    void SUB(Stack<Float> numbersStack) {
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement - secondElement;
        numbersStack.push(result);
    }

    void MUL(Stack<Float> numbersStack) {
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement * secondElement;
        numbersStack.push(result);
    }

    void DIV(Stack<Float> numbersStack) {
        Float firstElement = numbersStack.pop();
        Float secondElement = numbersStack.pop();
        Float result = firstElement / secondElement;
        numbersStack.push(result);
    }

    void SQRT(Stack<Float> numbersStack) {
        Float firstElement = numbersStack.pop();
        Double tmp = firstElement.doubleValue();
        tmp = Math.sqrt(tmp);
        Float result = tmp.floatValue();
        numbersStack.push(result);
    }
}
