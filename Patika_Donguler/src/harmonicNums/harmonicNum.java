package harmonicNums;

import java.util.Scanner;

public class harmonicNum {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double result = 0;

        System.out.print("N sayısnı giriniz");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++){
            result += 1.0/i;
        }
        System.out.println("Harmonik sayıların toplamı : "+ result);
    }
}