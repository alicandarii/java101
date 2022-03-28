import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        number = inp.nextInt();
        for (int i = 1;i<=number;i*=4){
            System.out.println("4 ün katı : " + i);


        }
        for (int j = 1; j<=number;j*=5){
            System.out.println("5 in katı : " + j);
        }
    }
}