import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfPeople = in.nextInt();
		int winnersMinScore = in.nextInt();
		int[] players = new int[numberOfPeople];
		int counter = 0;
		boolean flag = true;

		for(int i = 0; i < numberOfPeople; i++)
			players[i] = in.nextInt();
		
		int winnersScore = players[winnersMinScore - 1];
		for(int i = 0; (i < numberOfPeople) && flag; i++)
			if(players[i] >= winnersScore && players[i] > 0)
				counter++;
			else
				flag = false;
	
		
		System.out.print(counter);
	}
}
