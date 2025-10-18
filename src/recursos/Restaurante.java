package recursos;

public class Restaurante {
    private Atendible[] garzones;

    public void setGarzones(Atendible[] garzones){
        this.garzones = garzones;
    }

    public void llevarCervezas(){
        for(var garzon: this.garzones){
            garzon.atenderMesa();
        }
    }
}
