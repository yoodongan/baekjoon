import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[] arr = new boolean[N+1];
		for(int i=2; i<N+1; i++) {
			arr[i] = true;
		}
		
		for(int i=2; i<Math.sqrt(N+1); i++) {
			for(int j=i*i; j<N+1; j+=i) {
				arr[j] = false;
			}
		}
		int sum = 0;
		int first = 0;
		boolean prime = true;
		for(int i=M; i<N+1; i++	) {   
			if(arr[i]) {
				sum+=i;
			}
		}
		for(int i=M; i<N+1; i++	) {    
			if(arr[i]) {
				first = i;
				break;
			}
		}
		if(sum == 0) {     
			prime =false;
		}
		if(prime) {
			System.out.println(sum+ "\n" + first);
		}
		else
			System.out.println("-1");
		sc.close();
	
	}
}
