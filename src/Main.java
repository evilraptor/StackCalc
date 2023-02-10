import java.util.Stack;

public final class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world! Its me MARIO");
        StackCalculator calcStack = new StackCalculator();
        calcStack.doCalculation("DEFINE a 5");
        calcStack.doCalculation("PUSH a");
        calcStack.doCalculation("PRINT");
        //calcStack.DEFINE("a", 5);
        //calcStack.PUSH("a");
        //calcStack.PUSH("2");
        //calcStack.PRINT();
    }
}