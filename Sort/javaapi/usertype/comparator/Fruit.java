package Sort.javaapi.usertype.comparator;

public class Fruit {
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ":" + price;
    }
 
}