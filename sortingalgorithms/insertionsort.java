import java.util.*;
public class insertionsort {
    public static void insertion(int nums[]){
        for (int i = 1; i < nums.length; i++) { 
        int curr=nums[i];
      int  prev=i-1;
      while(prev>=0 && nums[prev]>curr){
        nums[prev+1]=nums[prev];
        prev--;
      }
      //insertion
     nums[prev+1]= curr;       
           }
        }
    public static void printarr(int[] nums) {
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,8,1};
        insertion(nums);

        printarr(nums);

    }
    
}

