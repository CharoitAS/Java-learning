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
        System.out.println("Привет, землянин, я кофе-машина");
        Scanner in = new Scanner(System.in);

        System.out.println("Кофе с молоком - 1");
        System.out.println("Кофе без молока - 2");
        int choiceCoffee = in.nextInt();

        System.out.println("Кол-во порций");
        int coffeePortions = in.nextInt();

        int coffeeAmount = 6000;
        int milkAmount = 4000;

        int coffeePerPortion = 15;
        int milkPerPortion = 100;

        if(choiceCoffee == 2) {
            milkPerPortion = 0;
        }
        int totalCoffeNeed = coffeePortions*coffeePerPortion;
        int totalMilkNeed = coffeePortions*milkPerPortion;
        
        if(coffeeAmount >= totalCoffeNeed && milkAmount >= totalMilkNeed) {
            System.out.println("Кофе готовится");
        } else {
            System.out.println("Кофе не готовится, недостаточно ингредиентов");
            
        }
        in.close();

    }
}