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
        int ageKolya = in.nextInt();

        int min = -1; 
        int max = -1;
        

        min = Math.min(ageVasya, ageNastya);
        min = Math.min(min, ageKolya);
        max = Math.max(ageVasya, ageNastya);
        max = Math.max(max, ageKolya);

        System.out.println("Минимальный возраст " + min);
        System.out.println("Максимальный возраст " + max);

        in.close();

    }
}
