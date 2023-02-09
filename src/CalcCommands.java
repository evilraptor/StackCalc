//import java.util.Stack;

public class CalcCommands {
    private FloatStack numbersStack;

    public void a() {
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
}