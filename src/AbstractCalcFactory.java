import java.util.HashMap;

public interface AbstractCalcFactory {
    HashMap<String, ICalcCommand> calcCommands = new HashMap<>();
    HashMap<String, IArithmeticOperation> arithmeticOperations = new HashMap<>();

    void addCalcCommands(String commandName, ICalcCommand inputCalcCommand);

    void addArithmeticOperations(String operationName, IArithmeticOperation inputArithmeticOperation);

    void doCalcCommand(ListForCalculatorArguments listForCalculatorArguments);

    void doArithmeticOperation(ListForCalculatorArguments listForCalculatorArguments);

    void doCalc(ListForCalculatorArguments listForCalculatorArguments);
}