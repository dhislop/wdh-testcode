package wdh;
/**
 *
 * Now the results of both fashion shows are out. The participants of both the fashion shows have 
 * decided to date each other, but as usual they have difficuly in choosing their partners. 
 * The Maximum Match dating serive (MMDS) comes to their rescue and matches them in such a way 
 * that that maximizes the hotness bonds for all couples.
 * 
 * If a man has been rated at hotness level x and a women at hotness level y, 
 * the value of their hotness bond is x*y.
 * Both fashion shows contain N participants each. MMDS has done its job and your 
 * job is to find the sum of hotness bonds for all the couples that MMDS has proposed.
 * 
 * Input
 * 
 * The first line of the input contains an integer t, the number of test cases. t test cases follow.
 * Each test case consists of 3 lines:
 * The first line contains a single integer N (1 <= N <= 1000).
 * The second line contains N integers separated by single spaces denoting the hotness levels of the men.
 * The third line contains N integers separated by single spaces denoting the hotness levels of the women.
 * All hotness ratings are on a scale of 0 to 10.
 * 
 * Output
 * For each test case output a single line containing a single integer denoting the sum of the hotness 
 * bonds for all pairs that MMDS has proposed.
 * 
 * Example
 *
 */
public class Fashion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sumHotness(2, "4 3", "4 2");
	}

	public static void sumHotness(int numberOfPairs, String mensLevels, String womensLevels) {
		String mensSplitLevels[] = mensLevels.split("\\s");
		String womensSplitLevels[] = womensLevels.split("\\s");
		
		int finalSum = 0;
		for (int i = 0; i < mensSplitLevels.length; i++) {
			finalSum = Integer.parseInt(mensSplitLevels[i]) * Integer.parseInt(womensSplitLevels[i]) + finalSum; 
			System.out.println(mensSplitLevels[i]);
			System.out.println(womensSplitLevels[i]);
		}
		System.out.println(finalSum);
	}
}
