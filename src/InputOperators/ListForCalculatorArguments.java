package InputOperators;

import java.util.HashMap;
import java.util.Stack;

public class ListForCalculatorArguments {
    private Stack<Float> numbersStack;
    private HashMap<String, Float> parameters;
    private String text;

    public void add(Stack<Float> inputNumbersStack, HashMap<String, Float> inputParameters, String inputText) {
        numbersStack = inputNumbersStack;
        parameters = inputParameters;
        text = inputText;
    }

    public Stack<Float> getStack() {
        return numbersStack;
    }

    public HashMap<String, Float> getParameters() {
        return parameters;
    }

    public String getText() {
        return text;
    }
}
