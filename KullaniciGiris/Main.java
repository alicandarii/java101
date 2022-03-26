import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName="patika" , password="java123";
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız :");
        userName = inp.nextLine();
        System.out.print("Şifre gir : ");
        password = inp.nextLine();

        if (userName.equals(userName) && password.equals(password)){
            System.out.println("Giriş yaptınız");
        }
        else if (!userName.equals(userName)&& password.equals(password)){
            System.out.println("Kullanıcı adı yanlış");
        }
        else if (userName.equals(userName)&& !password.equals(password)) {
            System.out.println("Şifre yanlış! Şifrenizi değişmek ister misin?(e/h) :");
            String cevap = inp.nextLine();

            if (cevap.equals("h")) {
                System.out.println("Şifre değiştirlmedi");
            } else {
                System.out.println("Yeni şifre gir: ");
                String newPass = inp.nextLine();
                if (newPass.equals(password)) {
                    System.out.println("Şifre oluştulmadı");

                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
        else{
            System.out.println("Kullanıcı adı şifre yanlış");

        }



    }
}

