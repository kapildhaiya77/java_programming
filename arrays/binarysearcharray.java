import java.util.*;
//binary search
public class binarysearcharray {
    public static int binarysearch(int numbers[],int key) {
        int start=0,end=numbers.length-1;
        while(start<= end){
            int mid=start+(end-start)/2;
            //comparisons
            if(numbers[mid]==key){//found
            return mid;
            }
            if(numbers[mid]<key){
                //right
                start=mid+1;
            }
            else{//left
            end=mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,9,10,12,14}; 
        int key=25;
        System.out.println("index for key is:" + binarysearch(numbers,key));
    }
    
    
}
