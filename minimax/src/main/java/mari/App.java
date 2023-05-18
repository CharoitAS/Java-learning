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
        /**System.out.println( "Hello World!" );
        int vasyaAge = 12;
        int nastyaAge = 40;

        int min = -1; 
        int max = -1;
    

        if (vasyaAge < nastyaAge) {
            min = vasyaAge;
            max = nastyaAge;

        } else {
            min = nastyaAge;
            max = vasyaAge;
        }
        System.out.println("Минимальный возраст " + min);
        System.out.println("Максимальный возраст " + max);
*/
        
        int vasyaAge = 12;
        int nastyaAge = 40;
        int kolyaAge = 36;

        int min = -1; 
        int max = -1;
        int middle = -1; 
    

        if (vasyaAge < nastyaAge && vasyaAge < kolyaAge) {
            min = vasyaAge;

        } else if (nastyaAge < kolyaAge && nastyaAge < vasyaAge) {
            min = nastyaAge;

        } else {
            min = kolyaAge;
        }
        
        if (vasyaAge > nastyaAge && vasyaAge > kolyaAge) {
            max = vasyaAge;

        } else if (nastyaAge > kolyaAge && nastyaAge > vasyaAge) {
            max = nastyaAge;

        } else {
            max = kolyaAge;
        }
        System.out.println("Минимальный возраст " + min);
        System.out.println("Максимальный возраст " + max);
    }
}
