package module1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {

    Scanner sc = new Scanner(System.in);

    public int inputNumber(String message){
        System.out.println(message);
        int number = sc.nextInt();
        return number;
    }

    public int selectOption(String text, String... args){
        int count = 0;
        StringBuilder builder = new StringBuilder(text);
        for (String option : args)  {
            count++;
            builder.append("\n").append(count + " - ").append(option);
        }
        return inputNumber(builder.toString());
    }
}
