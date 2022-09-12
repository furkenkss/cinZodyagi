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
            System.out.println("Maymun");
        }

    }
}
