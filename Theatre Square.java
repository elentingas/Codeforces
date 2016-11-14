import java.util.Scanner;


public class TheatreSquare {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int a = in.nextInt();
		
		long height = n/a + (n%a != 0 ? 1 : 0);
		long width = m/a + (m%a != 0 ? 1 : 0);
		long result =  height * width;
		
		System.out.print(result);
	}

}
