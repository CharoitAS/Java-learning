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
        System.out.println( "Привет пользовотель!" );
        Scanner in = new Scanner(System.in);

        System.out.println( "Введи число" );
        int number = in.nextInt();

        int sum = 0;
        
        for ( int i = 1; i <= number; i = i + 1) {
            sum = sum + i;
        }
        System.out.println("Сумма всех чисел от 1 до " + number + " = " + sum);

        in.close();
    }
}
