import java.util.HashMap;
import java.util.Stack;

public class StackCalculator {
    Stack<Float> numbersStack = new Stack<>();
    HashMap<String, Float> parameters = new HashMap<>();
    ListForCalculatorOperation listForCalculatorOperation = new ListForCalculatorOperation();

    void doCalculation(String input) {
        listForCalculatorOperation.add(numbersStack, parameters, input);
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        CalcOperations calcOperations = new CalcOperations();
        String[] inputArray = input.split(" ");
        if (inputArray[0].equals("+")) arithmetic.ADD(listForCalculatorOperation);
        if (inputArray[0].equals("-")) arithmetic.SUB(listForCalculatorOperation);
        if (inputArray[0].equals("*")) arithmetic.MUL(listForCalculatorOperation);
        if (inputArray[0].equals("/")) arithmetic.DIV(listForCalculatorOperation);
        if (inputArray[0].equals("SQRT")) arithmetic.SQRT(listForCalculatorOperation);
        if (inputArray[0].equals("DEFINE")) calcOperations.DEFINE(listForCalculatorOperation);
        if (inputArray[0].equals("PUSH")) calcOperations.PUSH(listForCalculatorOperation);
        if (inputArray[0].equals("POP")) calcOperations.POP(listForCalculatorOperation);
        if (inputArray[0].equals("PRINT")) calcOperations.PRINT(listForCalculatorOperation);
    }
}
