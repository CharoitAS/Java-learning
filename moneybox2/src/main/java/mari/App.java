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
        System.out.println( "Привет, я копилка =^.^=" );
        Scanner in = new Scanner(System.in);
        
        int oneRub = 0;
        int fiveRub = 0;
        int tenRub = 0;

        boolean stop = false;

        while (!stop) {
            System.out.println("Введи номинал монеты");
            int coin = in.nextInt();
            
            switch (coin) {
                case 1 -> { 
                    oneRub = oneRub + 1; 
                    System.out.println("Однорублёвых монет " + oneRub + " шт.");
                }
                case 5 -> {
                    fiveRub = fiveRub +1;
                    System.out.println("Пятирублёвых монет " + fiveRub + " шт.");
                }
                case 10 -> {
                    tenRub = tenRub +1;
                    System.out.println("Десятирублёвых монет " + tenRub + " шт."); 
                }
                default -> {
                    System.out.println("Спасибо за монеты :)");
                    stop = true;
                }
            
            }   
        }
        System.out.println("Однорублёвых монет " + oneRub + " шт.");
        System.out.println("Пятирублёвых монет " + fiveRub + " шт.");
        System.out.println("Десятирублёвых монет " + tenRub + " шт.");

        int coinsAmount = oneRub + fiveRub + tenRub;
        System.out.println("Всёго монет в копилке " + coinsAmount);

        int rubles = oneRub + fiveRub * 5 + tenRub * 10;
        System.out.println("Всёго в копилке " + rubles + " рублей");


        in.close();
    }
}
