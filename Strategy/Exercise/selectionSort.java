package Exercise;

public class selectionSort implements Sorter {
	

	@Override
	public void sort(Comparable[] data) {
		for(int i = 0; i < data.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < data.length; j++) {
				if(data[j].compareTo(data[min]) < 0)
					min = j;
				
				Comparable passingNode = data[min];
				data[min] = data[i];
				data[i] = passingNode;
			}
		}

	}

}
