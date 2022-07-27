class Explain{
    int age=23;
    private String name="Lucky";
    void display(){
        System.out.println("Displaying the method");
    }
    public static void main(String[] args) {
        Explain x=new Explain();
        System.out.println("Explain");
        System.out.println(x.age);
        System.out.println(x.name);

    }
}
public class Inheritance_Example extends Explain {
    String name="Debabrata";
    public static void main(String[] args) {
        Inheritance_Example i=new Inheritance_Example();
        System.out.println("Example");
        System.out.println(i.age);
        System.out.println(i.name);
        
    }
}
