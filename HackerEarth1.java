import java.util.*;

public class HackerEarth1 {
	public static void main(String[] args) {
		int i, sm = 0, j;
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (i = 1; i <= t; i++) {
			int n = in.nextInt();
			int[] a = new int[n];
			int[] sum = new int[n - 1];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			// for(i=0;i<n;i++){
			// System.out.println(a[i]);}
			sum[0] = a[0] + a[1];
			for (i = 2, j = 0; i < n; i++) {
				if (i != n - 1) {
					if ((sum[j] < a[i + 1])) {
						sum[++j] = sum[j] + a[i];
					}

					else
						sum[++j] = a[i + 1] + a[i];
				}

			}

			// do{
			// sum=a[0];
			// sum=+a[++i];

			// }while(i<n && sum<=a[i+2]);
			for (i = 0; i < n - 1; i++)
				sm += sum[i];
			System.out.println(sm);
		}
	}
}