import java.util.*;
public class largestnoarray {
    public static void getlargest(int numbers[]) {
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest =numbers[i];
            }
            if(smallest > numbers[i]){
             smallest=numbers[i];
            }
        }
        System.out.println("smallest value is:"+smallest);
        System.out.println("largest value is:"+largest);
        
    }
    public static void main(String[] args) {
        int numbers[]={0,1,2,6,3,348};
     getlargest(numbers);
    }


    
}
