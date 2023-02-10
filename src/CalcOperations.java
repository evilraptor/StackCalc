import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class CalcOperations {
    public static boolean isNumeric(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void DEFINE(Stack<Float> numbersStack, HashMap<String, Float> parameters, String input) {
        //System.out.println("AAAAAAAAAAAAAAAA");
        String[] inputArray = input.split(" ");
        String inputParameter = inputArray[1];
        Float value = Float.valueOf(inputArray[2]);
        parameters.put(inputParameter, value);
    }

    public void PUSH(Stack<Float> numbersStack, HashMap<String, Float> parameters, String input) {
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

    public float POP(Stack<Float> numbersStack, HashMap<String, Float> parameters) {
        float outputNumber = numbersStack.pop();
        return outputNumber;
    }

    public int PRINT(Stack<Float> numbersStack, HashMap<String, Float> parameters) {
        //float outputNumber = numbersStack.peek();
        if (!numbersStack.isEmpty()) System.out.println(numbersStack.peek());
        else System.out.println("nothing...");
        return 0;
    }
}
