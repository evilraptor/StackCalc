package Major;

import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        StackCalculator stackCalculator = new StackCalculator();

        Scanner in = new Scanner(System.in);
        String input = "1";
        int counter = 0;
        while (!input.equals("EXIT")) {
            System.out.print(counter + ":   ");
            input = in.nextLine();
            stackCalculator.doCalculation(input);
            counter++;
        }
        in.close();
    }
}