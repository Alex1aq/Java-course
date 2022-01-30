package Homework.homework4;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sample Input: ");
        int zero = 0, num;
        do {
            num = scanner.nextInt();
            zero += num;
        } while (num != 0);
        System.out.println("Sample Output:" + zero);
    }
}
