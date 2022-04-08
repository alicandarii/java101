import java.util.Scanner;
class Main {
    static int pow(int a , int b){
        int mult = 1;
        for (int i = 1;i<=b;i++){
            mult *= a;

        }
        return mult;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Floor : ");
        int a = inp.nextInt();
        System.out.print("Power : ");
        int b = inp.nextInt();


        System.out.println(a + "^" + b + " = " + pow(a,b));



    }
}