import java.util.*;
public class zeroonetriangle{
    public static void pattern(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print(1);
                }
                 else{
                    System.out.print(0);
                }
                

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



