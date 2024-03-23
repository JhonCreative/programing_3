import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\tHola, como te llamas?");
        System.out.print(" ──────── \n│  * _ * │\n ──────── \n-> ");
        String nombre = scan.nextLine();
        
        System.out.println("Hola "+nombre+" como estas?");
        System.out.print(" ──────── \n│  * _ * │\n ──────── \n-> ");
        String estado = scan.next();
        
        if(estado.equals("bien") || estado.equals("Bien")){
            System.out.println("\tMe alegra mucho que estes bien " + nombre);
            System.out.print(" ──────── \n│  * _ * │\n ──────── \n-> ");
        } else if(estado.equals("mal") || estado.equals("Mal")){
            System.out.println("\t¿Quieres contarme por que estas mal " + nombre + " ?");
            System.out.print(" ──────── \n│  * _ * │\n ──────── \n->");
            String resp = scan.next();
            if(resp.equals("si") || resp.equals("Si")){
                System.out.println("Vale cuentame todo " + nombre);
                System.out.print(" ──────── \n│  * _ * │\n ──────── \n->");
            } else {
                System.out.println("Esta bien. repeto tu decisión, pero estare aqui a tu lado " + nombre);
                System.out.print(" ──────── \n│  * _ * │\n ──────── \n->");
            }
        }
    }
}