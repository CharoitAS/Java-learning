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
        System.out.println( "Привет, введи возраст" );
        Scanner in = new Scanner(System.in);
        
        int ageVasya = in.nextInt();
        int ageNastya = in.nextInt();
        //int ageKolya = in.nextInt();

        int min = -1; 
        int max = -1;
        //int middle = -1;

        min = Math.min(ageVasya, ageNastya);
        max = Math.max(ageVasya, ageNastya);

        System.out.println("Минимальный возраст " + min);
        System.out.println("Максимальный возраст " + max);

        in.close();

    }
}
