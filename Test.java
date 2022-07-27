public class Test {
    String fName(String firstName){
        return firstName;
    }
    String lName(String lastName){
        return lastName;
    }
    void fullName(String firstName, String lastName)
    {
        String name=firstName+" "+lastName;
        System.out.println(name);
       //return null;
    }
    public static void main(String[] args) {
        Test u=new Test();
        String x=u.fName("Deba");
        String y=u.lName("Pani");
        u.fullName(x, y);
    }
}
