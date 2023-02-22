package ICalcCommand;

import InputOperators.ListForCalculatorArguments;

import java.util.HashMap;

public class DEFINE implements ICalcCommand {
    String name = "ICalcCommand.ICalcCommand.DEFINE";

    @Override
    public String getName() {
        return name;
    }

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