import java.util.*;  

public class linearsearcharray {
    public static int linearsearch(String numbers[],String key) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String numbers[]={"dosa","chole bhature","samosa" ,"palak panerr","burger","pateez"};
        String key="pateez";
         int index=linearsearch(numbers, key);
         if(index == -1){
            System.out.println("not found");
         }
         else{
            System.out.println("key is at index "+index);
         }
    }
    
}
//to find elemnent in an array is known as linera serach
//time complexcity of linear serach is O(n); u
