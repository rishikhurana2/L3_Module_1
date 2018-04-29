package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");
	}
	
	//Add other methods here
	public static int countPearls(List<Boolean> oysters) {
		return oysters.indexOf(true);
	}
	public static double findTallest(List<Double> peeps) {
		double val = Double.MIN_VALUE;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > val) {
				val = peeps.get(i);
			}
		}
		return val;
		
	}
	public static String findLongestWord(List<String> words) {
		int stringLength = words.get(0).length();
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > stringLength) {
				String s = words.get(i);
				return s;
			}
		}
		return null;
	}
	public static boolean containsSOS(List<String> messages) {
		boolean SOS = false;
		for (int i = 0; i < messages.size(); i++) {
			if (messages.get(i).equals(" ... --- ... ")) {
				SOS = true;
			}
		} return SOS;
	}
	public static ArrayList<Double> sortScores(List<Double> results) {
		double min = Double.MIN_VALUE;
		int hold = 0;
		ArrayList<Double> fin = new ArrayList<Double>();
		for(int i = 0; i < results.size(); i++) {
			min = Double.MAX_VALUE;
			for (int j = i; j < results.size(); j++) {
				if(results.get(i) < min) {
					min = results.get(j);
					hold = j;
				}
			}
			fin.add(min);
		}
		System.out.println(results);
		return fin;
	}
}