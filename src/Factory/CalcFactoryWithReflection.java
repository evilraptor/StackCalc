package Factory;

import CalcInteract.*;
import CalcInteract.ICalcInteract;

import java.util.HashMap;

public class CalcFactoryWithReflection implements AbstractCalcFactoryWithReflection {

    public CalcFactoryWithReflection() {
        ICalcInteract define = new DEFINE();
        ICalcInteract print = new PRINT();
        ICalcInteract pop = new POP();
        ICalcInteract push = new PUSH();

        ICalcInteract add = new ADD();
        ICalcInteract sub = new SUB();
        ICalcInteract mul = new MUL();
        ICalcInteract div = new DIV();
        ICalcInteract sqrt = new SQRT();
    }

    private HashMap<String, ICalcInteractCreator> calcInteractCreators = new HashMap<>();
    //private ConcreteCalcInteractCreator concreteCalcInteractCreator = new ConcreteCalcInteractCreator();

    /*@Override
    public void addCalcCommands(String name) {
        if(calcInteractCreators.get(name)==null){
            ConcreteCalcInteractCreator concreteCalcInteractCreator=new ConcreteCalcInteractCreator();
            calcInteractCreators.put(name,concreteCalcInteractCreator.create(name));
        }
    }*/

    @Override
    public ICalcInteract create(String name) {
        ConcreteCalcInteractCreator concreteCalcInteractCreator = new ConcreteCalcInteractCreator();
        ICalcInteract tmp = concreteCalcInteractCreator.create(name);
        return tmp;
    }
}
