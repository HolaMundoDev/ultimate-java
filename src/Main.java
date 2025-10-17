public class Main {
    public static void main(String[] args) {
        /**
         * Crear la clase VideoGame
         * con las propiedades
         * name String
         * price double
         * category String
         *
         * fetters y setters para toda las propiedades
         */

//        VideoGame vg = new VideoGame("God of war", 5);
        VideoGame vg = new VideoGame("God of war", 25);

        vg.setName("God of war");
//        vg.setCategory("Chanchito feliz");
        vg.setCategory("action");
        System.out.println(vg.getCategory());

        System.out.println(vg.getName());
        System.out.println(vg.getPrice());
    }
}