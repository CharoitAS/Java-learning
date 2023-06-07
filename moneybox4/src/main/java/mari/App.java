package mari;

import java.util.Scanner;
import java.util.Stack;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Привет, это копилка!" );
        Scanner in = new Scanner(System.in);

        CoinsStack[] coinsStacks = {new CoinsStack(1),new CoinsStack(5), new CoinsStack(10)};


        while (true) {
            System.out.println("Введи номинал монеты");
            int coin = in.nextInt();

            boolean isValid = false;

            for(CoinsStack stack : coinsStacks){
                
                if (coin == stack.getCoinValue()) {
                    stack.putCoin();
                    isValid = true;
                    break;
                }
            } 
            if (!isValid){
                System.out.println("Спасибо за монеты :)");
                break;
            }
        }

        for(CoinsStack stack : coinsStacks){
            System.out.println(stack);
        }  
        int coinsAmount = 0; 
        for (CoinsStack stack : coinsStacks){
            coinsAmount += stack.getAmount();
        }
        System.out.println("Всёго монет в копилке - " + coinsAmount);
        
        int rubles = 0;
        for (CoinsStack stack : coinsStacks){
            rubles += stack.getRub();        
        }        
        System.out.println("Всёго в копилке " + rubles + " рублей");

        in.close();
    }
}
