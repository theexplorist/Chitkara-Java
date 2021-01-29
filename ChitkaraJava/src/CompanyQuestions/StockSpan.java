package CompanyQuestions;

import java.util.Arrays;

public class StockSpan {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {30, 35, 40, 38, 35};
		
		int[] span = new int[heights.length];
		span[0] = 1;
		
		for(int curr = 1; curr < heights.length; curr++) {
			span[curr] = 1;
			for(int prev = curr - 1; prev >= 0; prev--) {
				if(heights[prev] < heights[curr]) {
					span[curr]++;
				} else {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(span));
	}

}
