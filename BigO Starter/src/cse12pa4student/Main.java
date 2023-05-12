package cse12pa4student;
import static cse12pa4mysteries.Mysteries.*;

public class Main {
	
	public static void main(String[] args) {
		Measure temp = new Measure();
		//temp.measure(new String[]{"A", "B"}, 40, 100);
		temp.measurementsToCSV(temp.measure(new String[]{"A", "B"}, 40, 100));
	}
}
