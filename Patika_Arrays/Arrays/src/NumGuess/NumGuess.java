package NumGuess;

import java.util.Scanner;
import java.util.Random;

public class NumGuess {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100);
        int right = 5;

        System.out.println("1 ile 100 arası sayı tahmini  "+randomNum);

        while (right > 0) {
            System.out.print("Bir sayı giriniz : ");
            int input = inp.nextInt();

            if (input < randomNum) {
                System.out.println("Daha büyük bir sayı girin");
                right--;
            }
            else if (input > randomNum) {
                System.out.println("Daha küçük bir sayı girin");
                right--;
            } else if (input == randomNum){
                System.out.println("Sayıyı buldun...");
                break;
            }
            System.out.println("Remaining right : "+right);
        }

//        double randomNum = Math.random() * 100;


    }
}
