import java.util.*;

class OddSum{

	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int sum=0;

	int number = sc.nextInt();

	int arr[] = new int[number];

	for(int i=0; i<arr.length; i++){
		arr[i] = sc.nextInt();
	}

	for(int i=0; i<arr.length; i++){
		if(arr[i]%2!=0){
			System.out.println(arr[i]);

		
			sum = sum + arr[i];
		}
	}
			System.out.println("sum of odd elements are = "+ sum);	
	
		
	
	}
}
