package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");
	}

	// Add other methods here
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
		}
		return SOS;
	}

	public static List<Double> sortScores(List<Double> results) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i) > results.get(i + 1)) {
					double temp = results.get(i);
					results.set(i, results.get(i + 1));
					results.set(i + 1, temp);
					swap = true;
				}
			}
		}
		// for (int i = 0; i < results.size(); i++) {
		// System.out.println(results.get(i));
		// }
		return results;
	}

	public static List<String> sortDNA(List<String> sequence) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < sequence.size() - 1; i++) {
				if (sequence.get(i).length() > sequence.get(i + 1).length()) {
					String temp = sequence.get(i);
					sequence.set(i, sequence.get(i + 1));
					sequence.set(i + 1, temp);
					swap = true;
				}
			}
		}
		return sequence;
	}

	public static List<String> sortWords(List<String> words) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < words.size(); i++) {
				if (words.get(i).compareTo(words.get(i + 1)) > ) {

				}
			}
		}
		return words;
	}
}