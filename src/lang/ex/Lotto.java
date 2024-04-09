   package lang.ex;

   import java.util.Random;

   public class Lotto {

      private final Random random = new Random();

      private int[] lottoNumbers;

      private int count;

      public int[] generator() {
         lottoNumbers = new int[6];
         count = 0 ;

         while (count < 6 ) {
            int number = random.nextInt(45) + 1 ;
            if(isUnique(number)){
               lottoNumbers[count] = number;
               count ++;
            }
         }
         return lottoNumbers;
      }

      private boolean isUnique(int number) {
         for (int i = 0 ; i < count; i++ ) {
            if(lottoNumbers[i] == number) {
               return false;
            }
         }
         return true;

      }

   }
