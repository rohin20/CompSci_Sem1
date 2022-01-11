import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toString(int[]x){
		int c = 0;
		while(c<x.length){
			System.out.println(x[c]);
			c = c+1;
		}
	}
	public static int getAverage(int[]x){
		int total = 0;
		int c = 0;
		int g = 0;
		int k = x.length;
		while(c<x.length){
			g = x[c];
			total = total+g;
			c = c+1;

		}
		total = total/k;
		return total;
		
	}
	public static int getMax(int[]x){
		int max = 0;
		int c = 0;
		System.out.println();
		while(c < x.length){
			if(x[c] > max){
				max = x[c];
		}
				c = c + 1;
		}	
		return max;
	}
	public static int getMin(int[]x){
		int c = 0;
		int min = 1000;
		System.out.println();
		while(c < x.length)	{
			if(x[c] < min){
				min = x[c];
		}
			c = c + 1;
		}
		return min;
	}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		Random rand = new Random();
		int k = 100;
		int[]y = new int[k];
		int count = 0;
		while(count<y.length)
		{
			y[count] = rand.nextInt(100)+1;
			count = count +1;
		
		}
		
		toString(y);
		int a;
		int b;
		int c;
		a = getAverage(y);
		b = getMax(y);
		c = getMin(y);
		System.out.println("average"+a);
		System.out.println("max"+b);
		System.out.println("min"+c);
		
	}
}
