public class CalcFactory implements AbstractCalcFactory {
    CalcFactory() {
        ICalcCommand define = new DEFINE();
        addCalcCommands("DEFINE", define);
        ICalcCommand print = new PRINT();
        addCalcCommands("PRINT", print);
        ICalcCommand pop = new POP();
        addCalcCommands("POP", pop);
        ICalcCommand push = new PUSH();
        addCalcCommands("PUSH", push);

        IArithmeticOperation add = new ADD();
        addArithmeticOperations("+", add);
        IArithmeticOperation sub = new SUB();
        addArithmeticOperations("-", sub);
        IArithmeticOperation mul = new MUL();
        addArithmeticOperations("*", mul);
        IArithmeticOperation div = new DIV();
        addArithmeticOperations("/", div);
        IArithmeticOperation sqrt = new SQRT();
        addArithmeticOperations("SQRT", sqrt);
    }

    @Override
    public void addCalcCommands(String commandName, ICalcCommand inputCalcCommand) {
        calcCommands.put(commandName, inputCalcCommand);
    }

    @Override
    public void addArithmeticOperations(String operationName, IArithmeticOperation inputArithmeticOperation) {
        arithmeticOperations.put(operationName, inputArithmeticOperation);
    }

    @Override
    public void doCalcCommand(ListForCalculatorArguments listForCalculatorArguments) {
        String[] inputArray = listForCalculatorArguments.getText().split(" ");
        ICalcCommand outputCalcCommand = calcCommands.get(inputArray[0]);
        outputCalcCommand.getResult(listForCalculatorArguments);
        //new <ICalcCommand>;
    }

    @Override
    public void doArithmeticOperation(ListForCalculatorArguments listForCalculatorArguments) {
        //IArithmeticOperation a = arithmeticOperations.get("+");
        String[] inputArray = listForCalculatorArguments.getText().split(" ");
        IArithmeticOperation outputArithmeticOperation = arithmeticOperations.get(inputArray[0]);
        outputArithmeticOperation.getResult(listForCalculatorArguments);
    }

    @Override
    public void doCalc(ListForCalculatorArguments listForCalculatorArguments) {
        String[] inputArray = listForCalculatorArguments.getText().split(" ");
        if (calcCommands.containsKey(inputArray[0])) doCalcCommand(listForCalculatorArguments);
        else if (arithmeticOperations.containsKey(inputArray[0])) doArithmeticOperation(listForCalculatorArguments);
        else System.out.println("There is no command like this...");
    }
}
