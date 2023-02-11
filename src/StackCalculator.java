import java.util.HashMap;
import java.util.Stack;

public class StackCalculator {
    Stack<Float> numbersStack = new Stack<>();
    HashMap<String, Float> parameters = new HashMap<>();
    ListForCalculatorArguments listForCalculatorArguments = new ListForCalculatorArguments();
    CalcFactory calcFactory = new CalcFactory();

    void doCalculation(String input) {
        listForCalculatorArguments.add(numbersStack, parameters, input);
        //ArithmeticOperations arithmetic = new ArithmeticOperations();
        //CalcCommands calcCommands = new CalcCommands();
        calcFactory.doCalcCommand(listForCalculatorArguments);



        /*String[] inputArray = input.split(" ");
        if (inputArray[0].equals("+")) arithmetic.ADD(listForCalculatorArguments);
        if (inputArray[0].equals("-")) arithmetic.SUB(listForCalculatorArguments);
        if (inputArray[0].equals("*")) arithmetic.MUL(listForCalculatorArguments);
        if (inputArray[0].equals("/")) arithmetic.DIV(listForCalculatorArguments);
        if (inputArray[0].equals("SQRT")) arithmetic.SQRT(listForCalculatorArguments);
        if (inputArray[0].equals("DEFINE")) calcCommands.DEFINE(listForCalculatorArguments);
        if (inputArray[0].equals("PUSH")) calcCommands.PUSH(listForCalculatorArguments);
        if (inputArray[0].equals("POP")) calcCommands.POP(listForCalculatorArguments);
        if (inputArray[0].equals("PRINT")) calcCommands.PRINT(listForCalculatorArguments);*/
    }
}
