import java.util.HashMap;
import java.util.Stack;

public class PUSH implements ICalcCommand {

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        HashMap<String, Float> parameters = listForCalculatorArguments.getParameters();
        String input = listForCalculatorArguments.getText();

        String[] inputArray = input.split(" ");
        Float tmp;
        if (!CalcCommands.isNumeric(inputArray[1])) {
            tmp = parameters.get(inputArray[1]);
            if (tmp == null) {
                System.out.println("there is no key like this");
            } //else System.out.println("ok");
        } else
            tmp = Float.valueOf(inputArray[1]);
        numbersStack.push(tmp);
    }
}
