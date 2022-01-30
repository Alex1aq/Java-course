package Lesson.lesson8;

public class Test {
    public static void main(String[] args) {
        version1();
    }

    public static void version1() {
        int [] arr = {5,12, 34,102,4,5};
        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 2 ==0){
                System.out.println(arr[i]);
            } else {
                System.out.println(arr[i] *2);
            }
            System.out.println(" ");
        }

    }
    public static void version2 () {
        System.out.println();
    }
}
