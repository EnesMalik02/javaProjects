package temperature;

import java.util.Scanner;

public class airTemperature {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double temp;

        System.out.print("Hava kaç derece");
        temp = inp.nextDouble();
        if (temp < 5) {
            System.out.println("Kayak yapabilirsin");
        } else if (temp == 5 || temp < 15) {
            System.out.println("Sinemaya gidebilirisn");
        } else if (temp == 15 || temp < 30) {
            System.out.println("Pikniğe gidebilirsin");
        } else {
            System.out.println("Evde otur");
        }

    }
}
