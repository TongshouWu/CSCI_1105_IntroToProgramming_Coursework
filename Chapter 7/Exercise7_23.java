/*
Author:Tongshou Wu
Date: 08/25/2020

This program is a Game: locker puzzle.
 */
public class Exercise7_23 {

	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		
		thisgame(lockers);
		theOpenlockers(lockers);
	}
	public static void thisgame(boolean[] lockers) {
		for (int a = 1; a <= 100; a++) {
			for (int b = a; b <= 100; b += a) {
				if (lockers[b - 1])
					lockers[b - 1] = false;
				else
					lockers[b - 1] = true;
			}
		}
	}
	public static void theOpenlockers(boolean[] lockers) {
		System.out.print("The open lockers are: ");
		for (int i = 0; i < 100; i++) {
			if (lockers[i])
				System.out.print((i + 1) + " ");
		}
	}
}
