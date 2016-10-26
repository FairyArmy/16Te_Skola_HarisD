package numbers;

import java.util.Random;
import java.util.Scanner;

public class Version2 implements Settings {

	
	static String[] cases = { Settings.OPTION_ONE, Settings.OPTION_TWO, Settings.OPTION_THREE };

	static int spc, dtc, GAME_TYPE;
	static Scanner sc = new Scanner(System.in);

	static Random rn = new Random();

	public static void main(String args[]) {

		System.out.println("Choose a gamemode [0] once [1] best of x [2] endless");
		GAME_TYPE = sc.nextInt();
		security();
		gamemode();

	}

	static void Game_Game() {
		printstart();
		spc = sc.nextInt();
		if (spc != 0 && spc != 1 && spc != 2) {
			System.out.print(Settings.CHEAT_MESSAGE);
			System.exit(3);
		}
		dtc = rn.nextInt(2 - 0 + 1) + 0;
		dtcmsg();
		gamerules();
	}

	static void Best_of_x(int times) {

		for (int i = 0; i < times; i++) {
			Game_Game();
		}
	}

	static void dtcmsg() {
		System.out.println("The computer chose: " + cases[dtc]);
	}

	static void gamerules() {
		if (spc == dtc) {
			System.out.println(Settings.DRAW_MESSAGE);
			xline();
		} else if (spc == dtc - 1 || spc == 2 && dtc == 0 ) {
			System.out.println(Settings.VICTORY_MESSAGE);
			xline();
		} else {
			System.out.println(Settings.LOSS_MESSAGE);
			xline();
		}
	}

	private static void xline() {
		System.out.println(Settings.UNDERLINE);
		System.out.println(Settings.UNDERLINE);
	}

	static void security() {
		if (spc != 0 && spc != 1 && spc != 2) {
			System.out.println("Nope");
			System.exit(3);
		}
	}

	static void gamemode() {
		if (GAME_TYPE == 2) {
			System.out.println("I'm tired dont wanna implement this");
		} else if (GAME_TYPE == 1) {
			System.out.println("Enter amount for X:");
			spc = sc.nextInt();
			Best_of_x(spc);
		} else {
			Game_Game();
		}
	}

	static void printstart() {
		System.out.println(Settings.HELP);
		System.out.println(Settings.OPTIONS);
		System.out.println(Settings.UNDERLINE);
	}
}
