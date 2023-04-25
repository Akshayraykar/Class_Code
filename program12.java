import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];

		// input
		
		for(int i=0; i<size; i++){

			arr[i] = sc.nextInt();
		}

		// output
		System.out.println("Enter numbers are:");

		for(int i=0; i<size; i++){

		System.out.println(arr[i]);
		}
	}
}
