 public class Practice1 {
    public static void main(String[] args) {
        String name[]={"Lucky","deba","Pani","Luck","Grahi","Hello","KKK"};
        for (int i = 1; i < name.length-1; i++) {
            System.out.print(name[i]+" "+" \n");
        }

        //2nd Question
        System.out.println("2nd Question");
        String nam[]={"Lucky","deba","Pani","Luck","Grahi","Hello","KKK"};
        for (int i = name.length-2; i < name.length; i++) {
            System.out.print(nam[i]+" "+"\n");
        }

        //3rd Question
        System.out.println("3rd Question");
        String na[]={"Lucky","deba","Pani","Luck","Grahi","Hello","KKK"};
        for (int i = 2; i < name.length-2; i++) {
            System.out.print(na[i]+" "+"\n");
        }

        //4th Question
        System.out.println("4th Question");
        System.out.println("Array In Forwad Direction");
        String n[]={"Lucky","deba","Pani","Luck","Grahi","Hello","KKK"};
        for (int i = 0; i < name.length; i++) {
            System.out.print(n[i]+" "+"\n");
        }
        System.out.println("Array In backward Direction");
        for (int i = n.length-1; i>=0; i--) {
            System.out.print(n[i]+" "+"\n");
        }
    }
}
