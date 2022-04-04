public class Bicycle {

    /**
     * Instance Variables
     */
    private String color;
    /**
     * Static Variable
     * access-modifier static keyword datatype variable_name
     */
    public static int numberOfBikes = 0;

    Bicycle(String color){
        this.color = color;
        numberOfBikes++;
    }

    public String getColor() {
        return color;
    }



}
