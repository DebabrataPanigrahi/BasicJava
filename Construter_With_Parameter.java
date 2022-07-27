public class Construter_With_Parameter {
    String name;
    int age;
    Construter_With_Parameter(String name, int age){
        this.name= name;
        this.age=age;

    }
    public static void main(String[] args) {
        Construter_With_Parameter c= new Construter_With_Parameter("Lucky",23);
        Construter_With_Parameter c1= new Construter_With_Parameter("Deba",24);
        System.err.println(c.name);
        System.err.println(c.age);
        System.err.println(c1.name);
        System.err.println(c1.age);
    }
}
