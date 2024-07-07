import java.util.*;
public class selectionsort {

    
        public static void selection(int nums[]){
            
            for(int i=0;i<nums.length-1;i++){
                int minspos=i;
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[minspos]>nums[j]){
                        minspos=j;
                    }   
                }
                int temp=nums[minspos];
                        nums[minspos]=nums[i];
                        nums[i]=temp;
    
            }    
        }
        public static void printarr(int[] nums) {
            for(int i=0;i<nums.length;i++){
                System.out.println(nums[i]+" ");
            }
            
        }
        public static void main(String[] args) {
            int nums[]={4,5,6,8,1};
          selection(nums);
            printarr(nums);
    
        }
        
    }
    
    

