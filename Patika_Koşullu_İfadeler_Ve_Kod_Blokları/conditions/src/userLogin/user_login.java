package userLogin;

import java.util.Scanner;

public class user_login {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String userName = "Enes", password = "Malik";
        String a, b;

        System.out.print("Please enter your username : ");
        a = inp.nextLine();

        System.out.print("Please enter your password : ");
        b = inp.nextLine();

        if (userName.equals(a) && password.equals(b)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Wrong Username or Password");
        }


    }
}
