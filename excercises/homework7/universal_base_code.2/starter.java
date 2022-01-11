import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dog{
	String name;
	String breed;
	int age;
	
	public Dog(String a){
		name = a;
		breed = new String("dog dog");
		age = 1;
	}
	
	public Dog(String a, String b){
		name = a;
		breed = b;
		age = 1;
	}
	
	public Dog(String a, int b){
		name = a;
		age = b;
		breed = new String("dog dog");
	}
	public void setName(String a){
		name = a;
	}
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String a){
		breed = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		Random rand = new Random();
		int chance = rand.nextInt(2);
		if(chance==1){
			return true;
		}
		else{
			return false;
		}
	} 
	public void bark(){
		System.out.println(name+" did a bark");
	}
}
class starter {
	
	
	public static void main(String args[]) {
		// Your code goes below here
		Dog x = new Dog("Pal");
		x.setAge(12);
		Dog y = new Dog("chicken","Golden Retriever");
		boolean check1 = x.isSleeping();
		boolean check2 = y.isSleeping();
		if(check1){
			System.out.println(x.name+" is sleeping");
		}
		else{
			x.bark();
			y.bark();
		}
		


		
	}
}
