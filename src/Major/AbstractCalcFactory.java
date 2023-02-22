package Major;

import IArithmeticOperation.IArithmeticOperation;
import ICalcCommand.ICalcCommand;
import InputOperators.ListForCalculatorArguments;

import java.util.HashMap;

public interface AbstractCalcFactory {

    void addCalcCommands(String commandName, ICalcCommand inputCalcCommand);

    void addArithmeticOperations(String operationName, IArithmeticOperation inputArithmeticOperation);

    void doCalcCommand(ListForCalculatorArguments listForCalculatorArguments);

    void doArithmeticOperation(ListForCalculatorArguments listForCalculatorArguments);

    void doCalc(ListForCalculatorArguments listForCalculatorArguments);
}