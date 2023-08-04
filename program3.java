class parent{
	parent(){

		System.out.println("In parent constructor");
	}	

}

class child extends parent{
	child(){
	super();
	System.out.println("In child constructor");
}
}

class client{
	public static void main(String[]args){
	child obj = new child();
	 
	}
}
