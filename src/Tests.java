import sorting.MergeSort;
import sorting.QuickSort;
import java.util.*;

import generate.GeneratePermutations;
import generate.GenerateUnique;
import helpers.MissingMathFunctions;
import search.FindTheTwos;

public class Tests 
{
	//careful with your string input
	//calculating all permutations takes n! time
	//can get very long
	public static void permutationsTest()
	{
		System.out.println("Running: Permutations Test");
		
		String input = "fgabtkd";
		GeneratePermutations permGen = new GeneratePermutations();
		String[] permutations = permGen.createPermutations(input);
		
		int i = 1;
		for(String perm : permutations)
		{
			System.out.println(i + ": " + perm);
			i++;
		}
		
		System.out.println("Total should be: " + MissingMathFunctions.factorialOf(input.length()));
	}
	
	/*
	 * In an unordered list of unique integers of any size, generate a value that it does not contain.
	 * 
	 * Extra prints are used to get a better idea of when the unique number generation actually starts since
	 * building the test array can take some time with supplied Java functions. Using supplied functions for
	 * better assurance that test will be valid.
	*/
	public static void uniqueIntegerTest()
	{
		System.out.println("Running: Unique Number Find");
		System.out.println("Building: Test List");
		//create a list of unique numbers
		//In the future I'd probably use the method I'm testing because this takes forever for large sets.
		
		int length = 100000;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < length; i++)
		{
			int temp = (int)(Math.random() * Integer.MAX_VALUE - (Integer.MAX_VALUE/2));
			if(!nums.contains(temp))
			{
				nums.add(temp);
			}
		}
		
		int[] list = new int[nums.size()];
		int j = 0;
		for(Integer n : nums)
		{
			list[j] = n;
			j++;
		}
		
		
		/* small batch test
		int[] list = {0,1,2,3,5,6,7,9,10,11,12,13,14};
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i : list)
		{
			nums.add(i);
		}*/
				
		GenerateUnique findUnique = new GenerateUnique();
		System.out.println("Generating the number");
		int uniqueNum = findUnique.findUniqueInt(list);
		
		System.out.println("Checking: " + uniqueNum);
		
		if(!nums.contains(uniqueNum))
		{
			System.out.println("Unique number.");
		}
		else
		{
			System.out.println("Not Unique.");
		}
	}
	
	//Find the number of twos between 0 and n
	public static void twosTest()
	{
		System.out.println("Running: Twos Test");
		
		FindTheTwos twosTest = new FindTheTwos();		
		System.out.println("Twos Test: " + twosTest.checkRangeForTwos(25));
		
		System.out.println();//linebreak
	}
	
	//merge sort test
	public static void mergeSortTest()
	{
		System.out.println("Running: Merge Sort Test");
		//Merge Sort
		//sorts currently destroy given list by sorting it
		MergeSort mergeSort = new MergeSort();
		int[] numList = new int[100];
		final int MAX = 1000;
		final int MIN = 0;
		for(int i = 0; i < numList.length; i++)
		{
			numList[i] = (int)((Math.random()*(MAX-MIN))+MIN);
		}
		
		mergeSort.run(numList);
		
		for(int i : numList)
		{
			System.out.println(i);
		}
		
		System.out.println();//linebreak
	}
	
	//quick sort test
	public static void quickSortTest()
	{
		System.out.println("Running: Quick Sort Test");
		//Quick Sort
		//sorts currently destroy given list by sorting it
		//
		//create list of random numbers
		int[] numList = new int[100];
		final int MAX = 1000;
		final int MIN = 0;
		for(int i = 0; i < numList.length; i++)
		{
			numList[i] = (int)((Math.random()*(MAX-MIN))+MIN);
		}
		
		QuickSort quickSort = new QuickSort();
		quickSort.run(numList);
		
		for(int i : numList)
		{
			System.out.println(i);
		}
		
		System.out.println();//linebreak
	}
}
