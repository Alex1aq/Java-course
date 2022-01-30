package Homework.homework4;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sample Input:");
        num = scanner.nextInt();
        while (num % 2 == 0) {
            num /= 2;
        }
        System.out.println(num == 1 ? "Yes" : "No");


    }
}
