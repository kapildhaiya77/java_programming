import java.util.*;

public class bubblesort {
    public static void bubblesoort(int nums[]){
        for(int turn=0;turn<nums.length-1;turn++){
            for (int j = 0; j < nums.length-1-turn; j++) {
                if(nums[j]<nums[j+1]){
                    //swap
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
                
            }

        }
        
    }
    public static void printarr(int[] nums) {
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,8,1};
        bubblesoort(nums);
        printarr(nums);

    }
    
}
