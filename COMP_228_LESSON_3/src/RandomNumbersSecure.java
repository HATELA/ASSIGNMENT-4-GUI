import java.security.SecureRandom;

public class RandomNumbersSecure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int die1 = 0;
		int die2 = 0;
		int dice = 0;
		
		
		
		dice = die1 + die2;
		
		System.out.println(rolldice(2,6));
		
		
		

	}
	public static int rolldice(int numDice, int numSides )
	{
		SecureRandom generateRandom = new SecureRandom();
		int result = 0;
		
		
		for(int index=0; index < numDice-1; index++)
		{
			result = generateRandom.nextInt(6) + 1;
		}
		return result;
	}
	}


