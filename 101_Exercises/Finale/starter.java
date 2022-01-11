import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		public int getMode(int []array){
			int mode = 0;
			int c = 0;
			int b = 0;
			int check = 0;
			int amount = 0;
			int recent = 0;
			int flag = 1;
			if(array.length>0){
				while(b < array.length){
					check = array[b];
					if(check == array[c]){
						amount++;
					}
					if(amount>recent){
						
						recent = check;
					}
					if(c==array.length){
						b++;
					}
					c++;
				}
				if(){
					return -1;
				}
				return check;
			
		}
		


		
	}
}
