import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter operator");
        char c=sc.next().charAt(0);
        System.out.println("Enter first value:");

        int a=sc.nextInt();
         System.out.println("Enter second value:");
           int b=sc.nextInt();
        switch(c){
        case '+':System.out.println(a+b);
                       break;
                        case '-':System.out.println(a-b);
                       break;
                        case '*':System.out.println(a*b);
                       break;
                        case '/':System.out.println(a/b);
                       break;
                        case '%':System.out.println(a%b);
                       break;
                       default :System.out.println("wrong operator");

        }
    }
}