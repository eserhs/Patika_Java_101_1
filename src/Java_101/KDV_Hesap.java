package Java_101;
import  java.util.Scanner;

public class KDV_Hesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int KDV =0;
        System.out.println("Lütfen Kdv Oranını Giriniz");
        KDV = input.nextInt();
        if (KDV == 18){
            System.out.print("Lütfen Hesaplamak İsteniniz Tutarı Giriniz \n:");
            int Number = 0;
            Number = input.nextInt();
            double KdvResult = (Number * KDV);
            double Result = KdvResult / 100;
            System.out.println("KDV Tutarı: "+Result);
            System.out.println(Result+Number);
        } else if (KDV == 8) {
            System.out.print("Lütfen Hesaplamak İsteniniz Tutarı Giriniz \n:");
            int Number = 0;
            Number = input.nextInt();
            double KdvResult = (Number * KDV);
            double Result = KdvResult / 100;
            System.out.println("KDV Tutarı: "+Result);
            System.out.println(Result+Number);
        } else if (KDV== 1) {
            System.out.print("Lütfen Hesaplamak İsteniniz Tutarı Giriniz \n:");
            int Number = 0;
            Number = input.nextInt();
            double KdvResult = (Number * KDV);
            double Result = KdvResult / 100;
            System.out.println("KDV Tutarı: "+Result);
            System.out.println(Result+Number);

        }else {
            System.out.print("Lütfen 1, 8, 18, Gibi Değerler Kullanını.");
        }


    }
}
