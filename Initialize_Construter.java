public class Initialize_Construter {
    int age;
    String name;
    void Initialize_Construter(int age,String name){
        this.age=age;
        this.name=name;

    }
    void display(){
        System.out.println(this.age+" "+this.name);
    }
    public static void main(String[] args) {
        Initialize_Construter h=new Initialize_Construter();
        h.Initialize_Construter(56, "Lucky");
        h.display();
    }
}
