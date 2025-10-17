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

        VideoGame vg = new VideoGame();
        vg.setName("God of war");
//        vg.setCategory("Chanchito feliz");
        vg.setCategory("action");
        System.out.println(vg.getCategory());
    }
}