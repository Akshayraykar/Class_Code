class electricity{
	public static void main(String[]args){

		int units = 0;
                                                                 
		if(units<=100)	{
			System.out.println("your bill of this month");
			System.out.println(units*1);
		}

		else if(units>100){
			System.out.println("your bill of this month");
			System.out.println(units*2-100);


		}

		else{
			System.out.println("no bill of this month");
		}
	}
}
		
