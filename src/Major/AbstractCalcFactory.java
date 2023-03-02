package Major;

import InputOperators.ListForCalculatorArguments;

public interface AbstractCalcFactory {

    void addCalcCommands(String commandName, ICalcInteract inputCalcCommand);

    void addArithmeticOperations(String operationName, ICalcInteract inputArithmeticOperation);

    void doCalcCommand(ListForCalculatorArguments listForCalculatorArguments);

    void doArithmeticOperation(ListForCalculatorArguments listForCalculatorArguments);

    void doCalc(ListForCalculatorArguments listForCalculatorArguments);
}