package JavaMaxMin;

public class MaxMin {
    public static void main(String[] args) {
        int[] list = {1, 23, 4, 56, 7, 8, 9,23,5457535,-4238,6223,0,1231,543,535,6,14255,6473,6,3,5,13414,-135613,4697471,-56799,-35354};
        int max = list[0];
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
            if (min > list[i]) {
                min = list[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
