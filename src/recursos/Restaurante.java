package recursos;

public class Restaurante {
    private Atendible[] garzones;
    
    public Restaurante(Atendible[] garzones){
        this.garzones = garzones;
    }

    public void llevarCervezas(){
        for(var garzon: this.garzones){
            garzon.atenderMesa();
        }
    }
}
