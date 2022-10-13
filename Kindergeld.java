package s0start;

import java.util.Scanner;

public class Kindergeld
{

	public static void main(String[] args)
	{
		int k, anspruch;
		Scanner sc = new Scanner(System.in);

		k = sc.nextInt();
		anspruch = 0;

		if (k == 1 || k == 2)
			anspruch = k * 219;
		else if (k == 3)
			anspruch = 663;
		else if (k >= 4)
			anspruch = 663 + ((k - 3) * 250);
		System.out.println("Anspruch = " + anspruch);

		sc.close();
	}
}
