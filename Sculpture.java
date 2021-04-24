public class Sculpture extends Painting{

    private double depth;

    //Constructor using default values of super class and adds depth value to default of 0
    public Sculpture(){
        super();
        this.depth = 0;
    }

    //Constructor using input values of Super Class
    public Sculpture(String a, String n, double h, double w, double pDepth){
        super(a, n, h, w);
        this.depth = pDepth;
    }

    //Returns volume of sculpture if box was around it
    public double getVolume(){
        return getArea() * this.depth;
    }

    //Overrides and returns getDimensions Method of Painting class but multiplying by depth instead
    public String getDimensions(){
        return this.getHeight() + "\" high by " + this.getWidth() + "\" wide by " + this.depth + "\" deep; volume of " + this.getVolume() + " cubic in.";
    }

    //Overrides and returns getInfo based off of the Sculpture class
    public String getInfo(){
        return "The sculptor: \n" + this.getName() + " by " + this.getAuthor() + "\nThis sculpture has the dimensions of " + this.getDimensions();
    }

}