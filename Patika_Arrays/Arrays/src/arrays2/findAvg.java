package arrays2;

public class findAvg {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        double avarage = 0;
        int sum = 0;
        for (int i = 0; i < list.length; i++){
            sum += list[i];

        }
        System.out.println("Ortalama = "+ sum/list.length);
    }


}
