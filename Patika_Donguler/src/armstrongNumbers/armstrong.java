package armstrongNumbers;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num, kacBas = 0, basValue = 0, result = 0, totalArmstrongNums = 0;

        System.out.print("Sayı giriniz : ");
        num = inp.nextInt();
        int tempNum = num;

        while (tempNum != 0) {
            tempNum /= 10;
            kacBas++;
//            System.out.println(kacBas);
        }

        tempNum = num;
        while (tempNum != 0) {
            basValue = tempNum % 10;
//            System.out.println(basValue);
            tempNum /= 10;
            result += basValue;
            int basPow = 1;
            for (int i = 1; i <= kacBas; i++) {
                basPow = basPow * basValue;
                System.out.println(basPow);
                System.out.println("------------------------");
            }
            totalArmstrongNums += basPow;

        }
        System.out.println("Basamak sayılarının toplamı : " + result);
        if (num == totalArmstrongNums) {
            System.out.println("Sayı bir armstrong sayısıdır " + totalArmstrongNums);
        } else {
            System.out.println("Sayı armstrong sayısı değildir  " + totalArmstrongNums);
        }
    }
}
