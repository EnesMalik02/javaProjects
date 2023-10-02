package calculatorV2;

import java.util.Scanner;

public class calculator {

    static void sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplama sonucu : " + result);
    }

    static void minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma sonucu : " + result);
    }

    static void times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma işlemini sonucu : " + result);
    }

    static void divided(double a, double b) {
        Scanner input = new Scanner(System.in);

        double result = 0.0;

        System.out.print("1.Sayıy giriniz : ");
        a = input.nextDouble();
        System.out.print("2.Sayıy giriniz : ");
        b = input.nextDouble();

        if (b == 0)
            System.out.println("Hata bir sayıyı 0 a bölemezisinz");
        else
            result = a / b;
        System.out.println("İşlemin sonucu : " + result);
    }

    static void power() {
        int result = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = inp.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = inp.nextInt();

        for (int i = 1; i <= exponent; i++) {
            result = base * result;
        }
        System.out.println(base + " üzeri " + exponent + " = " + result);

    }

    static void factorial() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Faktöriyel almak istediğiniz sayıyı giriniz :");
        int n = inp.nextInt();
        int result = 1;

        if (n < 0) {
            System.out.println("0 dan küçük sayıların faktöriyel alınamaz");

        } else {
            if (n == 0) {
                System.out.println(n + " Faktöriyel = " + 1);
            }
            for (int i = 1; i <= n; i++) {
                result *= i;
                System.out.println(n + " Faktöriyel = " + result);
            }
        }


    }

    static void get_mod(int a, int b) {
        int result = a % b;
        System.out.println("İşlemin sonucu : " + result);
    }

    static void get_area(int a, int b) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dörtgenin bir kenarının uzunluğunu giriniz :");
        a = inp.nextInt();
        System.out.print("Dörtgenin diğer kenarının uzunluğunu giriniz :");
        b = inp.nextInt();
        int result = a * b;

        if (result <= 0) {
            System.out.println("HATA! Alan 0 dan büyük olmalı");
        } else {
            System.out.println("Dörtgenin alanı : " + result);
        }
    }

    public static void main(String[] args) {
        while (true) {

            Scanner input = new Scanner(System.in);
            String menu = "\n1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap\n";

            System.out.println(menu);

            System.out.print("İşlem seçiniz : ");
            int select = input.nextInt();
            int a = 0, b = 0;

            if (select == 0) {
                System.out.println("Çıkış yapılıyor ...");
                System.exit(0);

            } else if (select > 8) {
                System.out.println("Hatalı işlem numarası");
            } else if (select == 5 || select == 6 || select == 8 || select == 4) {
                //Hiç bir şey yapma
            } else {
                System.out.print("1.Sayıy giriniz : ");
                a = input.nextInt();

                System.out.print("2.Sayıy giriniz : ");
                b = input.nextInt();
            }


            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    times(a, b);
                    break;

                case 4:
                    divided(a, b);
                    break;

                case 5:
                    power();
                    break;

                case 6:
                    factorial();
                    break;

                case 7:
                    get_mod(a, b);
                    break;
                case 8:
                    get_area(a, b);
                    break;

                default:
                    //
            }

        }

    }
}
