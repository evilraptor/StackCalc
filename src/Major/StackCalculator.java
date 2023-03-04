package Major;

import CalcInteract.ICalcInteract;
import Factory.CalcFactoryWithReflection;
import Factory.ConcreteCalcInteractCreator;
import InputOperators.ListForCalculatorArguments;

import java.util.HashMap;
import java.util.Stack;


public class StackCalculator {

    public static boolean isNumeric(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private Stack<Float> numbersStack = new Stack<>();
    private HashMap<String, Float> parameters = new HashMap<>();
    private ListForCalculatorArguments listForCalculatorArguments = new ListForCalculatorArguments();
    private HashMap<String, ICalcInteract> listOfInteractCommands = new HashMap<>();
    private CalcFactory calcFactory = new CalcFactory();
    private CalcFactoryWithReflection calcFactoryWithReflection = new CalcFactoryWithReflection();

    void doCalculation(String input) {
        listForCalculatorArguments.add(numbersStack, parameters, input);
        calcFactory.doCalculation(listForCalculatorArguments);
    }

    void doCalculationWithReflection(String input) {
        if (listOfInteractCommands.get(input) == null) {
            ConcreteCalcInteractCreator concreteCalcInteractCreator = new ConcreteCalcInteractCreator();
            String[] inputArray = input.split(" ");
            listOfInteractCommands.put(input, calcFactoryWithReflection.create("CalcInteract." + inputArray[0]));
        }
        ICalcInteract tmp = listOfInteractCommands.get(input);
        listForCalculatorArguments.add(numbersStack, parameters, input);
        tmp.getResult(listForCalculatorArguments);
    }
}
