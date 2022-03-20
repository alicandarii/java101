import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        double pi = 3.14 ,alan;
        int yCap , aci;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yarı çap giriniz : ");
        yCap = inp.nextInt();
        System.out.println("Alanı alınacak dilimin açısı : ");
        aci = inp.nextInt();
        alan = (pi*(yCap*yCap)*aci)/360;
        System.out.println("Daire diliminin alanı : "+alan);



        /* double cevre,alan;
        cevre = 2*pi*yCap;
        alan = pi*yCap*yCap;
        System.out.println("Dairenin Çevresi : "+ cevre);
        System.out.println("Dairenin Alanı : "+alan); */






    }
}
