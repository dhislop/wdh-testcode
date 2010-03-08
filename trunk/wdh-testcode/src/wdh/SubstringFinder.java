package wdh;

public class SubstringFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SubstringFinder.findSubstrings(args[0], args[1]);
	}

	public static void findSubstrings(String string1, String string2) {
		String searchString;
		String content;
		String searchToken = null;
		int searchTokenLength = 2;
		if (string1.length() < string2.length()) {
			searchString = string1;
			content = string2;
		} else {
			searchString = string2;
			content = string1;
		}
			
		for (int i = 0; (i + searchTokenLength) <= searchString.length(); i++) {
			searchTokenLength = 2;
			searchToken = searchString.substring(i, i + searchTokenLength);
			while (content.lastIndexOf(searchToken) != -1) {
				System.out.println(searchToken);
				if ((i + searchTokenLength) < searchString.length()){
					searchTokenLength++;
					searchToken = searchString.substring(i, i + searchTokenLength);
				} else {
					break;
				}
			}
		}
	}
}
