import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		BaseClass test = new BaseClass();
		int[]x = new int[20];
		int count = 0;
		int h = 0;
		int c = 0;
		while(count<x.length){
			x[count] = rand.nextInt(50)+1;
			count = count+1;
		}
		int[]y = new int[20];
		int cou = 0;
		while(cou<y.length){
			y[cou]= rand.nextInt(50)+1;
			cou = cou+1;
		}
		while(c<x.length){
			System.out.println(x[h]);
			h = h+1;
			c = c+1;
		}
		int g = 0;
		int f = 19;
		while(g<y.length){
			System.out.println(x[f]);
			f = f+1;
			g = g+1;
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
