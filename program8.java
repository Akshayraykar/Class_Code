import java.io.*;

class SearchDemo{

	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size Of array:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Elements In array: ");

		for(int i=0; i<arr.length; i++){

			 arr[i] =Integer.parseInt(br.readLine());

		}

		System.out.println("Enter Element in array Search:");
		int search = Integer.parseInt(br.readLine());
		for(int i =0; i<arr.length; i++){

			if(arr[i] == search){
		
	
		 System.out.println("Element found at index: "+i);
		}
		}
	}
}

