class divisible{
	public static void main(String[]args){

		int x = 22;

		if(x%3==0 && x%5==0){
			System.out.println("divisible by both");
                         }
		else if(x%5==0){
			System.out.println("divisible by 5");
                         }         
		else if(x%3==0){
			System.out.println("divisible by 3");
                        }
		else{
			System.out.println("not divisible by both");
		}
	}
}
