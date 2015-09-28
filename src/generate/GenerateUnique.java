package generate;

public class GenerateUnique 
{
	//list has only unique values
	//list may or may not be sorted
	//generate a number not contained therein
	public int findUniqueInt(int[] nums)
	{
		//may want to check that nums is valid here
		//also will want to check in here if all possible integers have been covered
		//however unlikely, this can simply be done by checking against the first number
		//if the first number == the temp number than we've hit every possible number
		
		int temp = nums[0];
		
		for(int i = 1; i < nums.length; i++)
		{
			temp = nums[i] ^ temp;
		}
		
		return temp;
	}
	//further enhancements might take in to consideration the size of the number
	//however, the above method assumes consistent numbers of bits in length for XOR compare
}
