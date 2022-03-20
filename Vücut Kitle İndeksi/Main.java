import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        double boy,vki;
        int kilo;
        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz : ");
        boy = inp.nextDouble();
        System.out.println("Kilonuz : ");
        kilo = inp.nextInt();
        vki = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " +vki);






    }
}
