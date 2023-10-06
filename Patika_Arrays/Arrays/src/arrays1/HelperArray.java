package arrays1;

public class HelperArray {

    //Bir indexten diğer indexe kadar olan indexleri printler
    static void printTo(int[] list, int from, int to) {
        for (int i = from; i < to; i++) {
            System.out.print(list[i] + " ");
        }
    }

    //From indexinden to indexine kadar olan değerlerin hepsini value değeri yapar
    static int[] fillTo(int[] list, int from, int to, int value) {
        for (int i = from; i < to; i++) {
            list[i] = value;
        }
        return list;
    }

    static void sort() {
        //Daha sonra yap
    }

    static void search(int[] list, int indexValue) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == indexValue) {
                System.out.println(indexValue + " Bu indexte : " + i);
            }
        }
    }

    static void binarySearch(int[] list, int numberValue) {
        int index = 0;
        for (int i : list) {
            if (i == numberValue) {
                System.out.println("İndexte bulunan sayı : " + index);
            }
            index++;
        }


    }


}
