class Demo{

	public static void main(String[]args){

		int arr1[][] = {{10,20,30},{40,50},{60}};

		for(int[] x: arr1){

			for(int y : x){

				System.out.print(y +" ");
			}
			System.out.println();
		}
	}
}
