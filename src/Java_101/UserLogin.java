package Java_101;
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String UserName;
        String Password;
        Scanner input = new Scanner(System.in);
        System.out.print("User Name: ");
        UserName = input.nextLine();
        System.out.print("Password : ");
        Password = input.nextLine();
        if(UserName.equals("Eser")&& Password.equals("Eser123")){
            System.out.print("Logged In");
        }else{
            System.out.print("Login Failed");
        }
    }
}
