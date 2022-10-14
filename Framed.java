package s0start;

import java.awt.Color;

import std.ui.MiniApp;

public class Framed extends MiniApp
{
	public static void main(String[] args)
	{
		int h, u, r, l;
		char key;
		fillCircle("ball", 150, 100, 10, Color.BLACK);
		
		h = 2;
		u = 2;
		r = 2;
		l = 2;
		key = 'o';
		while (key != '')
		{
			key = getKey();
			if (key == 'w')
				h += 2;
			else if (key == 'a')
				l += 2;
			else if (key == 's')
				u += 2;
			else if (key == 'd')
				r += 2;
			if ((150 + r - l) - 10 < 0)
				l -= 2;
			else if ((150 + r - l) + 10 > WINDOW_WIDTH)
				r -= 2;
			if ((100 + u - h) - 10 < 0)
				h -= 2;
			else if ((100 + u - h) + 10 > WINDOW_HEIGHT)
				u -= 2;
			fillCircle("ball", 150 + r - l, 100 - h + u, 10, Color.BLACK);
			
		}
	}
}
