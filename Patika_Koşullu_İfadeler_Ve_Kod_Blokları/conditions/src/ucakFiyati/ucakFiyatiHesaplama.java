package ucakFiyati;

import java.util.Scanner;

public class ucakFiyatiHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

//        Kişi 12 yaşından küçükse bilet fiyatı üzerinden % 50 indirim uygulanır.
//        Kişi 12 - 24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden % 20 indirim uygulanır.


        int km, yas, yolculuk;
        double fiyat, perKm = 0.10;

        System.out.print("Uçak yolculuğunuz kaç KM : ");
        km = inp.nextInt();

        System.out.print("Kaç yaşındasınız : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipi nedir ? \n1-Tek Yön \n2-Gidiş Dönüş : ");
        yolculuk = inp.nextInt();
        if ((yolculuk != 1) && (yolculuk != 2)) {
            System.out.println("Yanlış işlem");
            System.exit(0);
        }

        fiyat = km * perKm * yolculuk;

        if (yas < 12) {
            fiyat = fiyat - (fiyat * 50) / 100;
        } else if ((yas == 12) || (yas <= 24)) {
            fiyat = fiyat - (fiyat * 10) / 100;
        } else if (yas >= 65) {
            fiyat = fiyat - (fiyat * 30) / 100;
        }

        if (yolculuk == 2) {
            fiyat = fiyat - (fiyat * 20) / 100;
        }
        System.out.println("Uçak biletinizin fiyatı : " + fiyat);
    }
}
