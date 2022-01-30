package Homework.homework3;

import java.util.Scanner;

public class Number555 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a1, b1, c1, a2, b2, c2;
            System.out.println("Sample Input: ");
            a1 = scanner.nextInt();
            b1 = scanner.nextInt();
            c1 = scanner.nextInt();
            a2 = scanner.nextInt();
            b2 = scanner.nextInt();
            c2 = scanner.nextInt();
            if (a1 == a2 && b1 == b2 && c1 == c2 ) {
                System.out.println("Boxes are equal");
            } else if (a1 == b2 && b1 == c2 && c1 == a2 ) {
                System.out.println("Boxes are equal");
            } else if (a1 == c2 && b1 == a2 && c1 == b2 ) {
                System.out.println("Boxes are equal");
            }  else if (a1 >= a2 && b1 >= b2 && c1 >= c2 && a1 + b1 + c1 > a2 + b2 + c2) {
                System.out.println("The first box is larger than the second one");
            } else if (a1 <= a2 && b1 <= b2 && c1 <= c2 && a1 + b1 + c1 < a2 + b2 + c2) {
                System.out.println("The first box is smaller than the second one");
            } else
                System.out.println(" Boxes are incomparable");
        }

}
