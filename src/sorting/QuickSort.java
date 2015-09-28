package sorting;

public class QuickSort 
{
	//destroys original list
	public void run(int[] list)
	{
		sort(list, 0, list.length-1);
	}
	
	private void sort(int[] list, int low, int hi)
	{
		if(low < hi)
		{
			int part = partition(list, low, hi);
			sort(list, low, part - 1);
			sort(list, part + 1, hi);
		}
	}
	
	private int partition(int[]list, int low, int hi)
	{
		int pivot = list[hi];
		int part = low;
		
		for(int j = low; j < hi; j++)
		{
			if(list[j] <= pivot)
			{
				int temp = list[j];
				list[j] = list[part];
				list[part] = temp;
				
				part++;
			}
		}
		
		if(hi != part)
		{
			int temp = list[hi];
			list[hi] = list[part];
			list[part] = temp;
		}
		
		return part;
	}
}
