import java.util.*;
import java.io.*;

class test {
	public static void main(String args[]) throws IOException {

		int c2;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int t[] = new int[n];

		for (int i = 0; i < n; i++) {

			String x = scn.nextLine();
			c2 = x.indexOf('2');
			// c1=line.indexOf('1');
			char c1 = x.charAt(c2 + 1);
			// System.out.println(c2);
			// System.out.println(c1);
			int m = valueOf(x);
			if (((c2 != -1) && (c1 == '1')) || (m % 21 == 0)) {
				t[i] = 1;
				// System.out.println("The streak is broken!");

			} else {
				t[i] = 0;
				// System.out.println("The streak lives still in our heart!");
				// System.out.println("mk");
			}
		}
		// System.out.println(c2);
		// System.out.println(c1);

		for (int i = 0; i < n; i++) {

			if (t[i] == 1) {
				System.out.println("The streak is broken!");
			} else {
				// System.out.println(t[i]);
				System.out.println("The streak lives still in our heart!");
			}

		}

//}

	}
}