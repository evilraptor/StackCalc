import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world! Its me MARIO");
        StackCalculator stackCalculator = new StackCalculator();

        Scanner in = new Scanner(System.in);
        //System.out.print("Say Something to World: ");
        String input = "1";
        int counter = 0;
        while (!input.equals("EXIT")) {
            System.out.print(counter + ":   ");
            input = in.nextLine();
            stackCalculator.doCalculation(input);
            counter++;
            //System.out.println();
        }
        //System.out.printf("Your number: %s \n", num);
        in.close();
    }
}