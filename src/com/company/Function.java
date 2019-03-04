package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.min;
import static java.lang.StrictMath.max;

public class Function {
    public static int sumDigits(int i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }

    public static int sumTwoIntegers(int a, int b) {
        return (a + b);
    }

    public static int differenceTwoIntegers(int a, int b) {
        return (a - b);
    }

    public static int productTwoIntegers(int a, int b) {
        return (a * b);
    }

    public static double averageTwoInteger(int a, int b) {
        return ((a + b) / 2);
    }

    public static int distanceTwoIntegers(int a, int b) {
        if (a > b)
            return (a - b);
        else return (b - a);
    }

    public static int maxTwoInteger(int a, int b) {
        return max(a, b);
//        if(a>b)
//           return a;
//        else return b;
    }

    public static int minTwoInteger(int a, int b) {
        return min(a, b);
//        if(a>b)
//           return b;
//        else return a;
    }

    public static String reverseString(String str) {
        if (str.length() == 0)
            return "";
        String r = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            r = r + str.charAt(i);
        }
        return r;
    }

    public static void polindrom(String str) {
        if (reverseString(str).equals(str)) {
            System.out.println("The word is a polindrome");
        } else
            System.out.println("The word is not a polindrome");
    }

    public static void countTypesInString(String str) {
        int sumNumbers = 0, sumLetters = 0, sumSpace = 0, sumeOthers = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i))) {
                sumNumbers++;
            } else if (Character.isLetter(str.charAt(i))) {
                sumLetters++;
            } else if (Character.isSpaceChar(str.charAt(i))) {
                sumSpace++;
            } else {
                sumeOthers++;
            }
        }
        System.out.println("Numbers:" + sumNumbers);
        System.out.println("Letters:" + sumLetters);
        System.out.println("Spaces:" + sumSpace);
        System.out.println("Others:" + sumeOthers);
    }

    public static void dividedByThreeOrFive() {
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.print(i + ", ");
        }
        System.out.println("");
    }

    public static void method(Object test[]) {
        int sum = 0;
        List<Person> personList = new ArrayList<>();
        for (Object o : test) {
            if (o instanceof String || o instanceof Character) {
                System.out.print(" " + o);
            } else if (o instanceof Number) {
                sum = sum + (int) o;
            } else {
                personList.add((Person) o);
            }
        }
        System.out.println("");
        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Array of Persons:");
        for (Person p : personList) {
            System.out.print(p.getName() + ", ");
        }
    }
}
