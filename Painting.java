public class Painting{


    //Instance Variables
    private String author;
    private String name;
    private double height;
    private double width;

    //Constructor with Default Values
    public Painting(){
        this.author = "";
        this.name = "";
        this.height = 0.0;
        this.width = 0.0;
    }

    //Contructor with input values
    public Painting(String pAuthor, String pName, double pHeight, double pWidth){
        this.author = pAuthor;
        this.name = pName;
        this.height = pHeight;
        this.width = pWidth;
    }

    //Return the Author name
    public String getAuthor(){
        return this.author;
    }

    //return pieces name
    public String getName(){
        return this.name;
    }

    //Returns the height of painting
    public double getHeight(){
        return this.height;
    }

    //Returns the width of painting
    public double getWidth(){
        return this.width;
    }

    //Returns the area of painting
    public double getArea(){
        return this.height * this.width;
    }

    //Calculates and Returns dimension of Painting
    public String getDimensions(){
        return height + "\" high by " + width + "\" wide; area of " + getArea() + " square in."; 
    }

    //Method that returns info of the Painting (Author, Painting Name and Dimensions)
    public String getInfo(){
        return "The painting: \n" + this.name + " by " + this.author + "\nThis painting has the dimensions of " + this.getDimensions();
    }

}