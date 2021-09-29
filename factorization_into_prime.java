import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//1. N을 i로 나누어 나머지 0이면 출력, 0아니면 다음 수로 넘어가서 나누기.
		for(int i=2; i<=N; i++) {
			while(N%i == 0) {
				N/=i;
				System.out.print(i+ " ");
			}
		}
		
	}
}

