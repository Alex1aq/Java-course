package Homework.homework4;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        System.out.println("Write you numbers");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];
        int i;
        for (i = 0; i < num; i++) {
            array[i] = scan.nextInt();
        }
        for (i = 1; i < array.length; i++)
            if (((array[i - 1] > 0) && (array[i] > 0)) || ((array[i - 1] < 0) && (array[i] < 0))) {
                if (array[i - 1] < array[i]) {
                    System.out.println(array[i - 1] + " " + array[i]);
                    break;
                } else {
                    System.out.println(array[i] + " " + array[i + 1]);
                    break;
                }
            }
    }
}

