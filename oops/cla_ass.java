 

public class cla_ass  {
    public static void main(String[] args) {
         pen p1 =new pen();//created a pen object p1  
         p1.setColor("Blue");
         System.out.println(p1.color);
         p1.setTip(5);
         System.out.println(p1.tip);
       //  p1.setColor("yellow");
       p1.color="yellow";
         System.out.println(p1.color);

         BankAccount myAcc = new BankAccount();
         myAcc.username = "shradhakhapra";
         myAcc.setPassword("abcdefghi");
         



    }
    
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
class pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float perecentage;//cgpa

    void calcPercentage(int phy, int chem, int math){
        perecentage =(phy+chem+math)/3;
    }
}
