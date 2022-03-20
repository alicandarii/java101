import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
       //Değişkenler
        double arm , elma , dmts ,muz ,ptlcn ,toplam;
        Scanner inp = new Scanner(System.in);
        //Kullanıcıdan Veri Alma
        System.out.println("Armut Kaç Kilo : ");
        arm = inp.nextDouble();
        System.out.println("Elma Kaç Kilo : ");
        elma = inp.nextDouble();
        System.out.println("Domates Kaç Kilo : ");
        dmts = inp.nextDouble();
        System.out.println("Muz Kaç Kilo : ");
        muz = inp.nextDouble();
        System.out.println("Patlıcan Kaç Kilo : ");
        ptlcn = inp.nextDouble();
        //Tutar Hesaplama
        toplam = (arm*2.14)+(elma*3.67)+(dmts*1.11)+(muz*0.95)+(ptlcn*5.00);
        System.out.println("Toplam Tutar : " + toplam);







    }
}
