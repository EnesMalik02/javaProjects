package palidromNumbers;

public class palidromNums {

    static boolean isPalidrom(int num) {
        int temp = num , reverseNumber = 0, lastNumber;

        while (temp != 0){
            lastNumber = temp%10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
//            System.out.println(reverseNumber);
        }
        if (reverseNumber == num){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println( isPalidrom(4114));
    }
}
