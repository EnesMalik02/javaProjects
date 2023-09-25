package dordunKatları;

import java.util.Scanner;

public class ortHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int girdi, total = 0;

        do {
            System.out.print("Bir sayı giriniz");
            girdi = inp.nextInt();
            //Sayı çift ve dördun katı mı ?
            if ((girdi % 2 == 0) && girdi % 4 == 0) {
                total += girdi;
            }
        } while (girdi % 2 == 0);
        System.out.println("Çift ve dördun katı olan sayıların toplamı : "+total);
    }
}
