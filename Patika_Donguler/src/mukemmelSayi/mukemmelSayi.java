package mukemmelSayi;

import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int total = 0;

        System.out.print("Mükemmel sayı mı ? : ");
        int girdi = inp.nextInt();

        for (int i = 1; i<=(girdi-1); i++){
            if (girdi%i == 0){
                total += i;
            }
        }
        if (total == girdi){
            System.out.println(girdi+" Sayısı mükemmel sayıdır");
        }else {
            System.out.println(girdi+" Sayısı mükemmel sayı değildir");
        }
    }
}
