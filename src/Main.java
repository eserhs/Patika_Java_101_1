import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int kimya = 0;
        int mat = 0;
        int turkce = 0;
        int tarih = 0;
        int fizik = 0;
       Scanner İnput = new Scanner(System.in);
        System.out.println("Lütfen Matamatik Notunuzu Giriniz");
        mat = İnput.nextInt();
        System.out.println("Lütfen Kimya Notunuzu Giriniz");
        kimya = İnput.nextInt();
        System.out.println("Lütfen türkçe Notunuzu Giriniz");
        turkce = İnput.nextInt();
        System.out.println("Lütfen tarih Notunuzu Giriniz");
        tarih = İnput.nextInt();
        System.out.println("Lütfen Fizik Notunuzu Giriniz");
        fizik = İnput.nextInt();
        double result = (mat + tarih+ turkce+fizik+kimya);
        double Result = result /5;
        System.out.println(Result);

        if(Result >= 50) {
            System.out.print("Not Ortalamanız iyi");
        }
        else{
            System.out.print("Not Ortalamanız10 kötü");
        }


    }
}