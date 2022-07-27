public class Method_Variable {
    int display(){
        int data=100;
        return data;
    }


    String var(String name){
        return name;
    }

    int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Method_Variable m= new Method_Variable();
        int x=m.display();
        System.out.println(x);
       
       
        String y= m.var("Lucky");
        System.out.println(y);

        int s=m.sum(4, 6);
        System.out.println(s);

    }
}
