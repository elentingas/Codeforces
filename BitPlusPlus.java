import java.util.Scanner;


public class BitPlusPlus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int iterations = in.nextInt();
		in.nextLine();
		String line = "";
		
		int counter = 0;
		for(int i = 0; i < iterations; i++){
			line = in.nextLine();
			if( line.charAt(0) == '+' || line.charAt(2) == '+')
				counter++;
			else 
				counter--;
		}
		
		System.out.print(counter);
	}
}
