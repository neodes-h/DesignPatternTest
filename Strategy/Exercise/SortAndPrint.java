package Exercise;

public class SortAndPrint {
	Comparable[] data;
	Sorter sorter;
	
	public SortAndPrint(Sorter sorter, Comparable[] data) {
		this.sorter = sorter;
		this.data = data;
	}
	
	public void exexute() {
		print();
		sorter.sort(data);
		print();
	}
	
	public void print() {
		for(Comparable item : data)
			System.out.print(item + ",");
		System.out.println("");
	}
}
