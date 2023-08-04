import java.util.*;

class Demo{

	public static void main(String[]args){
		
		System.out.println("Enter Array size:");

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("ENter Array elements:");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int Ecount=0, Ocount=0;
		for(int i =0; i<arr.length; i++){

			if(arr[i]%2==0){

				Ecount++;
			}

			else{
				Ocount++;
			}
		}
		System.out.println("Numbers of EvenCount are = "+Ecount);

		System.out.println("Numbers of Oddcount are = "+Ocount);
	}
}


