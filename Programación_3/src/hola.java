import java.util.Scanner;

public class hola {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      // Ingresando el nombre
      System.out.print("Ingrese su nombre: ");
      String nombre = scan.nextLine();
      // Ingresando la edad
      System.out.print("Ingrese su edad: ");
      int edad = scan.nextInt();
      // Mostrando la edad y el nombre
      System.out.println(nombre + " tu edad es " + edad);
   }
}
