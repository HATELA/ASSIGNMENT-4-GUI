import java.util.ArrayList;

public class GPA {
	
	public static double Calculate(double cGPA, int eCredits,
			ArrayList<String> newCreditHourList, ArrayList<String> newGradeList)
	{
		
		double currentGPA = cGPA;
		int earnedCreditHours = eCredits;
		
		
		double currentQualityPoints = currentGPA * earnedCreditHours;
		
		
		int newCreditHours = 0;
		double newQualityPoints = 0;
		
		
		for(int i = 0; i < newCreditHourList.size(); i++)
		{
			newCreditHours += Integer.parseInt(newCreditHourList.get(i));
			if (newGradeList.get(i).equals("A+"))
			{newQualityPoints += Integer.parseInt(newCreditHourList.get(i)) * 4.5;}
			else if(newGradeList.get(i).equals("A"))
			{newQualityPoints += Integer.parseInt(newCreditHourList.get(i)) * 4.0;}
			else if(newGradeList.get(i).equals("B+"))
			{newQualityPoints += Integer.parseInt(newCreditHourList.get(i)) * 3.5;}
			else if(newGradeList.get(i).equals("B"))
			{newQualityPoints += Integer.parseInt(newCreditHourList.get(i)) * 3.0;}
			else if(newGradeList.get(i).equals("C+"))
			{newQualityPoints += Integer.parseInt(newCreditHourList.get(i)) * 2.5;}
			else if(newGradeList.get(i).equals("C"))
			{newQualityPoints += Integer.parseInt(newCreditHourList.get(i)) * 2.0;}
			else if(newGradeList.get(i).equals("D+"))
			{newQualityPoints += Integer.parseInt(newCreditHourList.get(i)) * 1.5;}
			else if(newGradeList.get(i).equals("D"))
			{newQualityPoints += Integer.parseInt(newCreditHourList.get(i)) * 1.0;}
			else if(newGradeList.get(i).equals("F"))
			{newQualityPoints += Integer.parseInt(newCreditHourList.get(i)) * 0;}
		}
		
		double totalQualityPoints = currentQualityPoints + newQualityPoints;
		int totalCreditHours = earnedCreditHours + newCreditHours;
		double newGPA = totalQualityPoints / totalCreditHours;
		return newGPA;
		
		
	}
}
