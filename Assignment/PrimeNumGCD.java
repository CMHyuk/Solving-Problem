import java.util.Scanner;

public class PrimeNumGCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        	
		is_prime(sc.nextInt()); //소수 판별 입력 값
		
		int a = sc.nextInt(); //최대공약수 입력 값
		int b = sc.nextInt(); //최대공약수 입력 값
		
		int d = gcd(a, b);	
		
		System.out.println(d); //최대공약수 출력
		sc.close();
    
	}
 	 
	public static void is_prime(int num) { // 소수 판별 메소드
 
		
		if(num < 2) { // 0, 1 은 소수가 아님
			System.out.print("False" + " "); // + " " 한 이유는 예제 출력 두 값이 한 칸 띄어져 출력 돼서
			return;
		}
				
		if(num == 2) { // 2는 소수
			System.out.print("True" + " ");
			return;
		}
				 
		for(int i = 2; i <= Math.sqrt(num); i++) { // 제곱근 함수 Math.sqrt()
        			
			if(num % i == 0) { // 소수가 아닐경우
				System.out.print("False" + " ");
				return;
			}
		}		
		System.out.print("True" + " "); // 위 반복문에서 약수를 갖고 있지 않으면 소수
		return;
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
