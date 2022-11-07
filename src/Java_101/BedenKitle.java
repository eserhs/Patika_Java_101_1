package Java_101;
import java.util.Scanner;
public class BedenKitle {
    public static void main(String[] args){
        double a,b;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Giriniz : ");
        a = inp.nextFloat();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        b = inp.nextFloat();

        double kıtle = (b/(a*a));

        System.out.println("Vücut Kitle İndeksiniz : " + kıtle);


    }
}
