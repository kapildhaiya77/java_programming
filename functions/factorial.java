import java.util.*;
public class factorial{
    public static int fac(int n){
        int f=1;
        for(int i=1;i<=n;i++)
        f=f*i; 
        return f;
    }
        
        public static int binocoff(int n,int r){
            int fact_n= fac(n);
             int fact_r= fac(r);
              int fact_nmr= fac(n-r);
              int  binocoff =  fact_n/( fact_r * fact_nmr);
              return binocoff;
        }
    
    public static void main(String args[]){
    
        

         
         System.out.println("factorial is "+ binocoff(9,7));
    
    }
}