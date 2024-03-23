import java.util.Scanner;

/**
 * Multi
 */
public class Multi {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("\tQue tabla de multiplicar quieres saber?");
      System.out.print(" ──────── \n│  * _ * │\n ──────── \n-> ");
      int num = scan.nextInt();
      System.out.println("\tAqui tienes la tabla del " + num);
      System.out.print(" ──────── \n│  * _ * │\n ──────── \n");
      for (int i = 1; i < 11; i++) {
         int mult = i * num;
         System.out.println(i + " x " + num + " = " + mult);
      }
      System.out.println("Quieres probar de nuevo?");
   }
}