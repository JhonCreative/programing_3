package Laboratorio_1;
public class Pelota_de_futbol {
   private String marca;
   private int tamaño;
   private String color;
   private double peso;
   private String material;
   private double presion;

   public Pelota_de_futbol(String marca, int tamaño, String color, double peso, String material) {
      this.marca = marca;
      this.tamaño = tamaño;
      this.color = color;
      this.peso = peso;
      this.material = material;
      this.presion = 0.0;
   }

   public void rebotar() {
      if (presion > 0) {
         System.out.println("La pelota de fútbol está rebotando.");
      } else {
         System.out.println("La pelota de fútbol no puede rebotar, está desinflada.");
      }
   }

   public void rodar() {
      if (presion > 0) {
         System.out.println("La pelota de fútbol está rodando.");
      } else {
         System.out.println("La pelota de fútbol no puede rodar, está desinflada.");
      }
   }

   public void girar() {
      if (presion > 0) {
         System.out.println("La pelota de fútbol está girando.");
      } else {
         System.out.println("La pelota de fútbol no puede girar, está desinflada.");
      }
   }

   public void inflar(double cantidad) {
      if (cantidad > 0) {
         presion += cantidad;
         System.out.println("Se ha inflado la pelota de fútbol. Presión actual: " + presion);
      } else {
         System.out.println("No se puede inflar la pelota con esa cantidad.");
      }
   }

   public void lanzar() {
      if (presion >= 0.5) {
         System.out.println("¡La pelota de fútbol ha sido lanzada!");
      } else {
         System.out.println("La presión es demasiado baja para lanzar la pelota.");
      }
   }

   public void obtenerInformacion() {
      System.out.println("-----------------------------\nPELOTA DE FUTBOL");
      System.out.println("Marca: " + marca);
      System.out.println("Tamaño: " + tamaño);
      System.out.println("Color: " + color);
      System.out.println("Peso: " + peso + " kg");
      System.out.println("Material: " + material);
      System.out.println("Presión: " + presion);
   }

   public static void main(String[] args) {
      Pelota_de_futbol adidas = new Pelota_de_futbol("Adidad", 5, "Blanco y Negro", 0.4, "Cuero");

      adidas.obtenerInformacion();
      adidas.rebotar();
      adidas.rodar();
      adidas.girar();
      adidas.inflar(0.5);
      adidas.rebotar();
      adidas.rodar();
      adidas.girar();
      adidas.lanzar();
      adidas.obtenerInformacion();
   }
}
