import java.io.*;

class JaggedArray{

	public static void main(String[]args)throws IOException {

		int  arr[][] = new int[3][];

		arr[0] = new int[3];

		arr[1] = new int[2];

		arr[2] = new int[1];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	//	Scanner sc = new Scanner(System.in);

		System.out.println("Enter Elements");

		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr[i].length; j++){

				arr[i][j] = Integer.parseInt(br.readLine());
			
			//        arr[i][j] = sc.nextInt();
			}

		}


		System.out.println("Array Elements are: ");

		for(int i =0; i<arr.length; i++){

			for(int j=0; j<arr[i].length; j++){

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
