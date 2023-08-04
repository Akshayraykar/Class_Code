import java.io.*;
class Mayur{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int i=1;i<=arr[i];i++){
				if(arr[i]%i==0){
					sum=sum+i;
				}
			}
			if(sum==arr[i]){
				System.out.println(i);
			}
		}
	}
}

