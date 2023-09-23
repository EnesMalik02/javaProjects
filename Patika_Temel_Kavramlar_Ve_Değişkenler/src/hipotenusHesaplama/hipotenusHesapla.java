package hipotenusHesaplama;

import java.util.Scanner;
public class hipotenusHesapla {
    public static void main(String[] args) {
        int a, b; double c;

        Scanner input = new  Scanner(System.in);

        System.out.println("Üçgenin 1.Kenarını giriniz : ");
        a = input.nextInt();
        System.out.println("Üçgenin 2.Kenarını giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs uzunluğu : " + c);



    }
}
