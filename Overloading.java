public class Overloading {
    void pay(){
        System.out.println("Cash Payment");
    }
    void pay(int num){
        System.out.println("Using Number");
    }
    void pay(int num, String upi){
        System.out.println("Using UPI");
    }
    public static void main(String[] args) {
        Overloading o= new Overloading();
        o.pay();
        o.pay(345675235);
        o.pay(45,"Luc");
    }
}
