package CalcCommand;

import InputOperators.ListForCalculatorArguments;
import Major.ICalcInteract;

import java.util.HashMap;

public class DEFINE implements ICalcInteract {
    private final String name = "ICalcCommand.ICalcCommand.DEFINE";

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        HashMap<String, Float> parameters = listForCalculatorArguments.getParameters();
        String input = listForCalculatorArguments.getText();

        String[] inputArray = input.split(" ");
        String inputParameter = inputArray[1];
        Float value = Float.valueOf(inputArray[2]);
        parameters.put(inputParameter, value);
    }
}