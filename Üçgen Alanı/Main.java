import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        // DEĞİŞKENLER
        int kenar1,kenar2,kenar3;
        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("1. kenar : ");
        kenar1 = inp.nextInt();
        System.out.print("2.kenar : ");
        kenar2 = inp.nextInt();
        System.out.print("3.kenar : ");
        kenar3 = inp.nextInt();

        int u = (kenar1 + kenar2 + kenar3)/2;
        int cevre = 2*u;
        double hesap = u*(u-kenar1)* (u-kenar2)*(u-kenar3);
        double alan = Math.sqrt((hesap));
        System.out.println("Üçgenin çevresi : " + cevre);
        System.out.println("Üçgenin alanı : " + alan);





    }
}
