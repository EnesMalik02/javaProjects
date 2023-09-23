package VKI_Hesaplama;
//Vücut Kitle Endeksi Hesaplama

import java.util.Scanner;
public class vki_hesap {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu cm cinsinden giriniz : ");
        boy = inp.nextDouble();
        boy = boy/100;
        System.out.print("Kilonuzu kg cinsinden giriniz : ");
        kilo = inp.nextDouble();
        double vki = kilo/(boy * boy);
        System.out.println("Vücut kitle endeksiniz : "+ vki);

    }
}
