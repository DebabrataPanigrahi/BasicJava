class Test{
        int a;
        char c;
        double d;
        float f;
        long l;
        String s;
        boolean b;
        short t;

}
public class DataType {
    public static void main(String[] args) {
       Test t= new Test();
       System.out.println(t);
       System.out.println("Int "+t.a);
       System.out.println("Char "+t.c);
       System.out.println("Double "+t.d);
       System.out.println("Float "+t.f);
       System.out.println("Long Int "+t.l);
       System.out.println("String "+t.s);
       System.out.println("Boolean "+t.b);
       System.out.println("Short "+t.t);

    }
}
