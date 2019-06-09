package com.stacks;

public class Stack
{
	private int[] numbers;
	private int size;
	private int top;
	public Stack(int size)
	{
		this.size = size;
		this.numbers = new int[size];
		this.top = -1;
	}
	 public void push(int value) 
	 {
		 ++top;
		 numbers[top] = value;
	 }
	 
	 public int pop() 
	 { 
		 
		 int old = top;
		 --top; 
	    return numbers[old]; 
	 }
     public int peek() 
     {
    	 return numbers[top];
     }
     
     public boolean isEmpty() 
     { 
    	 return (top==-1);
     }
     public boolean isFull()
     {
    	 return (size-1==top);
     }
}
