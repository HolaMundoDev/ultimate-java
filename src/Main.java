public class Main {
    public static void main(String[] args) {
        String action = "listar";

        switch (action){
            case "agregar":
                System.out.println("Agregando recurso");
                break;
            case "eliminar":
                System.out.println("Eliminando recurso");
                break;
            default:
                System.out.println("Acción por defecto");
        }
    }
}