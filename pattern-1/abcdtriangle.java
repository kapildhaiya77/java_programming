import java.util.*;
public class abcdtriangle{
    public static void pattern(int n){
        char ch='A';
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch + j));

            }

           
           
            System.out.println();
        }
    }
     public static void main(String main[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
pattern(n);
     }
}



