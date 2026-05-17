// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package BasicMaths;

public class CountDigits {
   public CountDigits() {
   }

   public static int countDigits(int var0) {
      if (var0 < 0) {
         var0 = Math.abs(var0);
      }

      if (var0 == 0) {
         return 1;
      } else {
         int var1;
         for(var1 = 0; var0 > 0; ++var1) {
            var0 /= 10;
         }

         return var1;
      }
   }

   public static void main(String[] var0) {
      short var1 = 12345;
      System.out.println("Digits in " + var1 + " : " + countDigits(var1));
      byte var2 = -25;
      System.out.println("Digits in " + var2 + " : " + countDigits(var2));
      byte var3 = 7;
      System.out.println("Digits in " + var3 + " : " + countDigits(var3));
   }
}
