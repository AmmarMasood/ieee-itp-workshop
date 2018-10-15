public class CountXX {
	public static void main(String[] args) {
		
		String s = "xx";
		String word = "xxx";
		int ctr = 0;

		for (int i = 0; i < word.length() - 1; i++) {
			if (word.substring(i,i+2).equals(s)) {
				ctr++;
			}
		}
		System.out.println(ctr);
	}
}