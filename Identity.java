public class Identity {
	public static void main(String[] args) {
		int[][] arr = {{1,0,0},
					   {0,1,0},
					   {0,3,1}};

		boolean flag = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int x = arr[i][j];
				if (i == j) {
					if (x != 1) flag = false;
				}
				else {
					if (x != 0) flag = false;
				}
			}
		}
		System.out.println(flag);
	}
}