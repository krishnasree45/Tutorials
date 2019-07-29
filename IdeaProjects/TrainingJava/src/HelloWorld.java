import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some value");
        int user_input = scan.nextInt();
        System.out.println("The entered value is ");
        System.out.print(user_input);


    }
}
