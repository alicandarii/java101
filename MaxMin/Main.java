import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int max= 0 , min = 0;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int number = inp.nextInt();
        for (int i =1;i<=number;i++){
            System.out.print(i +  ". Sayıyı giriniz : ");
            int sayi = inp.nextInt();
            if (sayi>max){
                if (min ==0){
                    min = sayi;
                }
                max = sayi;
            }
            if (sayi < min){
                if (max == 0 ){
                    max = sayi;
                }
                min = sayi;
            }
        }
        System.out.println("En büyük : " + max);
        System.out.println("En küçük : " + min);






    }
}