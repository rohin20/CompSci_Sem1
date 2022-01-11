package pkg;
import java.util.Scanner;
import java.util.Random;


public class Rogue implements Role{
	Random rand = new Random();
	String name;
	int health;
	int attack;
	public Rogue() {
		name = "Gerald";
		health = rand.nextInt(15)+1;
		attack = rand.nextInt(15)+1;
		
		
	}
	
	public Rogue(String a){
		name = a;
		health = rand.nextInt(15)+1;
		attack = rand.nextInt(15)+1;
	}
	
	public void setHealth(int a){
		health = a;
	}

	public int getHealth(){
		return health;
	}
	
	public String getName(){
		return name;
	}
	
	public void attack(Role a){
		int dmg = rand.nextInt(attack);
		int hp = a.getHealth();
		hp = hp-dmg;
		a.setHealth(hp);
	}
	

	
}


