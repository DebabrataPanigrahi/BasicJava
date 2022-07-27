class Test{
    int a=4;
    String name="Lucky";
    void show(){
        System.out.println("Showing");
    }
    void display(){
        System.out.println("Displaying");
    }
}
class MyName extends Test{
    public static void main(String[] args) {
        MyName n= new MyName();
        System.err.println("MyName Class");
        System.out.println(n.a);
        n.display();
        
    }
}

public class Some extends Test{
    public static void main(String[] args) {
        Inheritance j= new Inheritance();
        System.out.println(j.a);
        System.out.println(j.name);
        j.show();
        j.display();
    }
    
}

