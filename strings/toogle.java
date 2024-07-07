import java.util.*;
public class toogle{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        StringBuilder  str = new StringBuilder(sc.nextLine());
         System.out.println(str);

        for(int i=0;i<str.length();i++){
            boolean flag = true;
            char ch = str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=97 )flag = false;
            if(flag == true){
                ascii+=32;
                char dh =(char)ascii;
                str.setCharAt(i,dh);
            }
            else{
                ascii -= 32;
                 char dh =(char)ascii;
                 str.setCharAt(i,dh);

            }
        }
        System.out.println(str);
        
        

    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      StringBuilder sb= new StringBuilder(sc.nextLine());
      for(int i=0;i<sb.length();i++){
          char ch = sb.charAt(i);
            int ascii=(int)ch;
            if(ascii>97){
                ascii-=32;
                char dh =(char)ascii;
                sb.setCharAt(i,dh);
            }
            else{
                ascii+=32;
                char dh =(char)ascii;
                sb.setCharAt(i,dh);
            }
      }
       System.out.println(sb);
      
    }
}*/