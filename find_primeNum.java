import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt =0;
		for(int i=0; i<N; i++) {
			boolean prime =true;
			int num = sc.nextInt();
			if(num==1) {
				continue;
			}
			for(int j=2; j<=(int)(Math.sqrt(num)); j++) {
				if(num % j == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
