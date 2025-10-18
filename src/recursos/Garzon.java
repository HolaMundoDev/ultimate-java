package recursos;

public class Garzon extends Base implements Atendible {
    public Garzon() {
        super("Chanchito feliz");
    }

    public void atenderMesa(){
        System.out.println("Atiende mesa");
    }

    @Override
    public void guardar() {

    }
}
