package kdvHesap;

import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kdv = 0.18;
        System.out.println("Ürün fiyatını giriniz : ");
        double fiyat = input.nextDouble();
        double kdvFiyati = fiyat * kdv;
        double kdvliFiyat = fiyat + kdvFiyati;


        System.out.println("Ürünün KDV'li fiyatı : " + kdvliFiyat);
        System.out.println("Ürün fiyatı : " + fiyat);
        System.out.println("KDV oranı : " + kdv);
        System.out.println("KDV ile eklenen tutar  : " + kdvFiyati);


    }
}
