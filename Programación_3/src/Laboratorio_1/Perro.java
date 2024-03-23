package Laboratorio_1;
public class Perro {
   private String nombre;
   private int edad;
   private String color;
   private double peso;
   private double tamaño;
   private boolean hambre;

   public Perro(String nombre, int edad, String color, double peso, double tamaño) {
      this.nombre = nombre;
      this.edad = edad;
      this.color = color;
      this.peso = peso;
      this.tamaño = tamaño;
      this.hambre = false;
   }

   // Métodos
   public void ladrar() {
      System.out.println("¡Guau! ¡Guau!");
   }

   public void correr() {
      if(peso>50){
         System.out.println(nombre+" corre muy lento");
      } else {
         System.out.println(nombre+" está corriendo.");
      }
   }

   public void dormir() {
      System.out.println(nombre+" está durmiendo.");
   }

   public void jugar() {
      System.out.println(nombre+" está jugando.");
   }

   public void comer() {
      if (hambre) {
         System.out.println(nombre+" comiendo.");
         hambre = false;
      } else {
         System.out.println(nombre+" no tiene hambre en este momento.");
      }
   }

   public void sentarse() {
      System.out.println(nombre+" se ha sentado.");
   }

   public void tenerHambre() {
      hambre = true;
   }

   public void obtenerInformacion() {
      System.out.println("-----------------------------\nPERRO");
      System.out.println("Nombre: " + nombre);
      System.out.println("Edad: " + edad + " años");
      System.out.println("Color: " + color);
      System.out.println("Peso: " + peso + " kg");
      System.out.println("Tamaño: " + tamaño + "cm");
   }

   public static void main(String[] args) {
      Perro golden_retriver = new Perro("Pepito", 8, "Amarillo", 31, 62);

      golden_retriver.ladrar();
      golden_retriver.correr();
      golden_retriver.dormir();
      golden_retriver.jugar();
      golden_retriver.tenerHambre();
      golden_retriver.comer();
      golden_retriver.sentarse();
      golden_retriver.obtenerInformacion();
   }
}
