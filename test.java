import java.io.*;
import java.util.*;

class test {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line);
		int t[] = new int[n];

		for (int i = 0; i < n; i++) {
			line = br.readLine();
			int x = Integer.parseInt(line);

			if (x % 21 == 0) {
				system.out.println("The streak is broken");
			} else if (String.valueOf(x).contains("21")) {
				System.out.println("The streak is broken");
			} else {
				System.out.println("The streak lives still in our heart.");
			}

		}
	}
}

/*
 * 
 * c2=line.indexOf('2'); //c1=line.indexOf('1'); if(c2==m-1){ // this step will
 * exit program System.out.println("End Program "); System.exit(0); } char
 * c1=line.charAt(c2+1); //System.out.println(c2); //System.out.println(c1);
 * 
 * if(((c2!=-1)&&(c1=='1'))||(x%21==0)){ t[i]=1;
 * //System.out.println("The streak is broken!");
 * 
 * }else{ t[i]=0; //System.out.println("The streak lives still in our heart!");
 * //System.out.println("mk"); } } //System.out.println(c2); //
 * System.out.println(c1);
 * 
 * for ( int i = 0; i < n; i++) {
 * 
 * if(t[i]==1){ System.out.println("The streak is broken!"); }else{
 * //System.out.println(t[i]);
 * System.out.println("The streak lives still in our heart!"); }}
 */

//}
