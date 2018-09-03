package utils;

import entities.Number;

import java.util.Scanner;

public class PlayerUtils {
    public static Number readNumber(){
        Scanner scanner = new Scanner(System.in);
        int numberToRead = Integer.parseInt(scanner.nextLine());
        Number resultNumber = new Number(numberToRead);

        return resultNumber;
    }
}
