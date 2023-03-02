package Factory;

import ArithmeticOperation.*;
import CalcCommand.DEFINE;
import CalcCommand.POP;
import CalcCommand.PRINT;
import CalcCommand.PUSH;
import InputOperators.ListForCalculatorArguments;
import Major.ICalcInteract;

import java.util.HashMap;

public class CalcFactory1 implements AbstractCalcFactory1 {
    private HashMap<String, ICalcInteractCreator> calcInteractConstructors = new HashMap<>();
    private ConcreteCalcInteractCreator concreteCalcInteractCreator = new ConcreteCalcInteractCreator();

    CalcFactory1() {
        ICalcInteract define = new DEFINE();
        addCalcCommands("DEFINE", define);
        ICalcInteract print = new PRINT();
        addCalcCommands("PRINT", print);
        ICalcInteract pop = new POP();
        addCalcCommands("POP", pop);
        ICalcInteract push = new PUSH();
        addCalcCommands("PUSH", push);

        ICalcInteract add = new ADD();
        addCalcCommands("+", add);
        ICalcInteract sub = new SUB();
        addCalcCommands("-", sub);
        ICalcInteract mul = new MUL();
        addCalcCommands("*", mul);
        ICalcInteract div = new DIV();
        addCalcCommands("/", div);
        ICalcInteract sqrt = new SQRT();
        addCalcCommands("SQRT", sqrt);
    }

    @Override
    public void addCalcCommands(String interactName, ICalcInteract inputCalcCommand) {
        //concreteCalcInteractCreator tmp = concreteCalcInteractCreator.creatorCalcInteract(inputCalcCommand);
        calcInteractConstructors.put(interactName, concreteCalcInteractCreator);
    }

    @Override
    public void doCalcCommand(ListForCalculatorArguments listForCalculatorArguments) {
        String[] inputArray = listForCalculatorArguments.getText().split(" ");
        //ICalcInteract outputCalcCommand = calcInteract.get(inputArray[0]);
        //outputCalcCommand.getResult(listForCalculatorArguments);
    }

    @Override
    public void doCalculation(ListForCalculatorArguments listForCalculatorArguments) {
        String[] inputArray = listForCalculatorArguments.getText().split(" ");
        //if (calcInteract.containsKey(inputArray[0])) doCalcCommand(listForCalculatorArguments);
        //else System.out.println("There is no command like this...");
    }
}
