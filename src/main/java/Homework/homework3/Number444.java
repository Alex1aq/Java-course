package Homework.homework3;

import java.util.Scanner;

public class Number444 {

        // Второй вариант выполнения 4 задания
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number1, number2, number3;
            System.out.println("Sample Input: ");
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
            number3 = scanner.nextInt();

            int min = Math.min(Math.min(number1, number2), number3);
            int max = Math.max(Math.max(number1, number2), number3);
            number2 = (number1 + number3 + number2) - min - max;
            number1 = min;
            number3 = max;
            System.out.println("Sample Output:" + number3 + "" + number2 + "" + number1);
        }
    }

