public class Main {
    public static void main(String[] args) {
        String text = "Hola Mundo!";

        int largo = text.length();
        System.out.println(largo);

        String texto = text.replace("Hola", "Chao");
        System.out.println(texto);

        System.out.println(texto.endsWith("undo!"));
        System.out.println(texto.startsWith("Ch"));
        System.out.println(texto.contains("und"));
        System.out.println(texto.indexOf("Mund"));
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        String malo = "   chanchito feliz   ";
        System.out.println(malo.trim());
        System.out.println(malo);
    }
}