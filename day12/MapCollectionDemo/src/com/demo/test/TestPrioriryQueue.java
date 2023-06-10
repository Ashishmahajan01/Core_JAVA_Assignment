package com.demo.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPrioriryQueue {
	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue();
		queue.offer(23);
		queue.offer(34);
		queue.offer(11);
		queue.offer(45);
		queue.offer(34);
		System.out.println(queue);
		Comparator<Integer> c=(o1,o2)->{
			System.out.println("in comparator"+o1+"-----"+o2);
			if(o1<o2)
				return -1;
			else if(o1==o2)
					return 0;
				else
					return 1;
						
		};
		/*when you save data it is always ordered but when you use peek or poll to retrieve the data
		 * then it follws comparator order
		 * */
			PriorityQueue<Integer> q1=new PriorityQueue<>(c);
		 
		q1.add(23);
		q1.add(34);
		q1.add(11);
		q1.add(45);
		q1.add(34);
		System.out.println(q1);
		Iterator<Integer> it=q1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
	}

}
