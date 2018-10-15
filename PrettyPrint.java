public class PrettyPrint {

	public static void main(String[] args) {
		String name = args[0];

		int padding = 4;
		int length = name.length();
		int noOfStars = length + padding;
		
		int noOfSpaces = noOfStars - name.length() - 2;
		// First Line
		for (int i = 0; i < noOfStars; i++) {
			System.out.print("*");
		}
		System.out.println();

		// Second Line
		System.out.print("*");
		for (int i = 0; i < noOfSpaces/2; i++) {
			System.out.print(" ");
		}
		System.out.print(name);
		for (int i = 0; i < noOfSpaces/2; i++) {
			System.out.print(" ");
		}
		System.out.println("*");

		// Last Line
		for (int i = 0; i < noOfStars; i++) {
			System.out.print("*");
		}
		System.out.println();		
	}
}