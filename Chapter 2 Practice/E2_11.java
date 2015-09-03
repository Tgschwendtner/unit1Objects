import java.util.Random;

public class E2_11
{
     public static void main( String[] args )
     {
        // Option A 
        Random die = new Random();
        int number = die.nextInt(6);
        
        
        System.out.println(number+1);
        
        //Option B
        double die2 = Math.random();
        die2 *= 6
        die2 += 1;
        
        
        System.out.println( (int) die2);
     }
}