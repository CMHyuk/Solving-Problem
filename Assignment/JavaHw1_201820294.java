import java.util.Random;
import java.util.Scanner;

public class JavaHw1_201820294 {

	//reverse()함수에서 사용하기 위해 static으로 변수 설정
	static int[] arr;
	static Random rnd;

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		int size = sc.nextInt(); //배열 크기
			
		arr = new int[size]; //배열 생성
		rnd = new Random();
			
		reverse(); //함수 호출
		sc.close();
    }
		
	static void reverse() {
			
		for(int i = 0; i<arr.length; i++) {	
			arr[i] = rnd.nextInt()%10000; //-10000~10000 사이 정수 랜덤 입력
			
			System.out.print(arr[i] + " : "); //값 출력
	
			String str = Integer.toString(arr[i]); //거꾸로 출력하기 위해 String형으로 치환
			
			for(int j = str.length()-1; j>=0; j--) { //charAt(); 함수를 이용해 뒤부터 for문을 돌리며 거꾸로 출력					
				System.out.print(str.charAt(j) + " ");
			}			
			System.out.println(); //하나 입력 끝날 때마다 줄바꿈
		}
	}
}
