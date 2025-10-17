public class VideoGame {
    // action, rpg, adventure y racing. Propiedad static.
    static String[] categories = { "action", "rpg", "adventure", "racing"};
    String name;
    double price;
    String category;


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        boolean isInList = false;

        for(String c: VideoGame.categories){
            if (c.equals(category)) {
                isInList = true;
                break;
            }
        }

        if(isInList){
            this.category = category;
        } else {
            System.out.println("No está :(");
        }
    }
}
