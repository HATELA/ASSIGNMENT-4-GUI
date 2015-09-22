import java.security.SecureRandom;

public class RandomNumbersSecure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dint die1 = 0;
		//Dint die2 = 0;
		//Dint dice = 0;
		
		
		
		//dice = die1 + die2;//
		
		System.out.println(rolldice(3,6));
		
		
		//If the numDice = 2 then there are in total 12 numbers. therefore result = genRand.nextInt(12) + 1;

	}
	public static int rolldice(int numDice, int numSides )
	{
		SecureRandom generateRandom = new SecureRandom();
		int result = 0;
		
		
		for(int index=0; index < numDice-1; index++)
		{
			result = generateRandom.nextInt(18) + 1;
		}
		return result;
	}
	}


