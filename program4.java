class IntergerDemo{

	public static void main(String[]args){

		int arr[] = new int[]{1,2,5,4,6,7,8};
		
		int evencount = 0, Oddcount = 0;
		for(int i=0; i<arr.length; i++){
			
		
			if(arr[i]%2 == 0){

				evencount++;
			}
			else{
				Oddcount++;
			}
		}
		System.out.println("Number of even elements = "+evencount);

		System.out.println("number of odd elements = "+Oddcount);
	}
}


