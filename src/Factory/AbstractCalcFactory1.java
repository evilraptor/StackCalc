package Factory;

import InputOperators.ListForCalculatorArguments;
import Major.ICalcInteract;

public interface AbstractCalcFactory1 {
    void addCalcCommands(String interactName, ICalcInteract inputCalcCommand);

    void doCalcCommand(ListForCalculatorArguments listForCalculatorArguments);

    void doCalculation(ListForCalculatorArguments listForCalculatorArguments);
}
