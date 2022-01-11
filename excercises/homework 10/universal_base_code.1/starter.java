import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int count;
		int[] x = new int[20];
		count = 0;
		while(count<x.length)
		{
			x[count] = rand.nextInt(10)+1;
			System.out.print(x[count]);
			count++;
		}
		int check = rand.nextInt(10)+1;
		System.out.println("");
		System.out.println("checking for " +check);
		int y = 1;	
		int amount = 0;
		while(y < x.length){
			if(check == x[y]){
				System.out.println("duplicate!!! "+x[y]);
				System.out.println("index number is "+y);
				amount = amount+1;
			}
			y =y+1;
		}
		System.out.println(amount+" duplicates in total");
		int c = 0;
		int l = 0;
		for(int i=0;i<x.length-1;i++){
			c = x[i];
			l = x[i+1];
			if(c==l){
				System.out.println("two in a row of "+x[i]);
			}
		}
		
		
		
		
	}
}
