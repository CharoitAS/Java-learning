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
        System.out.println( "Вас привествует что-то" );
        Scanner in = new Scanner(System.in);
        System.out.println( "Введите вид топлива " );
        int fuelType = in.nextInt();
        System.out.println( "Введите кол-во топлива " );
        int amount = in.nextInt();
        double fuelprice = 0;
        if (92 == fuelType) {
            fuelprice = 41.12;
        } else if(fuelType == 95) {
          fuelprice = 51.11;
        } 
        System.out.println("Цена топлива " + fuelprice + " рублей за литр");
        double totalprice = fuelprice*amount;
        System.out.println("Сумма к оплате " + totalprice + " руб.");
        in.close();
    }
    
}
