package com.stacks;

public class MainApp {

	public static void main(String[] args)
	{
		 int[] numbers = new int[5];
		 int index=0;
		
		Stack myStack = new Stack(5);
		
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		
		while(!myStack.isEmpty()) 
		{
			int  value =myStack.pop();
			System.out.print(value+" ");
			numbers[index] = value;
			++index;
			
		}

		System.out.print(" ===>> ");
		
		for(int first = 1; first<numbers.length;++first) 
		{
			int newElement = numbers[first];
			
			int i;
			
			for(i=first;i>0 && numbers[i-1]>newElement;--i) 
			{
				numbers[i] = numbers[i-1];
			}
		 numbers[i] = newElement;
		}
		
		
		for(int x=0; x<numbers.length;++x) 
		{
			System.out.print(numbers[x]+" ");
		}
	
		search(numbers, 3);
		
	
	}
	 public static void search( int[]numbers, int searchValue)
	 {
		 
		 int midpoint = 0; // index
		 int start = 0;
		 int end =  numbers.length-1;
		 boolean isfound= false;
		 
		 while(start<=end && !isfound)
		 {
			 midpoint = (start+end)/ 2;
			 
			 if(searchValue== numbers[midpoint]) 
			 {
				 isfound= true;
			 }
			 else 
				 if(searchValue>numbers[midpoint]) 
				 {
					 start = midpoint + 1;
				 }
				 else 
				 {
					 end = midpoint -1;
				 }
			 
			 if(isfound) 
			 {
				 System.out.print("\nThe value is been found at "+midpoint);
			 }
			 else 
			 {
				 System.out.print(" \nSorry!!!! The value is not found");
				 
			 }
		 }
		 
		 
		 
	 }
}
