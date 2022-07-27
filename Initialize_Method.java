public class Initialize_Method {
    int roll;
    String name;
    void input(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    void display(){
        System.out.println(roll+"\n"+name);
    }
    public static void main(String[] args) {
        Initialize_Method k= new Initialize_Method();
        k.input(45, "Lucky");
        k.display();
    }
    
}
