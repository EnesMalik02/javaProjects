package max_min_algoritmasi;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı giriceksiniz : ");
        int kacKez = inp.nextInt();

        int i = 1, minNum = 0, maxNum = 0, baslangic = 0;

        while (i <= kacKez) {
            System.out.print("Bir sayı giriniz : ");
            int girdi = inp.nextInt();

            if (girdi > maxNum) {
                maxNum = girdi;
            }
            else if (girdi < minNum) {
                minNum = girdi;
            }
            i++;
//            System.out.println("*****************");
//            System.out.println("EB = "+maxNum+"\nEK = "+minNum);
        }
        System.out.println("En büyük sayı : "+ maxNum);
        System.out.println("En küçük sayı : "+ minNum);
    }
}
