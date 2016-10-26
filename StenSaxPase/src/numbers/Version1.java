package numbers;

import java.util.Random;
import java.util.Scanner;

public class Version1 implements Settings{
	
	
	static String[] cases = {Settings.OPTION_ONE, Settings.OPTION_TWO, Settings.OPTION_THREE};
	
	static int spc,dtc;
	static int GAME_TYPE = 0;
	
	static Random rn = new Random();
	
	public static void main(String args[]) {
		//the scanner starts
		Scanner sc = new Scanner(System.in);
		//Prints all my initialization messages
		printstart();
		//Gets the int
		spc = sc.nextInt();
		//My way to make sure that the input is between 0-2
		if(spc != 0 && spc != 1 && spc != 2){
			System.out.print(Settings.CHEAT_MESSAGE);
			System.exit(3);
		}
		//The scanner closes to prevent leaking
		sc.close();
		//The computer generates a random number between  0-2
		dtc = rn.nextInt(2 - 0 + 1) + 0;
		//Prints
		dtcmsg();
		gamerules();
	}
	
	
	static void dtcmsg(){
		System.out.println("The computer chose: "+ cases[dtc]);
		System.out.println(Settings.UNDERLINE);
	}
	
	
	static void gamerules(){
		if(spc == dtc){
			System.out.println(Settings.DRAW_MESSAGE);
		}else if(spc == dtc-1){
			System.out.println(Settings.VICTORY_MESSAGE);
		}else{
			System.out.println(Settings.LOSS_MESSAGE);
		}
	}
	
	static void printstart(){
		System.out.println(Settings.HELP);
		System.out.println(Settings.UNDERLINE);
		System.out.println(Settings.OPTIONS);
	}
	
}