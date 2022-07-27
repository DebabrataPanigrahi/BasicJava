public class Variable_Shawdawing {
    int x=100;
    void display(){
        int x=500;
        System.out.println(x);
        System.out.println(this.x);
    }
    void display1(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        Variable_Shawdawing v=new Variable_Shawdawing();
        v.display();
        v.display1();
    }
}
