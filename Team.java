import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int counter = 0;
		for(int i = 0; i < n; i++){
			counter += ((in.nextInt() + in.nextInt() + in.nextInt()) >= 2 ? 1 : 0);
		}
		
		System.out.print(counter);
	}
}
