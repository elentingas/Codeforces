import java.util.Scanner;

public class DominoPiling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		System.out.print((m * n) / 2);
	}
}