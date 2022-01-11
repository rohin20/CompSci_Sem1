import pkg.*;
import java.util.Scanner;
import java.util.Random;

class dwarf {
	String name;
	int age;
	public dwarf(){
		name = "";
		age = 0;
		
	}
	
	public void setName(String a){
		name = a;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void getName(){
		System.out.println(name);
	}
	
	public void getAge(){
		System.out.println(age);
	}
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		dwarf []x = new dwarf[100];
		int y = 0;
		while(y<x.length){
			x[y] = new dwarf();
			y = y+1;
		}
		y = 0;
		while(y<x.length){
		String n = "";
		int ra = rand.nextInt(7);
		if(ra == 0){
			n = "Grumpy";
		}
		if(ra == 1){
			n = "Dopey";
		}
		if(ra == 2){
			n = "Doc";
		}
		if(ra == 3){
			n = "Happy";
		}
		if(ra == 4){
			n = "Bashful";
		}
		if(ra == 5){
			n = "Sneezy";
		}
		if(ra == 6){
			n = "Sleepy";
		}
		int newage = rand.nextInt(100)+1;
		
			x[y].setName(n);
			x[y].setAge(newage);
			y = y+1;
		}
		y = 0;
		while(y<x.length){
			x[y].getName();
			x[y].getAge();
			y = y+1;
		}
		
	}
}
