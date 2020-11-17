public class People {

    String name;
    int age;
    String address;

    public People(String name){
        this.name = name;
    }

    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public People(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int tuoiCuaBan(){
        return age;
    }
}
