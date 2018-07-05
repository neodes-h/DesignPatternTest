package Exercise;

public class testExercise {

	public static void main(String[] args) {
		String[] data = {
				"Dumpty","Bowman","Carroll","Elfland","Alice"
		};
		
//		SortAndPrint a = new SortAndPrint(new selectionSort(), data);
		SortAndPrint b = new SortAndPrint(new quickSort(), data);
//		a.exexute();
		b.exexute();
	}

}
