public class HeadsAndTails {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int N = 9;

		String binary = "";

		for (int i = 0; i < 9; i++) {
			binary = "" + x%2 + binary;
			x /= 2;
		}

		System.out.println(binary);

		char[][] arr = new char[3][3];
		int index = 0;


		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = binary.charAt(index++) == '1' ? 'T' : 'H';
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}