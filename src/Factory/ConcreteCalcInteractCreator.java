package Factory;

import CalcInteract.*;

public class ConcreteCalcInteractCreator implements ICalcInteractCreator {
    @Override
    public ICalcInteract create(String name) {
        ICalcInteract calcInteract = null;

        try {
            calcInteract = (ICalcInteract) Class.forName(name).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return calcInteract;
    }
}
