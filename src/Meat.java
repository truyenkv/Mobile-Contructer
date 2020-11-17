public class Meat {
    String name;
    float weight;
    int amount;

    public Meat(String name){
        this.name = name;
    }

    public Meat(String name, float weight, int amount){
        this.name = name;
        this.weight = weight;
        this.amount = amount;
    }

    public Meat(String name, int amount){
        this.name = name;
        this.weight = weight;
        this.amount = amount;
    }
}
