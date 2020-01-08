package carNos;

public class Numberplate 
{

	public int findHighestNumber(String inputNumberPlate) 
	{
		int number1 = Integer.parseInt(String.valueOf(inputNumberPlate.charAt(0)));
		int number2 = Integer.parseInt(String.valueOf(inputNumberPlate.charAt(1)));
		
		if (number1 > 4)
		{
			number2++;
			
			number1 -= 5;
		}
		else 
		{
			number1 += 5;
			
		}
		
		return number1 + number2;
	}
	
}
