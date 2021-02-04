package com.chitkara.collectionframework;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();// 1.Ye do tarfa yaani Double ended nahin hai
		Deque<Integer> q1 = new LinkedList<>();//2.Ye hai Two faced
		Collection<Integer> q2 = new LinkedList<>();//3.Ye bhi ni hai
		q1.addFirst(10);//Pehle end pr
		q1.add(20);//end2 ye hai simple queue ka add
		q1.addFirst(30);
		q1.addLast(50);
		System.out.println(q1);
		
		q1.remove(); //Simple queue ka remove
		System.out.println(q1);
		q1.removeLast();
		System.out.println(q1);
		Queue<Integer> q3 = new ArrayDeque<>();//4.Ye bhi hai FIFO
		
		Deque<Integer> stack = new ArrayDeque<>();
		stack.addLast(10);
		stack.addLast(20);
		stack.addLast(30);
		stack.addLast(40);
		
		System.out.println(stack);
		
		stack.removeLast();
		System.out.println(stack);
		System.out.println(stack.peekLast());
	}

}
