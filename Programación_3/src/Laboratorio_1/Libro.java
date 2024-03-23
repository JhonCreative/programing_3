package Laboratorio_1;
public class Libro {
   private String titulo;
   private String autor;
   private String material;
   private double tamaño;
   private String editorial;
   private String tema;
   private int paginas;
   private boolean status;

   public Libro(String titulo, String autor, String material, double tamaño, String editorial, String tema, int paginas){
      this.titulo = titulo;
      this.autor = autor;
      this.material = material;
      this.tamaño = tamaño;
      this.editorial = editorial;
      this.tema = tema;
      this.paginas = paginas;
      this.status = false;
   }
   //metodos
   public void abrir(){
      this.status = true;
      System.out.println("El libro "+this.titulo+" se ha abierto");
   }
   public void leer(){
      if (this.status == true) {
         System.out.println("El libro se esta leyendo");
      } else {
         System.out.println("El libro esta cerrado, por lo tanto no se puede leer");
      }
   }
   public void cerrar(){
      this.status = false;
      System.out.println("El libro se ha cerrado");
   }
   public void contar_pag(){
      System.out.println("El numero de paginas es: "+this.paginas);
   }
   public void obtener_info(){
      System.out.println("-----------------------------\nLIBRO");
      System.out.println("Título: "+ this.titulo);
      System.out.println("Autor: "+ this.autor);
      System.out.println("Tamaño: "+this.tamaño);
      System.out.println("Material: "+this.material);
      System.out.println("Editorial: "+this.editorial);
      System.out.println("Tema: "+this.tema);
   }
   public static void main(String[] args) {
      Libro It = new Libro("IT", "Stephen King", "Papel y cuero", 6.3, "Viking Penguin", "Terror", 1138);
      It.abrir();
      It.leer();
      It.contar_pag();
      It.cerrar();
      It.obtener_info();
      System.out.println();

      Libro harry_potter = new Libro("Harry Potter", "Annel", "carton", 22.50, "chanchitos felices", "Magia", 600);
      harry_potter.leer();
      harry_potter.contar_pag();
      harry_potter.obtener_info();
   }
}
