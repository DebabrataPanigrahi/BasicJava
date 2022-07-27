public class Calculate_Percentage {
    int phy,math;
    int sum=0;
    int per=0;
    void input(int phy,int math){
        this.phy=phy;
        this.math=math;
        sum=phy+math;
        per=sum/2;

    }
    void display(){
        System.out.println(per);

    }
    public static void main(String[] args) {
        Calculate_Percentage c= new Calculate_Percentage();
        c.input(56,45);
        c.display();

    }
}
