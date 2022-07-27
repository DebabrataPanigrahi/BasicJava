public class Method_Overloading {
    void mobile(){
        System.out.println("This is empty mobile");
    }
    void mobile(int a){
        System.out.println("Mobile with single SIM");
    }
    void mobile(int a,int b){
        System.out.println("Mobile with Dual SIM");
    }
    public static void main(String[] args) {
        Method_Overloading m= new Method_Overloading();
        m.mobile();
        m.mobile(3);
        m.mobile(1,3);

    }
}
