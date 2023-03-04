package Major;

import CalcInteract.*;
import InputOperators.ListForCalculatorArguments;

import java.util.HashMap;

public class CalcFactory implements AbstractCalcFactory {
    private HashMap<String, ICalcInteract> calcCommands = new HashMap<>();
    private HashMap<String, ICalcInteract> arithmeticOperations = new HashMap<>();

    CalcFactory() {
        ICalcInteract define = new DEFINE();
        addCalcCommands("DEFINE", define);
        ICalcInteract print = new PRINT();
        addCalcCommands("PRINT", print);
        ICalcInteract pop = new POP();
        addCalcCommands("POP", pop);
        ICalcInteract push = new PUSH();
        addCalcCommands("PUSH", push);

        ICalcInteract add = new ADD();
        addArithmeticOperations("+", add);
        ICalcInteract sub = new SUB();
        addArithmeticOperations("-", sub);
        ICalcInteract mul = new MUL();
        addArithmeticOperations("*", mul);
        ICalcInteract div = new DIV();
        addArithmeticOperations("/", div);
        ICalcInteract sqrt = new SQRT();
        addArithmeticOperations("SQRT", sqrt);
    }

    @Override
    public void addCalcCommands(String commandName, ICalcInteract inputCalcCommand) {
        calcCommands.put(commandName, inputCalcCommand);
    }

    @Override
    public void addArithmeticOperations(String operationName, ICalcInteract inputArithmeticOperation) {
        arithmeticOperations.put(operationName, inputArithmeticOperation);
    }

    @Override
    public void doCalcCommand(ListForCalculatorArguments listForCalculatorArguments) {
        String[] inputArray = listForCalculatorArguments.getText().split(" ");
        ICalcInteract outputCalcCommand = calcCommands.get(inputArray[0]);
        outputCalcCommand.getResult(listForCalculatorArguments);

        //outputCalcCommand.getName();
        //new <ICalcCommand.ICalcCommand>;
    }

    @Override
    public void doArithmeticOperation(ListForCalculatorArguments listForCalculatorArguments) {
        //IArithmeticOperation.IArithmeticOperation a = arithmeticOperations.get("+");
        String[] inputArray = listForCalculatorArguments.getText().split(" ");
        ICalcInteract outputArithmeticOperation = arithmeticOperations.get(inputArray[0]);
        outputArithmeticOperation.getResult(listForCalculatorArguments);
    }

    @Override
    public void doCalculation(ListForCalculatorArguments listForCalculatorArguments) {
        String[] inputArray = listForCalculatorArguments.getText().split(" ");
        if (calcCommands.containsKey(inputArray[0])) doCalcCommand(listForCalculatorArguments);
        else if (arithmeticOperations.containsKey(inputArray[0]))
            doArithmeticOperation(listForCalculatorArguments);
        else System.out.println("There is no command like this...");
    }
}
