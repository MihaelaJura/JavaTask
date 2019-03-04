package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.Function.*;


public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int userInput;
        int userInput1;
        int userInput2;
        String s;


        //First task
        System.err.println("------First Task------");

        do {
            System.out.println("Enter an integer between 0 and 1000");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a number");
                sc.next();//finds and returns the next complete token from this scanner
            }
            userInput = sc.nextInt();
        } while ((userInput < 0) & (userInput > 1000));

        System.out.println("The sum of the Digits is:" + sumDigits(userInput));


        //Second task
        System.err.println("------Second Task------");

        System.out.println("Enter first integer:");
        while (!sc.hasNextInt()) {
            System.out.println("This is not a number");
            sc.next();//finds and returns the next complete token from this scanner
        }
        userInput1 = sc.nextInt();
        System.out.println("Enter the second integer:");
        while (!sc.hasNextInt()) {
            System.out.println("This is not a number");
            sc.next();//finds and returns the next complete token from this scanner
        }
        userInput2 = sc.nextInt();


        System.out.println("The sum of the integers is:" + sumTwoIntegers(userInput1, userInput2));
        System.out.println("The difference of the integers is:" + differenceTwoIntegers(userInput1, userInput2));
        System.out.println("The product of the integers is:" + productTwoIntegers(userInput1, userInput2));
        System.out.println("The average of the integers is:" + averageTwoInteger(userInput1, userInput2));
        System.out.println("The distance of the integers is:" + distanceTwoIntegers(userInput1, userInput2));
        System.out.println("The maximum of the integers is:" + maxTwoInteger(userInput1, userInput2));
        System.out.println("The minimum of the integers is:" + minTwoInteger(userInput1, userInput2));


        //Third task
        System.err.println("------Third Task------");

        System.out.println("Enter a string:");
        sc.nextLine();
        s = sc.nextLine();
        System.out.println("The string reversed is:" + reverseString(s));

        //Fourth task
        System.err.println("------Fourth Task------");
        polindrom(s);

        //Fifth task
        System.err.println("------Fifth Task------");
        countTypesInString(s);

        //Sixth task
        System.err.println("------Sixth Task------");
        dividedByThreeOrFive();


        //Seventh task


        Object test[];
        test = new Object[]{"Today", new Person(), 44234234, "is", 23, 652, "a", new Person(), "big", "day"};
        System.err.println("------Seventh Task------");
        method(test);
    }
}

