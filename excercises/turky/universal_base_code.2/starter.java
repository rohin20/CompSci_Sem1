import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String []turkey = new String[10];
		turkey[0] = "       _^_^_^_^_^_^_";
		turkey[1] = "    (‘ ‘ ‘ ‘ ‘ _____‘ ‘)";
		turkey[2] = "   (	/ o    o\\         )";
		turkey[3] = " (____  \\      _\\   /    )";
		turkey[4] ="|\\---------  \\____/\\ \\	";
		turkey[5] ="	\\	\\	 \\_ \\	/";
		turkey[6] = " \\ _____|______ ____/";
		turkey[7] = "	|  |        |  |";
		turkey[8] = "            |  |        |  |";
		turkey[9] = "	yyy	yyy";
		
		
		for(int k =0; k<turkey.length;k++){
			System.out.println(turkey[k]);
			
			
		}
	}
}
