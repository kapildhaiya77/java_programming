import java.util.*;
public class anagram {
    public  static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
   String s= sc.nextLine();
    String t= sc.nextLine();
      s =s.toLowerCase();
     t =t.toLowerCase();  
      if(s.length()==t.length()){
          char[] scharArray=s.toCharArray();
          char[] tcharArray=t.toCharArray();
          Arrays.sort(scharArray);
            Arrays.sort(tcharArray);
            boolean result=Arrays.equals(scharArray,tcharArray);
            if(result){
                System.out.println(s +" and "+ t +" are anagrams");
            }
            else {
                 System.out.println(s +" and "+ t +" are  not anagrams");

            }
            


      }
      else { System.out.println(s +" and "+ t +" are not anagrams");

            }

        
    }
}