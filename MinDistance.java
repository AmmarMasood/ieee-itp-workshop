public class MinDistance {
	public static void main(String[] args) {
		
		int[] arr = {4, 8, 6, 1, 2, 9, 4};
		int dist = -1;
		int index = -1;
		int minDist = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length-1; i++) {
			dist = Math.abs(arr[i]-arr[i+1]);
			if (dist < minDist) {
				minDist = dist;
				index = i;
			}  
		}

		System.out.print(minDist + " at " + index);
	}
}