import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18,kdvOran2=0.08,hesap1,hesap2;
        Scanner inp = new Scanner(System.in);
         //kullanıcıdan değer al
        System.out.println("Fiyat : ");
        tutar = inp.nextDouble();
        hesap1= tutar * kdvOran;
        hesap2 = tutar * kdvOran2;



       /* if (tutar>1000){
            hesap = tutar * kdvOran2;
            kdv = hesap+tutar;
            System.out.println("KDVLİ FİYAT:" + kdv);

        } */
      /*  else {
            hesap = tutar*kdvOran;
            kdv = hesap+tutar;
            System.out.println("Kdvli Fiyat: "+ kdv );

        }  */

        String sonuc = (tutar>1000) ? "Kdv Tutarı : "+hesap2 : "Kdv Tutarı : "+hesap1;
        System.out.println(sonuc);
    }
}
