package Zodyak;

import java.util.Scanner;

public class zodyakHesapla {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int yil, burc;

        System.out.print("Doğum yılınızı giriniz ");
        yil = inp.nextInt();

        burc = yil % 12;

        switch (burc) {
            case 0:
                System.out.println("Zodyak burcunuz --> Maymun");
                break;
            case 1:
                System.out.println("Zodyak burcunuz --> Horoz");
                break;
            case 2:
                System.out.println("Zodyak burcunuz --> Köpek");
                break;
            case 3:
                System.out.println("Zodyak burcunuz --> Domuz");
                break;
            case 4:
                System.out.println("Zodyak burcunuz --> Fare");
                break;
            case 5:
                System.out.println("Zodyak burcunuz --> Öküz");
                break;
            case 6:
                System.out.println("Zodyak burcunuz --> Kaplan");
                break;
            case 7:
                System.out.println("Zodyak burcunuz --> Tavşan");
                break;
            case 8:
                System.out.println("Zodyak burcunuz --> Ejderha");
                break;
            case 9:
                System.out.println("Zodyak burcunuz --> Yılan");
                break;
            case 10:
                System.out.println("Zodyak burcunuz --> At");
                break;
            case 11:
                System.out.println("Zodyak burcunuz --> Koyun");
                break;
        }
    }
}
