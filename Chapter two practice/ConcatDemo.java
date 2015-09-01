public class ConcatDemo
{
   public static void main(String[] args)
   {
      String animal1 = "quick brown fox";
      String animal2 = "lazy dog";
      String article2 = "the";
      String action = "jumps over";
      String article = "The";
      String message = article.concat( animal1 ).concat( action ).concat( article2 ).concat(animal2);
      System.out.println(message);
   }
}