import java.util.Scanner;


public class StringTask {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.next();
		
		text = text.toLowerCase();
		String result = "";
		for(int i = text.length() - 1; i >= 0; i--){
			if(	text.charAt(i) != 'a' && 
				text.charAt(i) != 'o' && 
				text.charAt(i) != 'y' && 
				text.charAt(i) != 'e' &&
				text.charAt(i) != 'u' && 
				text.charAt(i) != 'i'){
					result = "." + text.charAt(i) + result;
			}
		}
		System.out.print(result);
	}
}
