package wdh;

public class Julka {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		calculateApples(10, 2);
		calculateApples(11, 4);
		calculateApples(20, 6);
	}

	private static void calculateApples(int totalApples, int klaudiasExtras) {
		float evenSplit = totalApples / 2;
		float extraSplit = klaudiasExtras / 2;

		System.out.println(evenSplit + extraSplit);
		System.out.println(evenSplit - extraSplit);
		System.out.println();

	}
}
