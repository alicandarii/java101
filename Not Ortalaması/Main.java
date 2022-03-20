import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //değişkenler
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfı
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değer al
        System.out.println("Matematik notun : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notun : ");
        fizik = inp.nextInt();

        System.out.println("Kimya notun : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notun : ");
        turkce = inp.nextInt();

        System.out.println("Tarih notun : ");
        tarih = inp.nextInt();

        System.out.println("Müzik notun");
        muzik = inp.nextInt();
//Ortalama hesaplama
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println(ortalama);

        //if-else olmadan karsılastırma
        String sonuc = (ortalama>60) ? "gectin":"kaldın";
        System.out.println(sonuc);





    }
}
