import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = inp.nextInt();
        int total = 0;
        for (int i=1;i<number;i++){
            if (number%i==0){
                total+=i;



            }
        }if (total == number){
            System.out.println(number + "sayısı mükemmel sayıdır");
        }else System.out.println(number + "mükemmel sayı değildir.");










    }
}