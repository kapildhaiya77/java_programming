public class characterpattern{
    public static void main(String args[]){
        
        char Ch='A';
        int n=4; 
        for (int line=1;line<=n;line++){
            for(int chars=1;chars<=line;chars++){
            System.out.print(Ch);
            Ch++;
            }
            System.out.println();
        }
         

    }
}