import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] x;
		int count;
		x = new int[1000];
		count = 0;
		while(count<x.length)
		{
			x[count] = rand.nextInt();
			count = count +1;
		
		}
		int y = 1;		
		while(y < x.length){

			System.out.println(x[y]);
			y = y+1;
		}

		
	}
}
