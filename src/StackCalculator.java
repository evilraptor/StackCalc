import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackCalculator {
    Stack<Float> numbersStack = new Stack<>();
    HashMap<String, Float> parameters = new HashMap<>();

    void doCalculation(String input) {
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        CalcOperations calcOperations = new CalcOperations();
        String[] inputArray = input.split(" ");
        //if (inputArray.length > 0) System.out.println(inputArray[0]);
        //if (inputArray.length > 1) System.out.println(inputArray[1]);
        //if (inputArray.length > 2) System.out.println(inputArray[2]);
        if (inputArray[0].equals("+")) arithmetic.ADD(numbersStack);
        if (inputArray[0].equals("-")) arithmetic.SUB(numbersStack);
        if (inputArray[0].equals("*")) arithmetic.MUL(numbersStack);
        if (inputArray[0].equals("/")) arithmetic.DIV(numbersStack);
        if (inputArray[0].equals("SQRT")) arithmetic.SQRT(numbersStack);
        if (inputArray[0].equals("DEFINE")) calcOperations.DEFINE(numbersStack, parameters, input);
        if (inputArray[0].equals("PUSH")) calcOperations.PUSH(numbersStack, parameters, input);
        if (inputArray[0].equals("POP")) calcOperations.POP(numbersStack, parameters);
        if (inputArray[0].equals("PRINT")) calcOperations.PRINT(numbersStack, parameters);
    }
}
