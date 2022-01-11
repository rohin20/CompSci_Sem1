import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("type a phrase;");
		String inp = sc.nextLine();
		int c = 0;
		int n = 0;
		String x = "";
		String y = "";
		while(true){
			c = inp.indexOf(" ",c);
			c++;
			if(c==-0){
				break;
			}

			y = (inp.substring(n,c));
			x = y+x;
			n = c;
		}
		int len = inp.length();
		System.out.println(inp.substring(n,len)+" "+x);

		
	}
}
