package while_loop;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String userName;
        int password;
        boolean isPasswordSuccess = false;

        while (!isPasswordSuccess) {
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = inp.nextLine();

//            System.out.print("Şifrenizi giriniz : ");
//            password = inp.nextInt();

            if (userName.equals("Enes")) {
                System.out.println("Giriş başarılı...");
                isPasswordSuccess = true;
            } else {
                System.out.println("Tekrar deneyiniz");
            }

        }
    }
}

//package while_loop;
//
//import java.util.Scanner;
//
//public class while_loop {
//    public static void main(String[] args) {
//
//        Scanner inp = new Scanner(System.in);
//
//        String userName;
//        int password;
//        boolean isPasswordSuccess = false;
//
//        while (isPasswordSuccess != true) {
//            System.out.print("Kullanıcı adınızı giriniz : ");
//            userName = inp.nextLine();
//
//            System.out.print("Şifrenizi giriniz : ");
//            password = inp.nextInt();
//
//            if (password == 123 && userName == "Enes") {
//                System.out.println("Giriş başarılı...");
//                isPasswordSuccess = true;
//            } else {
//                System.out.println("Tekrar deneyiniz");
//            }
//
//        }
//    }
//}

