import java.util.*;
//reverse an array
public class reversearray{
     public static void reverse(int numbers[]) {
        int first =0, last=numbers.length-1;
        
        while(first < last){
            //swap
            int temp =numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        reverse(numbers);
        //print
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");

        } 
        System.out.println();
    }
}
//     // Online Java Compiler
// // Use this editor to write, compile and run your Java code online




//     static int[] reversearray(int[] arr){
//         int n=arr.length;
//         int ans[]=new int[n];
//         int j=0;
//         for(int i=n-1;i>=0;i--){
//             arr[j++]=arr[i];
            
//         }
//         return ans;
//     }
//     static void printarray(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
    
//     }
// 	public static void main(String[] args) {
// 		int arr[]={5,6,9,4,3};
// 		int ans[]=reversearray(arr);
// 		printarray(ans);
// 	}





// }
    

