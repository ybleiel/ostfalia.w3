
	package s0start;

	import java.util.Scanner;

	public class SimpleDelivery
	{
		public static void main(String[] args)
		{
			int n, max, p, t;
			float avg;
			Scanner sc = new Scanner(System.in);

			p = 0;
			t = 0;
			n = 0;
			max = 0;
			avg = 0;
			while (true)
			{
				t = sc.nextInt();
				p += t;
				if (p > 100)
				{
					p -= t;
					break ;
				}
				n++;
			}
			avg = p / n;
			max = t;
			System.out.println("n = " + n);
			System.out.println("max = " + max);
			System.out.println("avg = " + avg);
			if ((p / n) >= 20)
				System.out.println("allheavy");
		}
	}
