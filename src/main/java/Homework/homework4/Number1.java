package Homework.homework4;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {

        int num, fop;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sample Input:");
        num = scanner.nextInt();
        System.out.print("Output: ");
        for (int i = 1; i < num; i++) {
            fop = (int) Math.pow(i, 2);
            if (fop < num + 1)
                System.out.print(fop + " ");
        }

    }
}
