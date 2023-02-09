import java.util.Map;
import java.util.Stack;

public class StackCalculator {
    Stack<Float> numbersStack;

    public final void a() {
        System.out.println("7334");
    }

    public void PUSH(float inputNumber) {
        numbersStack.push(inputNumber);
    }

    public float POP(float inputNumber) {
        float outputNumber = numbersStack.pop();
        return outputNumber;
    }

    public float PRINT() {
        float outputNumber = numbersStack.peek();
        return outputNumber;
    }

    Map<String, Float> parameters;

    public void DEFINE(String inputParameter, float value) {
        parameters.put(inputParameter, value);
    }
}
