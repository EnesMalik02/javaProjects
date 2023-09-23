package taksimetre;

import java.util.Scanner;
public class taksiMetreHesaplama {
    public static void main(String[] args) {
        double acilisUcreti =  10 , kmUcreti = 2.20, toplamUcret;
        int mesafe;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilicek mesafeyi KM cinsinden giriniz");
        mesafe = input.nextInt();
        toplamUcret = acilisUcreti + (mesafe * kmUcreti);
        toplamUcret = (toplamUcret < 20) ? 20 : toplamUcret;
        System.out.println("Ödenecek fiyat : " + toplamUcret);



    }
}