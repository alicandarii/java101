import java.util.Scanner;
class Main {
    static int asal(int num , int i){
        if(i==1){
            return 1;
        }else
        {
            if (num%i==0){
                return 0;
            }else return asal(num , i-1);
        }

    }
    public static void main(String[] args) {
        int num, prime ;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        num= scanner.nextInt();

        prime=asal(num,num/2);

        if (prime==1){
            System.out.println(num+" sayisi asaldir");
        }else {
            System.out.println(num+" sayisi asal değildir");
        }



    }
}