import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        int sicaklik;
        Scanner inp = new Scanner(System.in);
        String durum;
        System.out.print("Sıcaklık : ");
        sicaklik=inp.nextInt();
        if(sicaklik<5) durum="Kayak";
        else if(sicaklik>4 && sicaklik<16) durum="Sinema";
        else if(sicaklik>14 && sicaklik<26) durum="Piknik";
        else durum="Yüzme";
        System.out.print(durum);
    }
}
