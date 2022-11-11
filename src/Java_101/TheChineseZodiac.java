package Java_101;
import java.util.Scanner;
public class TheChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userBirthYear;
        System.out.print("Please Enter Your Birth Year: ");
         userBirthYear = input.nextInt();
             int result =  userBirthYear % 12;
         switch (result){
             case 0:
                 System.out.print("Your Chinese Zodiac Sign: Monkey");
                 break;
             case 1:
                 System.out.print( "Your Chinese Zodiac Sign: Horoz");
                 break;
             case 2:
                 System.out.print("Your Chinese Zodiac Sign: Dog");
                 break;
             case 3:
                 System.out.print("Your Chinese Zodiac Sign: Pig");
                 break;
             case 4:
                 System.out.print("Your Chinese Zodiac Sign: Mouse");
                 break;
             case 5:
                 System.out.print("Your Chinese Zodiac Sign: Ox");
                 break;
             case 6:
                 System.out.print("Your Chinese Zodiac Sign: Tiger");
                 break;
             case 7:
                 System.out.print("Your Chinese Zodiac Sign: Rabbit");
                 break;
             case 8:
                 System.out.print("Your Chinese Zodiac Sign: Dragon");
                 break;
             case 9:
                 System.out.print("Your Chinese Zodiac Sign: Snake");
                 break;
             case 10:
                 System.out.print("Your Chinese Zodiac Sign: Horse");
                 break;
             case 11:
                 System.out.print("Your Chinese Zodiac Sign: Sheep");
                 break;
         }
    }

}
