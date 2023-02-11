public interface CalcFactory {
    ICalcCommands createCalcCommands();

    IArithmeticOperations createArithmeticOperation();
}