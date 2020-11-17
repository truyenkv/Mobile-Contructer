public class main {
    public static void main(String[] arg){
        Animal ani = new Animal("cho", 5);
        People pe = new People("Truyen", 20);
        Meat me = new Meat("thit");

        System.out.println("Muoi con cho nang "+ ani.weightOfNumber(10));
        System.out.println("Tuoi cua ban "+ pe.tuoiCuaBan());
    }
}
