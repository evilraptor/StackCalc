//import java.util.Stack;

public class CalcCommands {
    //static int defaultNumberStackSize = 10;
    //private int[] numbersStack = new int[defaultNumberStackSize];

    private FloatStack numbersStack;

    public void a() {
        System.out.println("7334");
    }

    public void PUSH(float inputNumber) {
        numbersStack.push(inputNumber);
    }

    public void POP(float inputNumber) {
        numbersStack.pop();
    }

    public float PRINT() {
        float outputNumber = numbersStack.peek();
        return outputNumber;
    }
}