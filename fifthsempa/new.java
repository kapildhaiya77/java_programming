import java.util.*;
 public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]%2==0){
		        count++;
		    }
		}
		int even[]=new int[count];
		int odd[]=new int[n-count];
		int j=0;
		int k=0;
		for(int i=0;i<n;i++){
		    if(arr[i]%2==0){
		        even[j]=arr[i];
		        j++;
		    }else{
		        odd[k]=arr[i];
		        k++;
		    }
		int[] odd=new ingjjj
		}
		System.out.print("even"+Arrays.toString(even));
		System.out.print("odd"+Arrays.toString(odd));

		
	}
}