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
		
		//convert to string array for return
		int i = 0;
		for(String perm : permutations)
		{
			permutationsArr[i] = perm;
			i++;
		}
		
		return permutationsArr;
	}
	
	//creating permutations is like traversing a tree
	//each level down has +1 branches compared to the level before it
	private void createPermutations(String letters, int currL, String perm)
	{
		if(currL >= letters.length())//if we've used all the letters, add the permutation
		{
			permutations.add(perm);
		}
		else//continue adding letters one at a time
		{
			//every time we add a letter we add that number of branches
			for(int i = 0; i <= currL; i++)
			{
				//move down a level/use the next letter
				//need to recurse for each of the permutation potentials
				createPermutations(letters, currL+1, 
								insertLetterAt(perm, letters.charAt(currL), i));
			}
		}
	}
	
	//"base case"
	//insert a letter to a specific location in a string
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
