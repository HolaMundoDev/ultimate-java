package recursos;

public class Base {
//    protected String name; NO USAR PROTECTED
    String name;

    public Base(String x){
        System.out.println("Soy Base " + x);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
