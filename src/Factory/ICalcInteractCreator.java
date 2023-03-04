package Factory;

import CalcInteract.ICalcInteract;

public interface ICalcInteractCreator {
    public ICalcInteract create(String id);
}
