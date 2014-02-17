package com.outlook.jim.example_whileloop;

public class WhileLoop {

	private int i = 0;

	public void doLoop() {
		while(i <= 20)
		{
			if(3 == i) {
				i+=2;
				continue;  //continue jumps back to the top of the while
			}
			System.out.println(i);
			i++;

			if(0 == (i % 2)){  //check if i is even, i divided by 2, then the remainder
				i++;
			}
			
			if(i > 10)
				break; //break exits the while loop
		}
	}

}
