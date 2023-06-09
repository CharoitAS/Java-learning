package mari;

import java.util.Scanner;
import java.util.ArrayList;

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

        ArrayList<CoinsStack> coinsStacks = new ArrayList<>();


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
                if (coin > 0){
                    CoinsStack stack = new CoinsStack(coin);
                    stack.putCoin();
                    coinsStacks.add (stack);
                
                } else {
                    System.out.println("Спасибо за монеты :)");
                    break;
                }
               
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