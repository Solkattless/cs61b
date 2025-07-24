public class Dessert {
    private static int numDessert = 0;

    public int flavour, price;

    public Dessert(int flavour, int price){
        this.flavour = flavour;
        this.price = price;
        Dessert.numDessert++;
    }

    public void printDessert(){
        System.out.println(flavour + " " + price + " " + Dessert.numDessert);
    }

    public static void main(String[] args){
        System.out.println("I love dessert!");
    }
}
