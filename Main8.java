package cop2805;

import java.util.Random;

public class Main8 {
   public static void main(String[] args)

   {
      Random rand = new Random();

      int[] arr = new int[500000000];

      for (int i = 0; i < arr.length; i++) {
         arr[i] = rand.nextInt(20) + 1;
      }

      long start = System.currentTimeMillis();

      System.out.println(Summation8.sum(arr));

      System.out.println("Single: " + (System.currentTimeMillis() - start));

      start = System.currentTimeMillis();

      System.out.println(Summation8.parallelSum(arr));

      System.out.println("Parallel: " + (System.currentTimeMillis() - start));
   }
}
