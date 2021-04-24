public class Main{
    public static void main(String[] args){

        Painting picasso = new Painting("Pablo Picasso", "The Old Guitarist", 4, 2.75);
        Sculpture rodin = new Sculpture("Rodin", "The Thinker", 6.17, 3.25, 4.58);

        System.out.println(picasso.getInfo());
        System.out.println("--------------------------------------------------------");
        System.out.println(rodin.getInfo());

    }
}