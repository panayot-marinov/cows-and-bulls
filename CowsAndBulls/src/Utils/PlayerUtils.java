package Utils;

import MainElements.Number;

import java.util.Scanner;

public class PlayerUtils {
    public static Number ReadNumber(){
        Scanner scanner = new Scanner(System.in);
        int numberToRead = Integer.parseInt(scanner.nextLine());
        Number resultNumber = new Number(numberToRead);

        return resultNumber;
    }
}
