package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("resolution?");
		int resolution = in.nextInt();
		int hit = 0;
		for (int i = 1; i <= resolution; i++) {
			double x = Math.random();
			double y = Math.random();
			double d = Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
			if (d <= 1) {
				hit++;
			}
		}
		double rate = (double) hit / resolution;
		double pi = rate * 4;
		System.out.println("simulated pi value is" + pi);

	}

}
