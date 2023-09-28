package asalSayiMi;

import java.util.Scanner;

public class asalSayiMi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int num = inp.nextInt();

        System.out.println(num+" Sayısına kadar olan asal sayılar : \n");

        for (int i = 2; i <= num; i++) {
            boolean asal = true; // Başlangıçta sayıyı asal olarak kabul ediyoruz.

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    asal = false; // Sayı bir böleni varsa asal değildir.
                    break; // İç içe döngüden çık.
                }
            }

            if (asal) {
                System.out.println(i + " ");
            }
        }
    }
}
