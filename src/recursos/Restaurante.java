package recursos;

public class Restaurante {
    public void llevarCervezas(Garzon[] garzones){
        for(var garzon: garzones){
            garzon.atenderMesa();
        }
    }
}
