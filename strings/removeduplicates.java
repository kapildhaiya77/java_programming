import java.util.*;
 

class  removeduplicates{
    public static String remooveduplicates(String s){
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
           char p=s.charAt(i);
           if(i==0|| p != s.charAt(i-1)){
               sb.append(p);
           }
       }
       return sb.toString();
       
        }

        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       String result =remooveduplicates(s);
       System.out.println(result);
        }
    
    {
    
}
}
