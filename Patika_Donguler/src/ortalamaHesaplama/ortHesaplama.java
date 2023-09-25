package ortalamaHesaplama;

import java.util.Scanner;

public class ortHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int girdi, tekrarSayisi = 0, toplam = 0;

        System.out.println("Sayı giriniz : ");
        girdi = inp.nextInt();

        for (int i = 1; i <= girdi; i++) {
            System.out.println(i);
            if (i % 12 == 0) {
                System.out.println("Bu sayı 12 ye bölünüyor: " + i);
                toplam += i;
                tekrarSayisi += 1;

            }
        }
        System.out.println("12 ye bölünen sayıların ortalaması : " + toplam / tekrarSayisi);
        System.out.println("Sayıların toplamı : " + toplam);
        System.out.println("Kaç tane sayı : " + tekrarSayisi);

    }
}
