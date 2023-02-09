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
        if (input == "DEFINE") calcOperations.DEFINE(numbersStack, parameters, input);
        if (input == "PUSH") calcOperations.PUSH(numbersStack, parameters, input);
        if (input == "POP") calcOperations.POP(numbersStack, parameters);
        if (input == "PRINT") calcOperations.PRINT(numbersStack, parameters);
    }
}
