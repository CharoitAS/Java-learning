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
        String lineMessage = "message";

        while (true) {
        
            System.out.println("Введи слово");
            String cmd = in.nextLine();

            if (cmd.equals(linePing)) {
                System.out.println(linePong);
                
            } else if (cmd.equals(lineMessage)) {
                String author = in.nextLine();
                String text = in.nextLine();
                System.out.println(author + " написал(а) сообщение " + text);

            
            }else if (cmd.equals(lineQuit)) {
                break;
            } else {
                System.out.println("Непонятное слово " + cmd);
            }
        }
        System.out.println("Спасибо медведик");

        in.close();
    }
}
