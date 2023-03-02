package Factory;

import InputOperators.ListForCalculatorArguments;
import Major.ICalcInteract;

public class CalcInteractTemp implements ICalcInteract {

    @Override
    public void getResult(ListForCalculatorArguments listForCalculatorArguments) {

    }

    //конструктор копирования
    CalcInteractTemp(ICalcInteract inputClass) {
        //this(inputClass.getResult(ListForCalculatorArguments));
    }
}
