package daire;

import java.util.Scanner;
public class daireyleİlgiliHesaplamalar {
    public static void main(String[] args) {
        double r, pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz");
        r = inp.nextDouble();
        double alan =(2*pi*r);
        double cevre = (pi*r*r);

        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Dairenin alanı : " + alan);
    }
}
