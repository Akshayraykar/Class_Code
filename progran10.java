import java.util.*;

class ArrayOdd{

	public static void main(String[]args){
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array ");

		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i =0; i<arr.length; i++){
		arr [i]= sc.nextInt();
		}


		for(int i =0; i<arr.length; i++){

		if(arr[i]%2 == 0){
			
		count++;

		}
		
}
System.out.println("count of odd elements  i = "+ count);

		}
	}


	
