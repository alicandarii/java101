import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
       int number = inp.nextInt();
       int basNumber = 0, tempNumber = number;
       int basValue ;
       int result= 0;
       int basPow ;
       while (tempNumber!=0){
           tempNumber /=10;
           basNumber++;
       }
        tempNumber = number;
       while (tempNumber !=0){
           basValue = tempNumber%10;
           basPow=0;
           basPow += basValue;
           tempNumber /=10;
           result += basPow;

       }
        System.out.println(result);




        /*
        int a = 2451, basamakSayisi = 0 , numberCounter = 0;

        while (a!= 0) {
            numberCounter++;
            a = a / 10;

        }
        //Son basamağını bulma
        */

    }
}