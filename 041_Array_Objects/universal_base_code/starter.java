import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here


		Warrior []x = new Warrior[100];
		Wizard []y = new Wizard[100];
		
		int c = 0;
		while(c<x.length){
			x[c] = new Warrior();
			y[c] = new Wizard();
			c = c+1;	
		}
		c = 0;
		int k = 0;
		while(true){
			y[c].attack(x[k]);
			x[k].attack(y[c]);
			if(x[k].isDead()){
				k=k+1;
			}
			if(y[c].isDead()){
				c = c+1;
			}
			if(k==99){
				System.out.println("mages won");
				System.out.println(100-c+" mages left");
				break;
			}
			if(c==99){
				System.out.println("warriors won");
				System.out.println(100-k+" warriors left");
				break;
			}
			
		}
	
	
	
}
}