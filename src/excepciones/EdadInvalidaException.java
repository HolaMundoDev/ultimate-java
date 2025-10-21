package excepciones;

public class EdadInvalidaException extends Exception {
    public EdadInvalidaException(){
        super("Edad inválida debe ser un n positivo");
    }

    public EdadInvalidaException(String mensaje){
        super(mensaje);
    }
}
