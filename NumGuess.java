import java.util.Random;
import java.util.Scanner;

class NumGuess {
   NumGuess() {
   }

   public static void main(String[] var0) {
      Random var1 = new Random();
      Scanner var2 = new Scanner(System.in);
      int var3 = var1.nextInt(100) + 1;
      int var4 = 0;
      System.out.println("Enter your guess between 1-100:");
      boolean var5 = true;

      while(var5) {
         if (var4 % 10 == 0 && var4 != 0) {
            System.out.println("\nThis Round Ended !! \nDo You Want To Play Again ??\t(yes/no)");
            String var6 = var2.nextLine();
            var6 = var2.nextLine();
            if (var6.equals("no")) {
               System.out.println("\nGame Ended !! Thank for Playing The Game!!");
               var5 = false;
               break;
            }

            System.out.println("\nEnter your guess between 1-100:");
         }

         ++var4;
         int var7 = var2.nextInt();
         if (var7 == var3) {
            System.out.println("\nvictory! your guess is correct");
            System.out.println("\nIt took you " + var4 + " guesses to win");
            break;
         }

         if (var3 > var7) {
            System.out.println("Your number is lower. Guess again.");
         } else {
            System.out.println("Your number is higher. Guess again.");
         }
      }

      var2.close();
   }
}
