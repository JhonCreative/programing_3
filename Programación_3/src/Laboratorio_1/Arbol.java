package Laboratorio_1;
public class Arbol {
   private String tipo_arbol;
   private double tamaño;
   private String forma;
   private int edad;
   private String color;
   private String tipo_de_tronco;

   public  Arbol(String tipo_arbol, String forma, int edad, String color, String tipo_de_tronco){
      this.tipo_arbol = tipo_arbol;
      this.tamaño = 0;
      this.forma = forma;
      this.edad = edad;
      this.color = color;
      this.tipo_de_tronco = tipo_de_tronco;
   }
   public void crecer(){
      if (this.tamaño == 0) {
         this.tamaño = 10;
         System.out.println("El Arbol de "+this.tipo_arbol+" crecio 10cm");
      }
   }
   public void producir_frutos(){
      if (this.tamaño >= 20){
         System.out.println("🍊 El Arbol de "+this.tipo_arbol+" dio su fruto");
      } else{
         System.out.println("El arbol es muy pequeño para dar frutos");
      }
   }
   public void producir_oxigeno(){
      System.out.println("El Arbol de "+this.tipo_arbol+" esta produciendo oxigeno");
   }
   public void morir(){
      if (this.edad >= 500) {
         System.out.println("El arbol esta muerto");
      }
   }
   public void obtener_info(){
      System.out.println("-----------------------------\nÁRBOL");
      System.out.println("Tipo de Arbol: "+ this.tipo_arbol);
      System.out.println("Tamaño: "+ this.tamaño);
      System.out.println("Forma: "+this.forma);
      System.out.println("Edad: "+this.edad);
      System.out.println("Color: "+this.color);
      System.out.println("Tipo de Tronco: "+this.tipo_de_tronco);
   }
   public static void main(String[] args) {
      Arbol Manzano = new Arbol("Rosáceas", "Ancho", 5, "Verdes", "Recto");
      Manzano.crecer();
      Manzano.producir_oxigeno();
      Manzano.obtener_info();
   }
}