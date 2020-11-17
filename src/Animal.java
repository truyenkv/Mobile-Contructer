public class Animal {
    String name;
    float weigh;
    double hight;

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, float weigh){
        this.name = name;
        this.weigh = weigh;
    }

    public Animal(String name, float weigh, double hight){
        this.name = name;
        this.weigh = weigh;
        this.hight = hight;
    }

    public float weightOfNumber(int n){
        return weigh*n;
    }



}
