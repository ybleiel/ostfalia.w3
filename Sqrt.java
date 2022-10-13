package s0start;

import java.util.Scanner;

public class Sqrt
{
	public static void main(String[] args)
	{
		double a, x, z, d;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		x = 0.0;
		z = 0.0;
		d = 1.0;
		if (a < 0)
			System.out.println("sqrt = NaN");
		else
		{
			x = a / 2.0;
			while (d > 0.000001)
			{
				z = ((a / x) + x) / 2.0;
				d = (z - x) * (z - x);
				if (d < 0.000001)
					break ;
				else
					x = z;
			}
			System.out.println("sqrt = " + z);
		}
	}
}
