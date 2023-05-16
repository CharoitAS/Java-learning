package coocky;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Тебе типа рады");
        System.out.println("А ты нам рад? T^T");
        Scanner in = new Scanner(System.in);
        String pit = in.nextLine();
        
        if (pit.equals("Yes"))
        {
            System.out.println("Hooray");
        } else {
            System.out.println(pit); 
            System.out.println("А мы надеялись увидеть Yes");
        }
    }
}
