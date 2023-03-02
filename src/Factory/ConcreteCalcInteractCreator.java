package Factory;

import InputOperators.ListForCalculatorArguments;
import Major.ICalcInteract;

public class ConcreteCalcInteractCreator implements ICalcInteractCreator {

    @Override
    public ICalcInteract creatorCalcInteract(ICalcInteract type) {
        return new ICalcInteract() {
            @Override
            public void getResult(ListForCalculatorArguments listForCalculatorArguments) {
                type.getResult(listForCalculatorArguments);

            }
        };
        //return new ;

    }
}
