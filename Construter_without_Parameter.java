public class Construter_without_Parameter {
    Construter_without_Parameter(){
        System.out.println("Construter Start");
        System.out.println("Construter End");

    }
    public static void main(String[] args) {
        System.out.println("Main Start 1");
        Construter_without_Parameter c= new Construter_without_Parameter();
        System.out.println("Main Start 2");
        Construter_without_Parameter c1 =new Construter_without_Parameter();
        

    }
}
