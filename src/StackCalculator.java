import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackCalculator {
    Stack<Float> numbersStack = new Stack<>();

    void doCalculation(String input) {
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        if (input == "+") arithmetic.ADD(numbersStack);
        if (input == "-") arithmetic.SUB(numbersStack);
        if (input == "*") arithmetic.MUL(numbersStack);
        if (input == "/") arithmetic.DIV(numbersStack);
        if (input == "SQRT") arithmetic.SQRT(numbersStack);

        Map<String, Float> parameters = new HashMap<>();
        CalcOperations calcOperations = new CalcOperations();
        String[] inputArray = input.split(" ");
        if (inputArray.length > 0) System.out.println(inputArray[0]);
        if (inputArray.length > 1) System.out.println(inputArray[1]);
        if (inputArray.length > 2) System.out.println(inputArray[2]);
        if (inputArray[0] == "DEFINE") calcOperations.DEFINE(numbersStack, parameters, input);
        if (inputArray[0] == "PUSH") calcOperations.PUSH(numbersStack, parameters, input);
        if (inputArray[0] == "POP") calcOperations.POP(numbersStack, parameters);
        if (inputArray[0] == "PRINT") calcOperations.PRINT(numbersStack, parameters);
    }
}
