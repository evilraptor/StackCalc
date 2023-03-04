package Factory;

import CalcInteract.ICalcInteract;

public interface AbstractCalcFactoryWithReflection {
    //void addCalcCommands(String name);

    ICalcInteract create(String name);

    //void doCalcCommand(ListForCalculatorArguments listForCalculatorArguments);

    //void doCalculation(ListForCalculatorArguments listForCalculatorArguments);
}
