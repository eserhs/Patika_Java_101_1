package Java_101;
import java.util.Scanner;
public class Daire_Alanı {
    public static void main(String[] args) {


            int yaricap,aci;
            double cevre,pi=3.14,alan,daireDilimAlani;

            Scanner scan = new Scanner(System.in);
            System.out.print("Lutfen dairenin yaricap ini tam sayi degeri olarak giriniz : ");
            yaricap= scan.nextInt();

            cevre=2*pi*yaricap;
            System.out.print("Dairenin cevresi : " + cevre);
            System.out.println();
            alan=pi*yaricap*yaricap;
            System.out.print("Dairenin alani : "+alan);
            System.out.println();

            System.out.print("Lutfen alani hesaplanacak dailre dilimin merkez acisini tam sayi cinsinden giriniz : ");
            aci= scan.nextInt();
            daireDilimAlani=(pi*yaricap*yaricap*aci)/360;
            System.out.println("Daire dilminin alani : "+daireDilimAlani);
    }
}
