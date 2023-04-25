import java.util.scanner;

class DreamCompany{

	public static void main(String[]args){

	        Scanner obj = new Scanner(System.in);

		System.out.println("Enter your Dream company Name: ");

		String name = obj.next();

		System.out.println("expected salary:");
		float salary = obj.nextFloat();

		System.out.println(name);
		System.out.println(salary);

	}

}
