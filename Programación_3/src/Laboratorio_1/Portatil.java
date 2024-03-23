package Laboratorio_1;
public class Portatil {
   private String modelo;
   private int ram;
   private String procesador;
   private double dimension;
   private double precio;
   private int bateria;

   public Portatil(String modelo,int ram, String procesador, double dimension, double precio, int bateria){
      this.modelo = modelo;
      this.ram = ram;
      this.procesador = procesador;
      this.dimension = dimension;
      this.precio = precio;
      this.bateria = bateria;
   }
   public void encender(){
      System.out.println("El portatil "+this.modelo+" esta encendido");
   }
   public void apagar(){
      System.out.println("El portatil "+this.modelo+" esta apagando");
   }
   public void reiniciar(){
      System.out.println("El portatil "+this.modelo+" se esta reiniciando");
   }
   public void cargar(){
      if (this.bateria == 100) {
         System.out.println("El portatil "+this.modelo+" no se puede cargar por que esta al 100%");
      } else{
         System.out.println("El portatil "+this.modelo+" se esta cargando");
      }
   }
   public void obtener_info(){
      System.out.println("-----------------------------\nPORTATIL");
      System.out.println("Modelo: "+ this.modelo);
      System.out.println("RAM: "+ this.ram);
      System.out.println("Procesador: "+this.procesador);
      System.out.println("Dimensión: "+this.dimension + "''");
      System.out.println("Precio: "+this.precio+"$");
      System.out.println("Bateria: "+this.bateria+"\n");
   }
   public static void main(String[] args) {
      Portatil hp = new Portatil("HP Victus", 8, "Intel i5", 16, 1000, 20);
      hp.encender();
      hp.cargar();
      hp.obtener_info();

      Portatil dell = new Portatil("Dell Inspirion", 16, "Ryzen 5", 16.5, 500, 100);
      dell.encender();
      dell.apagar();
      dell.cargar();
      dell.obtener_info();
   }
}
