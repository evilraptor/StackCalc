import java.util.Scanner;
import java.util.Stack;

public final class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world! Its me MARIO");
        StackCalculator calcStack = new StackCalculator();
        Scanner reader = new Scanner(System.in);
        String input = reader.toString();

        reader.close();
        /*calcStack.doCalculation("DEFINE a 4");
        calcStack.doCalculation("PUSH a");
        calcStack.doCalculation("SQRT");
        //calcStack.doCalculation("PUSH 5");
        //calcStack.doCalculation("+");
        calcStack.doCalculation("PRINT");
        //calcStack.DEFINE("a", 5);
        //calcStack.PUSH("a");
        //calcStack.PUSH("2");
        //calcStack.PRINT();*/
    }
}