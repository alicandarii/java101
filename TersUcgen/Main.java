import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        int n = inp.nextInt();

        for (int i = n;i>1;i--){
            for (int j =1;j<n-i+2;j++) {
                System.out.print(" ");
            }
            for (int k = 0;k<(i*2)-3;k++){
                System.out.print("*");
            }
            System.out.println();

        }










    }
}