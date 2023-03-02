package Major;

import CalcCommand.*;
import Factory.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        /*ICalcInteract push = new PUSH();
        ICalcInteract pop = new POP();
        ConcreteCalcInteractCreator concreteCalcInteractCreator = new ConcreteCalcInteractCreator();
        ICalcInteract tmp1 = concreteCalcInteractCreator.creatorCalcInteract(push);
        ICalcInteract tmp2 = concreteCalcInteractCreator.creatorCalcInteract(pop);*/


        //нет аргументов программы
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
            //есть аргументы программы
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(args[0]);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
            int i;
            StringBuilder inputFromTxt = new StringBuilder();
            try {
                int counter = 0;
                while ((i = fileInputStream.read()) != -1) {
                    //13-\r 10-\n EOF вернет -1

                    if (i != 10) inputFromTxt.append((char) i);
                    else {//(i == 10)
                        System.out.println(counter + ":   " + inputFromTxt);
                        stackCalculator.doCalculation(inputFromTxt.toString());
                        inputFromTxt = new StringBuilder();
                        counter++;
                    }
                }
                System.out.println(counter + ":   " + inputFromTxt);
                stackCalculator.doCalculation(inputFromTxt.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}