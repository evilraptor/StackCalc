import java.util.HashMap;
import java.util.Stack;

public class ListForCalculatorArguments {
    private Stack<Float> numbersStack;
    private HashMap<String, Float> parameters;
    private String text;

    void add(Stack<Float> inputNumbersStack, HashMap<String, Float> inputParameters, String inputText) {
        numbersStack = inputNumbersStack;
        parameters = inputParameters;
        text = inputText;
    }

    Stack<Float> getStack() {
        return numbersStack;
    }

    HashMap<String, Float> getParameters() {
        return parameters;
    }

    String getText() {
        return text;
    }
}
