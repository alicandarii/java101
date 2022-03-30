import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;



        while (right>0){
            System.out.print("Kullanıcı Adınız : ");
            userName = inp.nextLine();
            System.out.print("Şifreniz : ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("java101")){
                System.out.println("Merhaba , Hoşgeldiniz : ");
                do {

                    System.out.println("1- Para Yatırma\n"+
                            "2-Para Çekme\n"+
                            "3-Bakiye Sorgula\n"+
                            "4-Çıkış Yap");
                    System.out.print("Lütfen Yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatıracağınız Tutar : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = inp.nextInt();
                            if (price> balance){
                                System.out.println("Bakiye Yetersiz : ");
                            }else balance-=price;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;


                    }

                }while (select != 4);
                System.out.println("Tekrar Görüşmek üzere.");
                break;

            }else{
                right --;
                System.out.println("Hatalı Kullanıcı adı veya şifre");
                if (right==0){
                    System.out.println("Hesap Bloke Olmuştur. ");
                }else {
                    System.out.println("Kalan Hakkınız " + right);
                }

            }
        }




    }
}