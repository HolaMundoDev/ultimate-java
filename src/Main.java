import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] personajes = {"Goku", "Vegeta", "Chanchito Feliz"};

//        for (int i = 0; i < personajes.length; i++){
//            System.out.println(personajes[i]);
//        }

        for(String personaje: personajes){
            System.out.println(personaje);
        }
    }
}