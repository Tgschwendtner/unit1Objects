import java.util.Random;

public class E2_11
{
     public static void main(String[] args)
     {
        Random die = new Random();
        int number = die.nextInt(6);
        System.out.println(number+1);
        }
    }