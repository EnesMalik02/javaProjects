package usluSayi;

import java.util.Scanner;

public class usluSayiHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int i, j;
        System.out.print("Üssü alinicak sayiyi girniz");
        i = inp.nextInt();

        System.out.print("Üs olucak sayiyi girniz");
        j = inp.nextInt();

        int us = 1;
        for (int k = 0; k < j; k++) {
            us *= i;
        }

        System.out.println(i + "^" + j + " = " + us);
    }
}
