import java.text.NumberFormat;

public class VideoGame {
    // action, rpg, adventure y racing. Propiedad static.
    static String[] categories = { "action", "rpg", "adventure", "racing"};
    String name;
    double price;
    String category;

    VideoGame(String name, double price){
        this.name = name;
        if(price < 10){
            this.price = 10;
        } else{
            this.price = price;
        }

    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPrice(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.price);
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getCategory(){
        return this.category.toUpperCase() + ".";
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
