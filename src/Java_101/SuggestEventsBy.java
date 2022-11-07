package Java_101;
import java.util.Scanner;
public class SuggestEventsBy {
    public static void main(String[] args) {



        int heat;
        Scanner input =new Scanner(System.in);
        System.out.println( "Enter the temperature value");
        heat=input.nextInt();

        if (heat <= 5){
            System.out.println( "you can ski");
        }
        else if ( heat>5 && heat<=15) {
            System.out.println(" you can go to the cinema");
        }
        else if ( heat>=15 && heat<=25) {
            System.out.println( " You can go picnic");
        }
        else if ( heat>=25) {
            System.out.println( "you can go swimming");
        }





    }
}
