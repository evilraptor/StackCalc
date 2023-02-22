package Major;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        StackCalculator stackCalculator = new StackCalculator();
        if (args.length == 0) {
            System.out.println("(no args in the input)");
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
        } else {
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(args[0]);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
            int i;
            String inputFromTxt = "";
            try {
                int counter = 0;
                while ((i = fileInputStream.read()) != -1) {
                    //13-\r 10-\n EOF вернет -1
                    char buf = (char) i;

                    if (i != 10) inputFromTxt = inputFromTxt + (char) i;
                    //System.out.print((char) i);
                    if ((i == 10) || (i == 0)) {
                        System.out.println(counter + ":   " + inputFromTxt);
                        stackCalculator.doCalculation(inputFromTxt);
                        inputFromTxt = "";
                        counter++;
                    }
                }
                System.out.println(counter + ":   " + inputFromTxt);
                stackCalculator.doCalculation(inputFromTxt);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}