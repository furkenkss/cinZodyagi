import java.util.Scanner;
//Doğum Tarihi %12 = 0 ➜ Maymun
//
//Doğum Tarihi %12 = 1 ➜ Horoz
//
//Doğum Tarihi %12 = 2 ➜ Köpek
//
//Doğum Tarihi %12 = 3 ➜ Domuz
//
//Doğum Tarihi %12 = 4 ➜ Fare
//
//Doğum Tarihi %12 = 5 ➜ Öküz
//
//Doğum Tarihi %12 = 6 ➜ Kaplan
//
//Doğum Tarihi %12 = 7 ➜ Tavşan
//
//Doğum Tarihi %12 = 8 ➜ Ejderha
//
//Doğum Tarihi %12 = 9 ➜ Yılan
//
//Doğum Tarihi %12 = 10 ➜ At
//
//Doğum Tarihi %12 = 11 ➜ Koyun
public class furkenkss {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");int dt= input.nextInt();

        if (dt%12==0){
            System.out.print("Maymun");
        } else if (dt%12==1) {
            System.out.print("Horoz");
        } else if (dt%12==2) {
            System.out.print("Köpek");
        } else if (dt%12==3) {
            System.out.print("Domuz");
        } else if (dt%12==4) {
            System.out.print("Fare");
        } else if (dt%12==5) {
            System.out.print("Öküz");
        } else if (dt%12==6) {
            System.out.print("Kaplan");
        } else if (dt%12==7) {
            System.out.print("Tavşan");
        } else if (dt%12==8) {
            System.out.print("Ejderha");
        } else if (dt%12==9) {
            System.out.print("Yılan");
        } else if (dt%12==10) {
            System.out.print("At");
        } else if (dt%12==11) {
            System.out.print("Koyun");
        } else {
            System.out.print("Hatalı Giriş!!!!!");
        }

    }
}
