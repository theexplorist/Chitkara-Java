package CompanyQuestions;

import java.util.Stack;

public class StackDemoAndFormMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Stack<Integer> stack = new Stack<>();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		
		int poppedEl = stack.pop();
		System.out.println(poppedEl);
		
		poppedEl = stack.pop();
		System.out.println(poppedEl);
		
		boolean ans = stack.isEmpty();
		System.out.println(ans);
		*/
		
		String inp = "DD";
		Stack<Integer> stack = new Stack<>();
		//System.out.println(inp.length());
		
		for(int i = 0; i <= inp.length(); i++) {
			stack.push(i + 1);
			
			if(i == inp.length() || inp.charAt(i) == 'I') {
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
			}
		}
	}
	
	

}
