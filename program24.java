import java.util.*;

class Demo{

	public static void main(String[]args){
		System.out.println("ENter array Size:");

		Scanner sc = new Scanner(System.in);

	     //	int arr[][] = {{1,2,3},{4,5,6}{7,8,9}};

	
		int arr[][] = new int[3][3];
               
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){

				arr[i][j] = sc.nextInt();
			}
		}

		for(int i =0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){

				System.out.println(arr[i][j] +" ");
			}
		System.out.print();
		}
	}
}	



