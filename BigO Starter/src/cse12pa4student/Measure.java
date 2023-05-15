package cse12pa4student;

import java.util.ArrayList;
import java.util.List;
import static cse12pa4mysteries.Mysteries.*;
import runtime.*;

public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		/** TODO **/
		int count = 0;
		if(toRun == null) {
			return null;
		}
		ArrayList<Measurement> result = new ArrayList<Measurement>();
		//Example call to mystery method
		for(int i = 0; i < toRun.length; i++) {
			for(int j = startN; j < stopN; j++) {
				long startTime = System.nanoTime();
				callMysteryMethod(toRun[i], j);
				long endTime = System.nanoTime();
				Measurement m = new Measurement(toRun[i], j, endTime - startTime);
				result.add(m);
				//System.out.println("Execution Time: " + (endTime - startTime) + " nanoseconds" + " " + toRun[i]);
				//count++;
			}
		}
	//	System.out.println(count);
		return result;
	}
	
    public static void callMysteryMethod(String letter, int n) {
        switch (letter) {
            case "A":
                mysteryA(n);
                break;
            case "B":
                mysteryB(n);
                break;
            case "C":
                mysteryC(n);
                break;
            case "D":
                mysteryD(n);
                break;
            case "E":
                mysteryE(n);
                break;
            case "F":
                mysteryF(n);
                break;
            default:
                System.out.println("Invalid letter");
                break;
        }
    }
	

	public static String measurementsToCSV(List<Measurement> toConvert) {
		/** TODO **/
		String result = "name,n,nanoseconds" + "\n";
		if(toConvert == null) {
			return null;
		} else
		for(int i = 0; i < toConvert.size(); i++) {
			result += toConvert.get(i).getName() + "," + toConvert.get(i).getN() + "," + toConvert.get(i).getTime() + "\n";
			System.out.println();
		
		}
		System.out.println(result);
		return result;
	}
	
		
}
