package recursos;

public class Restaurante {
    public void llevarCervezas(Atendible[] garzones){
        for(var garzon: garzones){
            garzon.atenderMesa();
        }
    }
}
