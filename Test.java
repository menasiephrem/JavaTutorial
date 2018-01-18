class Test{

	//Global scope
	static int sam = 20;

	public static void main(String[] args) {
		System.out.println("Sam "+ sam);
		fun();
		System.out.println("Sam "+ sam);
	}

	public static void fun(){
		//Local Variable
		int sam = 24;

		System.out.println("Sam "+ sam);
	}
}