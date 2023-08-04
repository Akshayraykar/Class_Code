import java.util.*;
class Demo{

	public static void main(String[]args){
	int sum=0;
	
	Scanner sc = new Scanner(System.in);

	System.out.println("enter Array size: ");
  	int size = sc.nextInt();
	int arr[] = new int[size];
    
	System.out.println("Enter elements in array: ");

	for(int i=0; i<arr.length;i++){

		arr[i] = sc.nextInt();
	}

	for(int i=0; i<arr.length; i++){
		
	 sum = sum + arr[i];
	}
	
	System.out.println("Sum of array = "+sum);
}
}



