class compare{
	public static void main(String[]args){

		int num1 = 1;
		int num2 = 3;
		int num3 = 100;

		if(num1>num2 && num1>num3){
			System.out.println("num1 is greater than num2 & num3");
		}

		else if(num2>num1  && num2>num3){
			System.out.println("num2 is greater than num1 & num3");
		}

		else{
			System.out.println("num3 is greater than num1 & num2");
		}
	}
}
