package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
         try {
             FileReader fr = new FileReader("archivo_inexistente.txt");
         } catch (FileNotFoundException e) {
             e.printStackTrace();
             System.out.println("Archivo no existe");
         }

         System.out.println("App continua...");
     }
}
