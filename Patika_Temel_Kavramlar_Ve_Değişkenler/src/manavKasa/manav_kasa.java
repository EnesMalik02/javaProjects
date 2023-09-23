package manavKasa;

import java.util.Scanner;
public class manav_kasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, fiyat = 0;
        double armut_kilo, elma_kilo, domates_kilo, muz_kilo, patlican_kilo;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armut_kilo = inp.nextDouble();
        fiyat += armut_kilo * armut;

        System.out.print("Elma Kaç Kilo ? : ");
        elma_kilo = inp.nextDouble();
        fiyat += (elma_kilo * elma) ;

        System.out.print("Domates Kaç Kilo ? : ");
        domates_kilo = inp.nextDouble();
        fiyat += domates_kilo * domates;

        System.out.print("Muz Kaç Kilo ? : ");
        muz_kilo = inp.nextDouble();
        fiyat += muz_kilo * muz;

        System.out.print("Patlican Kaç Kilo ? : ");
        patlican_kilo = inp.nextDouble();
        fiyat += patlican_kilo * patlican;

        System.out.println(fiyat);



    }
}
