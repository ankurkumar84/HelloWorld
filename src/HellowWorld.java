import java.util.Scanner;

/**
 * Created by Ankur on 12/27/2014.
 */
public class HellowWorld {

    public static void main(String[] args) {
        System.out.print("Enter your name:");
        Scanner input = new Scanner(System.in);

        System.out.printf("Hello %s%n",input.nextLine() );
    }
}
