package LetterB;

public class B {
    public static void main(String[] args) {
        String[][] list = new String[7][3];
        //i satırları geziyor
        for (int i = 0; i < list.length; i++) {
            //j sütunları geziyor
            for (int j = 0; j < list[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    if (i == 3 && j == 2) {
                        //Geç
                    }
                    if (i == 3 && j == 2) {
                        list[i][j] = "   ";
                    } else {
                        list[i][j] = " * ";
                    }
                } else if (j == 0 || j == 2) {
                    list[i][j] = " * ";

                } else {
                    list[i][j] = "   ";
                }
            }
        }
        for (String[] row : list) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
