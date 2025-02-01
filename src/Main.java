public class Main {
    public static void main(String[] args) {
        int edad = 18;
        String movieClassification = "R18";
//        String movieClassification = "RP18";

        boolean isWithAdult = true;
        boolean isRestricted = movieClassification.contains("R");
//        boolean isRestricted = movieClassification.contains("RP");

        if(!isRestricted){
            System.out.println("Puedes ver la película");
        } else if (edad > 17) {
            System.out.println("Puedes ver la película igual");
        } else if (isWithAdult && movieClassification.contains("RP")) {
            System.out.println("Viene con un adulto, puedes ver la película");
        } else {
            System.out.println("No puedes ver la película");
        }
    }
}