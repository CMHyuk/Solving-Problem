import java.util.Arrays;
import java.util.Scanner;

public class Baek2805 {
	
	static int n;
	static int m;
	static int[] arr;
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(BinarySearch(arr, arr[n-1]));
	}
	
	public static long BinarySearch(int[] arr, int max) {
		long left = 0;
		long right = arr[n-1];
				
		while(left <= right) {
			long sum = 0;
			long mid = (left+right)/2;
			
			for(int i = 0; i<arr.length; i++) {
				if(arr[i] > mid) {
					sum += arr[i] - mid;
									
				}
			}
			if(sum == m)
				return mid;
			else if(sum > m) { 
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return right;
	}
}
