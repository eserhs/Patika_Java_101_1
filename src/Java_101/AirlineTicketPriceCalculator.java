package Java_101;
import java.util.Scanner;
public class AirlineTicketPriceCalculator {
    public static void flightCalculation(double travel,double result,boolean isError){
        if (travel == 1){
            System.out.print(result);
        } else if (travel == 2) {
            double flightDiscount = result * 20 /100;
            double flightDiscountResult = result - flightDiscount;
            System.out.print(flightDiscountResult);
        }else{
            isError = true;
        }
    }
    public static void main(String[] args) {
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        double ticket = 0.10;
        double  distance;
        int age;
        int travel;
        System.out.print("Enter the distance in (km): ");
        distance = input.nextInt();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip): ");
        travel = input.nextInt();
        if (distance>0){
            double normalTotal = distance * ticket;
            if (age < 12){
               double result = normalTotal *50 /100;
              System.out.print(result);
                flightCalculation(travel,result,isError);
            } else if (age >=12 && age <= 24) {
                double discountedAmount = normalTotal *10 /100;
                double result = normalTotal - discountedAmount;
                flightCalculation(travel,result,isError);

            } else if (age <65) {
                double discountedAmount = normalTotal *30 /100;
                double result = normalTotal - discountedAmount;
                flightCalculation(travel,result,isError);
                
            } else if (age > 24 && age <=35 ) {
                System.out.print(normalTotal);
                flightCalculation(travel,normalTotal,isError);

            }

        }else{
            isError =  true;
        }

        if (isError== true){
            System.out.print("Please Enter Correct Value");
        }else{
            return;
        }




    }

}
