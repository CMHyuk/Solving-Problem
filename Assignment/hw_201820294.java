import java.util.Scanner;
 
public class hw1_201820294 {
 
	public static boolean prime[];
	
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
							
		prime = new boolean[N + 1];	// 배열 생성 
		get_prime();
				
			if(prime[N] == false) {	//N이 소수면
				System.out.println("True");				
			} else {
				System.out.println("False");
			}
			
		int a = in.nextInt(); //최대공약수 입력 값
		int b = in.nextInt(); //최대공약수 입력 값	
			
		int d = gcd(a, b);

		System.out.println(d);
		
	}
					
	public static void get_prime() { // 에라토스테네스의 체 소수찾기 알고리즘 
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) { //2부터 배열크기의 제곱근까지
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true; //나눠지면 배열에 true저장 소수인 것들은 나눠지지 않으면 False
			}
		}
		
	}
	
	public static int gcd(int a, int b) { //최대공약수 메소드
		 
		while (b != 0) { //0이 될 때 까지
			int r = a % b; //유클리드 알고리즘

			a = b;
			b = r;
		}
		return a;
	}
	
}
