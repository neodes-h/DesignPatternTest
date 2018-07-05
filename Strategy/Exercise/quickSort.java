package Exercise;

public class quickSort implements Sorter {

	@Override
	public void sort(Comparable[] data) {
		sort(data,0,data.length-1);

	}
	
	public void sort(Comparable[] data, int low, int high) {
		if(low >= high)
			return;
		
		int pivot = high;
		int i = low, j = high;
		while(i < j) {
			if(data[i++].compareTo(data[pivot]) > 0)
				swap(data, --i,--j);
			swap(data, i, high);
		}
		
		sort(data,low, i-1);
		sort(data, i+1, high);
	}
	
	
	public void swap(Comparable[] data, int a, int b) {
		Comparable tmp = data[a];
		data[a] = data[b];
		data[b] = tmp;
	}

}
