package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void suma(){
        sumando(null);
    }

    public static Integer sumando(Integer i){
        return i + 2;
    }

    public static int noComprobado(){
        int numerador = 10;
        int denominador = 0;

        try{
            int resultado = numerador/denominador;
            System.out.println("resultado = " + resultado);

            return resultado;
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.getStackTrace();
            return -1;

        }
     }

     public static void comprobado(){
        FileReader fr = null;
         try {
             fr = new FileReader("archivo_inexistente.txt");
             var data = fr.read();
         } catch (IOException e) {
             e.printStackTrace();
             System.out.println("Archivo no existe");
         } finally {
             try {
                 if(fr != null) {
                     fr.close();
                 }
             } catch (IOException e) {
                 System.out.println("Error al cerrar");
             }
         }
         System.out.println("App continua...");
     }
}
