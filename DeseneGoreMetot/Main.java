import java.util.Scanner;
class Main {
    static void pattern(int a){
        if (a<=0){
            System.out.println(a);
            return;
        }
        System.out.println(a);
        pattern(a-5);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a = inp.nextInt();
        pattern(a);




    }
}