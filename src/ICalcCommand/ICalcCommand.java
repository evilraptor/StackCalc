package ICalcCommand;

import InputOperators.ListForCalculatorArguments;

public interface ICalcCommand {
    String getName();

    void getResult(ListForCalculatorArguments listForCalculatorArguments);
}
