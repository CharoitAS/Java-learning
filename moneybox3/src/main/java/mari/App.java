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
        System.out.println( "Привет, это копилка!" );
        Scanner in = new Scanner(System.in);

        CoinsStack oneRub = new CoinsStack(1);
        CoinsStack fiveRub = new CoinsStack(5);
        CoinsStack tenRub = new CoinsStack(10);

        //oneRub.setAmount(50);

        while (true) {
            System.out.println("Введи номинал монеты");
            int coin = in.nextInt();

            if (coin == oneRub.getCoinValue()) {
                oneRub.putCoin();

            } else if (coin == fiveRub.getCoinValue()) {
                fiveRub.putCoin();

            } else if (coin == tenRub.getCoinValue()) {
                tenRub.putCoin();

            } else {
                System.out.println("Спасибо за монеты :)");
                break;
            }
        }

        oneRub.printAmount();
        fiveRub.printAmount();
        tenRub.printAmount();

        int coinsAmount = oneRub.getAmount() + fiveRub.getAmount() + tenRub.getAmount();
        System.out.println("Всёго монет в копилке - " + coinsAmount);

        int rubles = oneRub.getRub() + fiveRub.getRub() + tenRub.getRub();
        System.out.println("Всёго в копилке " + rubles + " рублей");

        in.close();
    }


}
