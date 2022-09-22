package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
		int n = scan.nextInt();
		boolean[] prime = new boolean[n - 1];
		for(int i = 0; i <= n - 2; i++) {
			prime[i] = true;
		}
		for(int j = 0; j <= n - 2; j++) {
			if (prime[j] == true) {
				int l = 2;
			for (int k = (j + 2) * l; k <= n; l++) {
				prime [k - 2] = false;
				k = (j + 2) * l;
			}
				
		}
			
		}	
		for (int i = 0; i <= n - 2; i++) {
			if (prime[i]) {
				System.out.println(i+2);
			}
		}
		
	}

}
