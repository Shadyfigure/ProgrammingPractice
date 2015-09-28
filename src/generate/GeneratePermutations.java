package generate;

import java.util.ArrayList;

//careful with this one
//time complexity of n! is bad
//keep to small(ish) inputs
public class GeneratePermutations 
{
	ArrayList<String> permutations;
	
	public String[] createPermutations(String letters)
	{
		permutations = new ArrayList<String>();
		
		createPermutations(letters, 0, new String());
		
		String[] permutationsArr = new String[permutations.size()];
		
		int i = 0;
		for(String perm : permutations)
		{
			permutationsArr[i] = perm;
			i++;
		}
		
		return permutationsArr;
	}
	
	private void createPermutations(String letters, int currL, String perm)
	{
		if(currL >= letters.length())
		{
			permutations.add(perm);
		}
		else
		{
			for(int i = 0; i <= currL; i++)
			{
				createPermutations(letters, currL+1, 
								insertLetterAt(perm, letters.charAt(currL), i));
			}
		}
	}
	
	private String insertLetterAt(String perm, char letter, int loc)
	{
		char[] temp = new char[perm.length() + 1];
		boolean added = false;
		
		for(int i = 0; i < temp.length; i++)
		{
			if(i == loc)
			{
				temp[i] = letter;
				added = true;
			}
			else if(added)
			{
				temp[i] = perm.charAt(i-1);
			}
			else
			{
				temp[i] = perm.charAt(i);
			}
		}
		
		return String.valueOf(temp);
	}
}
