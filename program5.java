import java.io.*;
class EvenOddCount{

	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(Sytsem.in));

		System.out.println("Enter Size of Array:");

		int size = Interger.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array Elements:");

		for(int i=0; i<arr.length; i++){

			arr[i] = Interger.parseInt(br.readLine());

		}
  		int Ecount=0;
		int Ocount = 0;


		for(int i=0; i<arr.length; i++){

		if (int arr[i]%2 == 0){

			Ecount++;

		
		}
		   else{
			Ocount++;
		}
		}
	
		System.out.println("number of Even elements in array: "+Ecount);

		System.out.println("number Of Odd Elements in array: "+Ocount);
	}
}
	
