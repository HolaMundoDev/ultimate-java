package excepciones;

import java.io.*;

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
         try (
                 FileReader fr = new FileReader("archivo.txt");
                 FileReader fr2 = new FileReader("archivo.txt");
                 ) {
             var data = fr.read();
         } catch (IOException e) {
             e.printStackTrace();
             System.out.println("Archivo no existe");
         }
         System.out.println("App continua...");
    }

//    public static void  verificarEdad(int edad) throws UserException {
//        if(edad < 0){
//            UserException ue = new UserException();
//            EdadInvalidaException ei = new EdadInvalidaException();
//            ue.initCause(ei);
//            throw ue;
//        }
//    }

    public static void  verificarEdad(int edad) throws UserException {
        if(edad < 0){
            throw new UserException(new EdadInvalidaException());
        }
    }

    public static  void start() throws UserException {
        try {
            verificarEdad(-1);
        } catch (UserException e) {
            System.out.println("Error verificando edad");
            throw e;
        }
    }
}
