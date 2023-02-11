import java.util.HashMap;
import java.util.Stack;

public class CalcCommands {
    public static boolean isNumeric(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    /*public class DEFINE implements ICalcCommand {

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

    public class PUSH implements ICalcCommand {

        @Override
        public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
            Stack<Float> numbersStack = listForCalculatorArguments.getStack();
            HashMap<String, Float> parameters = listForCalculatorArguments.getParameters();
            String input = listForCalculatorArguments.getText();

            String[] inputArray = input.split(" ");
            Float tmp;
            if (!isNumeric(inputArray[1])) {
                tmp = parameters.get(inputArray[1]);
                if (tmp == null) {
                    System.out.println("there is no key like this");
                } //else System.out.println("ok");
            } else
                tmp = Float.valueOf(inputArray[1]);
            numbersStack.push(tmp);
        }
    }

    public class POP implements ICalcCommand {

        @Override
        public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
            Stack<Float> numbersStack = listForCalculatorArguments.getStack();
            float outputNumber;
            System.out.println("POP result: ");
            if (!numbersStack.isEmpty()) {
                outputNumber = numbersStack.pop();
                System.out.print(outputNumber);
                System.out.println();
            } else System.out.print("Stack is empty...\n");
        }
    }

    public class PRINT implements ICalcCommand {

        @Override
        public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
            Stack<Float> numbersStack = listForCalculatorArguments.getStack();
            System.out.println("PRINT result: ");
            if (!numbersStack.isEmpty()) {
                System.out.print(numbersStack.peek());
                System.out.println();
            } else System.out.print("Stack is empty...\n");
        }
    }

    /*public void DEFINE(ListForCalculatorArguments listForCalculatorArguments) {
        //Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        HashMap<String, Float> parameters = listForCalculatorArguments.getParameters();
        String input = listForCalculatorArguments.getText();

        String[] inputArray = input.split(" ");
        String inputParameter = inputArray[1];
        Float value = Float.valueOf(inputArray[2]);
        parameters.put(inputParameter, value);
    }

    public void PUSH(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        HashMap<String, Float> parameters = listForCalculatorArguments.getParameters();
        String input = listForCalculatorArguments.getText();

        String[] inputArray = input.split(" ");
        Float tmp;
        if (!isNumeric(inputArray[1])) {
            tmp = parameters.get(inputArray[1]);
            if (tmp == null) {
                System.out.println("there is no key like this");
            } //else System.out.println("ok");
        } else
            tmp = Float.valueOf(inputArray[1]);
        numbersStack.push(tmp);
    }

    public void POP(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        float outputNumber;
        System.out.println("POP result: ");
        if (!numbersStack.isEmpty()) {
            outputNumber = numbersStack.pop();
            System.out.print(outputNumber);
            System.out.println();
        } else System.out.print("Stack is empty...\n");
    }

    public void PRINT(ListForCalculatorArguments listForCalculatorArguments) {
        Stack<Float> numbersStack = listForCalculatorArguments.getStack();
        System.out.println("PRINT result: ");
        if (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.peek());
            System.out.println();
        } else System.out.print("Stack is empty...\n");
    }*/
}
