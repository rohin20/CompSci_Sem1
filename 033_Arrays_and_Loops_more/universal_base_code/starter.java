import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here\
		Random rand = new Random();
		BaseClass test = new BaseClass();
		int k = rand.nextInt(150)+50;
		int[]x = new int[k];
		int count = 0;
		while(count<x.length)
		{
			x[count] = rand.nextInt(99)+1;
			count = count +1;
		
		}
		int min = 1000;
		int c =0;

		c = 0;
		System.out.println();
		while(c < x.length)
		{
		if(x[c] < min)
		{
		min = x[c];
		}
		c = c + 1;
		}
		System.out.println("min = " +min);

//etdrfytguyhiuj\
		int max = 0;
		c = 0;
		System.out.println();
		while(c < x.length)
		{
		if(x[c] > max)
		{
		max = x[c];
		}
		c = c + 1;
		}
		System.out.println("max = "+max);
		
		int total = 0;
		c = 0;
		int g;
		while(c<x.length){
			g = x[c];
			total = total+g;
			c = c+1;

		}
		total = total/k;
		System.out.println("average = "+total);	
		
	}
	
}
	

