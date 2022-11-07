package Java_101;
import java.util.Scanner;
public class Manav {
    public static void main(String [] args){
        double a, b, c, d, e ;
        double armut= 2.14, elma =3.67, domates =1.11, muz = 0.95, portakal = 5.00;

        Scanner inp =new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        a = inp.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        b = inp.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        c = inp.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        d = inp.nextDouble();
        System.out.print("portakal Kaç Kilo ? : ");
        e = inp.nextDouble();

        double toplam =((a*armut)+(b*elma)+(c*domates)+(d*muz)+(e*portakal));
        System.out.print("Toplam Tutar " + toplam );
    }
}
