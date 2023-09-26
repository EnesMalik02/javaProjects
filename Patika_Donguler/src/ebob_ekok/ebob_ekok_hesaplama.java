package ebob_ekok;

import java.util.Scanner;

public class ebob_ekok_hesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        int n1 = inp.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = inp.nextInt();

        int ebob = 0;
        int ekok = 0;
        //Küçük sayıyı bulma algoritması
        int kucukSayi = 0;
        for (int i = 0; (i <= n1 && i <= n2); i++) {
            if (i == n1) {
                kucukSayi = n1;
            } else if (i == n2) {
                kucukSayi = n2;
            }
        }
//        System.out.println("Küçük sayı "+kucukSayi);

        //Ebob bulma
        for (int j = kucukSayi; j >= 0; j--) {
            if (n1 % j == 0 && n2 % j == 0) {
                System.out.println("Ebobları = " + j);
                ebob = j;
                break;
            }
        }

        //Ekok bulma
        for (int k = 1; k <= (n1 * n2); k++) {
            if ((k%n1 == 0) && (k%n2 == 0)){
                System.out.println("Ekok = "+k);
                ekok = k;
                break;
            }
        }

        //ekok bulma formülü
         int ekok_ = (n1*n2)/ebob;
        System.out.println("Ekok formülünün sonucu da tekrardan " + ekok_);
    }
}