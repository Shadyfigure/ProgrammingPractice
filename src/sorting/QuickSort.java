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
		
		for(int i = low; i < hi; i++)
		{
			if(list[i] <= pivot)
			{
				int temp = list[i];
				list[i] = list[part];
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
