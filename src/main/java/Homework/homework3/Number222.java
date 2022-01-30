package Homework.homework3;

import java.util.Scanner;

public class Number222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Sample Input: ");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        if (number1 != number2 && number3 != number2 && number3 != number1) {
            System.out.println("Sample Output: \n" + "Yes");
        } else {
            System.out.println("Sample Output: \n" + "No");
        }
    }
}
