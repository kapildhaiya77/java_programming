public class mirror{
    public static void diamond(int n){
      //  1st half
        for(int i=1;i<=n;i++){
           //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(".");
            }
            //stars
            int k=1;
             for(int j=1;j<=i;j++){
              k++;

                      System.out.print("*");
                    
             }

           System.out.println();
            
        }
        //2nd half
         for(int i=n;i>=1;i--){
           //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(".");
            }
            //stars
            
             for(int j=1;j<=i;j++){
              

                      System.out.print("*");
                    
             }

           System.out.println();
         }
    }
       public static void main(String[] args){
diamond(4);  
       } 
       
    
    }