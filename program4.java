import java.util.*;

class VowelDemo{
	public static void main(String[]args){

		System.out.println("Enter 7 characterstics: ");

		Scanner sc = new Scanner(System.in);

		char inputArr[] = sc.next().toCharArray();

		System.out.println("Vowels in input array: ");

		for(char c : inputArr){
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
			   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){

				
			   }
	
		System.out.println(c);
		}
	}
}
