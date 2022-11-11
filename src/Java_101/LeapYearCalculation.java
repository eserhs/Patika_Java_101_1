package Java_101;
import java.time.Year;
import java.util.Scanner;
public class LeapYearCalculation {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int   year;
        System.out.print("Please Enter Leap Year: ");
        year = input.nextInt();
        if (year % 4 ==0){
            if (year %100 ==0){
                if (year %400 == 0){
                    System.out.print("This Year is a Leap Year: " + year );
                }else{
                    System.out.print("This Year is not a Leap Year: " + year );
                }
            }else{
                System.out.print("This Year is a Leap Year: " + year );
            }

        }else{
            System.out.print("This Year is not a Leap Year:" + year );
        }
    }
}
