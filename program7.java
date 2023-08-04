import java.util.*;

class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size off array:");

		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Array Elements Are:");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int Osum =0;
		int Esum=0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				Esum =Esum + arr[i];

			}else{

				Osum = Osum + arr[i];
			}
		}

		System.out.println("Odd numbers sum are: "+Osum);

		System.out.println("Even Numbers sum are: "+Esum);
	}
}
		
