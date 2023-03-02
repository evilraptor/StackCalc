package Factory;

import Major.ICalcInteract;

public interface ICalcInteractCreator {
    ICalcInteract creatorCalcInteract(ICalcInteract type);
}
