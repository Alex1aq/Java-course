package Homework.homework4;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter: ");
        int num = scanner.nextInt();
        int first = 1;
        int second = 1;
        int triple = 2;

        while (second < num) {
            int res = second;
            second += first;
            first = res;
            triple++;
        }
        if (second == num)
            System.out.println(triple);
        else
            System.out.println("-1");
    }
}
