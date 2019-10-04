import java.io.*;

class prime {
	public static void main(String[] args) throws IOException {
		int i = 0, j = 0, c = 0;
		int num = 0, sum = 2;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int p[] = new int[N];
		for (i = 3, j = 0; i <= N; j++, i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;

				}
			}
			if (counter == 2) {

				p[j] = i;

			}

		}
		for (i = 0; i < p.length; i++) {
			for (j = 0; j < i; j++) {

				sum = sum + p[j];

				if (p[i] == sum) {
					c++;
					sum = 2;
					break;
				}

			}
			sum = 2;
		}
		System.out.println(c);

	}
}