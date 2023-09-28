package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisinin kaçıncı basamağına kadar bulmak istiyorsunuz ?");
        int num = inp.nextInt();
        int a = 0, b = 1, c = 0;

        System.out.println("Fibonacci Serisi:");
        System.out.println(a + "\n" + b + " ");

        for (int i = 0; i <= (num - 3); i++) {
            c = a + b;
            System.out.println(a + b);
            a = b;
            b = c;
        }
    }
}
