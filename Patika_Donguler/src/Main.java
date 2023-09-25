public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; ++i) {
            System.out.println("i nin değeri : " + i);
            for (int j = 1; j < 4; ++j) {
                System.out.println("j nin değeri : " + j);
                if (i == 1) continue;
                System.out.println("i + j = " + i + j);
            }
        }
    }
}
