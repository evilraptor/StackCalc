package Major;

import CalcInteract.ICalcInteract;
import InputOperators.ListForCalculatorArguments;

public interface AbstractCalcFactory {

    void addCalcCommands(String commandName, ICalcInteract inputCalcCommand);

    void addArithmeticOperations(String operationName, ICalcInteract inputArithmeticOperation);

    void doCalcCommand(ListForCalculatorArguments listForCalculatorArguments);

    void doArithmeticOperation(ListForCalculatorArguments listForCalculatorArguments);

    void doCalculation(ListForCalculatorArguments listForCalculatorArguments);
}