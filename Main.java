public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example 1
		System.out.println("Hello, I am Xun Thong!\n");
		
		//Example 3
		String code = "CSC1009";
		switch(code)
		{
			case "CSC1009":
				System.out.println("Object Oriented Programming\n");
				break;
			case "CSC1010":
				System.out.println("Computer Networks\n");
				break;
			case "CSC1008":
				System.out.println("Data Structures and Algorithms\n");
				break;
			case "CSC1007":
				System.out.println("Operating Systems\n");
				break;
			case "CSC1006":
				System.out.println("Mathematics 2\n");
				break;
			default:
				System.out.println("Unknown Module\n");
				break;
		}
		
		//Example 4
		for (int x = 102; x >= 66; x--) {
			if( x % 2 == 1) {
				System.out.println(x);
			}
		}
	}

}
