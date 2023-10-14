package PalindromeWords;

import java.util.Scanner;

public class PalindromeWords {

/*    Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

    Örnek : abba , asa , kavak, kayak*/

    static boolean isPalidrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Yanlış");
                return false;
            }
            j--;
            i++;
        }
        System.out.println("Doğru");
        return true;
    }

    static boolean isPalidrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String word = inp.nextLine();
//        boolean value = isPalidrome(word);
        boolean value = isPalidrome2(word);
        if (value == true) {
            System.out.println(word + " kelimesi bir palidrom kelimedir");
        } else {
            System.out.println(word + " kelimesi bir palidrom kelime değildir");
        }
    }
}
