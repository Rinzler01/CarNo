package carNos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import numbers.NumberCruncher;

class NumberPlateRegTest 
{

	@Test 
	public void age_calculator() 
	{

		String input[] = {"52"};
		String expResult = "52";
		Numberplate cut = new Numberplate();
		
		int result = cut.findHighestNumber(input);
			
		assertEquals(expResult, result);
		
		}
	}

}
