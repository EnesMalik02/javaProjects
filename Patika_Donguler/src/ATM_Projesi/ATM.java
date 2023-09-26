package ATM_Projesi;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = inp.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = inp.nextLine();

            if (userName.equals("enes") && password.equals("12ab")) {
                System.out.println("\nGiriş başarılı");
                do {
                    System.out.print("\nİşlemler : \nPara çekme -> 1 \nPara yatırma -> 2 \nBakiye Sorgulama -> 3 \nÇıkış yap -> 4 \nBir işlem seçiniz : ");
                    select = inp.nextInt();
                    int miktar = 0;
                    switch (select) {
                        case 1:
                            System.out.println("\nŞu anki  bakiyeniz : " + balance);
                            System.out.print("Ne kadar para çekmek stiyorsunuz ? : ");
                            miktar = inp.nextInt();
                            if (miktar > balance) {
                                System.out.println("Bakiyeniz yetersiz");
                            } else {
                                balance -= miktar;
                                System.out.println("\nHesaptan çeklen para : " + miktar + "\nŞu anda hesapdaki para : " + balance);

                            }
                            break;

                        case 2:
                            System.out.println("\nŞu anki  bakiyeniz : " + balance);
                            System.out.print("Ne kadar para yatırmak istiyorsunuz ? : ");
                            miktar = inp.nextInt();
                            balance += miktar;
                            System.out.println("\nYeni bakiyeniz : " + balance);
                            break;

                        case 3:
                            System.out.println("\nŞu anki  bakiyeniz : " + balance);
                            break;
                    }
                } while (select <= 3);
                System.out.println("\nBaşarıyla çıkış yapıldı...");
                break;

            }
            if (right != 0) {
                right--;
                System.out.println("Kalan giriş hakkınız : " + right);
                if (right == 0) {
                    System.out.println("Giriş deneme hakkınız bitmiştir...");
                }
            }
        }
    }
}
