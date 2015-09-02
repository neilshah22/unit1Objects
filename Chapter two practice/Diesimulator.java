import java.util.Random;
public class Diesimulator
{
    public static void main( String[] args )
    { 
      // option A
      Random generator = new Random();
      int dieValue = generator.nextInt(6);  // returns number between 0 and5, inclusive//
      dieValue += 1;
      System.out.println( dieValue );
      
      
      
      // option B
      double dieValue2 = Math.random(); //returns a number between 0 (inclusive)and 1
      dieValue2 *= 6; //range [0,6)
      dieValue2 += 1; //range [1, 7)
      System.out.println((int) dieValue2 ); // prints 1, 2, 3, 4, 5, 6
    }
}





      
        