package Java_101;
import java.util.Scanner;

public class hypothenuse {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int a;
        int b;
        Double c;
        System.out.print("Lütfen a Değerını Giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen b Derğerını Giriniz: ");
        b = input.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.print("hypothenuse: "+c);

    }
}
