package Factory;

import Major.ICalcInteract;

public interface ICreator {
    ICalcInteract creatorCalcInteract(ICalcInteract type);
}
