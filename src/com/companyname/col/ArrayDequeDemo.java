package com.companyname.col;

import java.util.ArrayDeque;
import java.util.Deque;
class ArrayDequeDemo
{
	public static void main(String[] args)
	{
		Deque<String> stack = new ArrayDeque<>();
		String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday" };
		for (String weekday: weekdays)
			stack.push(weekday);
		//while (stack.peek() != null)
		while (!stack.isEmpty())
			System.out.println(stack.pop());
	}
}