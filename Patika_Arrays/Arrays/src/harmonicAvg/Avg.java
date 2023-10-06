package harmonicAvg;

public class Avg {
    public static void main(String[] args) {
        //Listenin içindeki değerleri değiştirerek istediğiniz listenin Harmonik Ortalamasını bulabilirsiniz
        int[] list = {2, 4, 6, 8, 10};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += 1.0 / list[i];
            System.out.println(sum);
        }
        System.out.println("Sum : " + sum);
        System.out.println("Harmonik Ortalama : " + list.length / sum);
    }
}
