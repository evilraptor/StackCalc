import java.util.HashMap;
import java.util.Stack;

public class CalcOperations {
    public static boolean isNumeric(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //ListForCalculatorOperation listForCalculatorOperation
    //Stack<Float> numbersStack, HashMap<String, Float> parameters, String input
    public void DEFINE(ListForCalculatorOperation listForCalculatorOperation) {
        Stack<Float> numbersStack = listForCalculatorOperation.getStack();
        HashMap<String, Float> parameters = listForCalculatorOperation.getParameters();
        String input = listForCalculatorOperation.getText();

        String[] inputArray = input.split(" ");
        String inputParameter = inputArray[1];
        Float value = Float.valueOf(inputArray[2]);
        parameters.put(inputParameter, value);
    }

    //Stack<Float> numbersStack, HashMap<String, Float> parameters, String input
    public void PUSH(ListForCalculatorOperation listForCalculatorOperation) {
        Stack<Float> numbersStack = listForCalculatorOperation.getStack();
        HashMap<String, Float> parameters = listForCalculatorOperation.getParameters();
        String input = listForCalculatorOperation.getText();

        String[] inputArray = input.split(" ");
        Float tmp;
        if (!isNumeric(inputArray[1])) {
            tmp = parameters.get(inputArray[1]);
            if (tmp == null) {
                System.out.println("there is no key like this");
            } //else System.out.println("ok");
        } else
            tmp = Float.valueOf(inputArray[1]);
        numbersStack.push(tmp);
    }

    //Stack<Float> numbersStack, HashMap<String, Float> parameters
    public void POP(ListForCalculatorOperation listForCalculatorOperation) {
        Stack<Float> numbersStack = listForCalculatorOperation.getStack();
        HashMap<String, Float> parameters = listForCalculatorOperation.getParameters();

        float outputNumber;
        System.out.println("POP result: ");
        if (!numbersStack.isEmpty()) {
            outputNumber = numbersStack.pop();
            System.out.print(outputNumber);
            System.out.println();
        } else System.out.print("Stack is empty...\n");
    }

    //Stack<Float> numbersStack, HashMap<String, Float> parameters
    public void PRINT(ListForCalculatorOperation listForCalculatorOperation) {
        Stack<Float> numbersStack = listForCalculatorOperation.getStack();
        HashMap<String, Float> parameters = listForCalculatorOperation.getParameters();

        System.out.println("PRINT result: ");
        if (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.peek());
            System.out.println();
        } else System.out.print("Stack is empty...\n");
    }
}
