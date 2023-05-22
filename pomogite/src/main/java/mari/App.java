package mari;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Приветики медведики" );
        Scanner in = new Scanner(System.in);

        String linePing = "ping";
        String linePong = "pong";
        String lineQuit = "quit";

        while (true) {
        
            System.out.println("Введи слово");
            String lol = in.nextLine();

            if (lol.equals(linePing)) {
                System.out.println(linePong);

            } else if (lol.equals(lineQuit)) {
                break;
            } else {
                System.out.println("Непонятное слово " + lol);
            }
        }
        System.out.println("Спасибо медведик");

        in.close();
    }
}
