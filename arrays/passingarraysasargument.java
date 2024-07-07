import java.util.*;

public class passingarraysasargument {
    public static void update(int marks[],int nonchangeable){
        nonchangeable=10;
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }
        public static void main(String[] args) {
            int marks[]={97,98,99};
            int nonchangeable=5;
            update(marks,nonchangeable);
            System.out.println(nonchangeable);
            //print our marks
            for (int i = 0; i < marks.length; i++) {
                System.out.print(marks[i]+" ");
                
            }
            System.out.println();
        }

     //in this case non change able doest not change bcz it is pass by value and arrays are pass by refrence so its value is updated
        

    
}
