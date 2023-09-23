package calculating;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int process;
        double a, b, result;
        Scanner inp = new Scanner(System.in);

        System.out.println(" Choose your process \n 1 = Addition \n 2 = Subtraction \n 3 = Multiplication \n 4 = Division");
        process = inp.nextInt();

        if (process == 1) {
            System.out.print("Enter first number : ");
            a = inp.nextDouble();
            System.out.print("Enter second number : ");
            b = inp.nextDouble();
            result = a + b;
            System.out.println("Result of addition : " + result);
        }
        if (process == 2) {
            System.out.print("Enter first number : ");
            a = inp.nextDouble();
            System.out.print("Enter second number : ");
            b = inp.nextDouble();
            result = a - b;
            System.out.println("Result of subtraction : " + result);
        }
        if (process == 3) {
            System.out.print("Enter first number : ");
            a = inp.nextDouble();
            System.out.print("Enter second number : ");
            b = inp.nextDouble();
            result = a * b;
            System.out.println("Result of multiplication : " + result);
        }
        if (process == 4) {
            System.out.print("Enter first number : ");
            a = inp.nextDouble();
            System.out.print("Enter second number : ");
            b = inp.nextDouble();
            if (b == 0){
                System.out.println("You cannot divide any number by 0");
            }
            else {
                result = a / b;
                System.out.println("Result of division : " + result);
            }
        }
        else{
            System.out.println("Wrong process number");
        }
    }
}
