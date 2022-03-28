import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        number = inp.nextInt();

        for (int i = 1;i<=number;i++){
            if (i%3==0 && i%4==0) System.out.println(i);
        }
        
    }
}
