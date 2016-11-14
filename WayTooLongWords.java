import java.util.Scanner;


public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int numberOfWords = Integer.parseInt(line);
		String[] abbreviated = new String[numberOfWords];
		for(int i = 0; i < numberOfWords; i++){
			abbreviated[i] = abbreviate(in.nextLine());
		}
		
		for(int i = 0; i < abbreviated.length; i++){
			System.out.println(abbreviated[i]);
		}
	}
	
	public static String abbreviate(String word){
		if(word.length() > 10){
			return word.charAt(0) + "" + (word.length() - 2) + word.charAt(word.length() - 1);
		} else
			return word;
	}
}
