/* IMPORTANT: Multiple classes and nested static classes are supported */

/*uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Rip {
	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 */
		int c2 = -1, c1, i, x = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line);
		int t[] = new int[n];
		line = br.readLine();
		x = Integer.parseInt(line);

		for (i = 0; i < n; i++) {
			line = br.readLine();
			x = Integer.parseInt(line);

		}
		for (i = 0; i < n; i++) {

			c2 = line.indexOf('2');
			c1 = line.lastIndexOf('1');
			if (((c1 != -1) && (c2 != -1)) && (c2 < c1)) {
				System.out.println("mk!");

				t[i] = 1;

			} else

			{
				t[i] = 0;
			}
			if ((t[i] == 1) || (x % 21 == 0))
				System.out.println("The streak is broken!");
			else
				System.out.println("The streak lives still in our heart!");
		}

	}
}
