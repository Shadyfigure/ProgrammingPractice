package sorting;

public class MergeSort 
{
	//destroys original list
	public void run(int[] list)
	{
		int[] helper = new int[list.length];
		
		topDownSplit(list, helper, 0, list.length);
	}
	
	private void topDownSplit(int[] list, int[] helper, int left, int right)
	{
		if(right - left < 2)
			return;
		
		int mid = (right + left) / 2;
		
		topDownSplit(list, helper, left, mid);
		topDownSplit(list, helper, mid, right);
		topDownMerge(list, helper, left, mid, right);
		copyArray(list, helper, left, right);
	}
	
	private void topDownMerge(int[] list,int[] helper, int left, int mid, int right)
	{
		int leftInc = left;
		int midInc = mid;
		
		for(int i = left; i < right; i++)
		{
			if(leftInc < mid && (midInc >= right || list[leftInc] <= list[midInc]))
			{
				helper[i] = list[leftInc];
				leftInc++;
			}
			else
			{
				helper[i] = list[midInc];
				midInc++;
			}
		}
	}
	
	private void copyArray(int[] list, int[] helper, int left, int right)
	{
		for(int i = left; i < right; i++)
		{
			list[i] = helper[i];
		}
	}
}
