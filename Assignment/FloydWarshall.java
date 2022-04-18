import java.util.Scanner;

public class hw1_201820294 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        	
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			
			int m = sc.nextInt(); //행렬 크기 수
			int[][] arr = new int[m][m]; //이차원배열로 초기화 ex) m = 4면 4*4크기 행렬
			
			for(int j = 0; j<m; j++) {
				for(int k = 0; k<m; k++) {
					arr[j][k] = sc.nextInt(); // 1행 부터 각 자리에 맞게 입력 예제 대입			
				}
			}
			
			for(int a = 0; a<m; a++) {
				for(int b = 0; b<m; b++) {
					for(int c = 0; c<m; c++) {											
						if(arr[b][a] == 1 && arr[a][c] == 1) { //ex) (1,2) (2,3) 둘다 1이면 
							arr[b][c] = 1;					   //(1,3)도 1
						}						
				    }					
		        }
				
			}
			
			for(int q = 0; q<m; q++) {
				for(int r = 0; r<m; r++) {
					System.out.print(arr[q][r] + " "); //arr[0][0], arr[0][1] ... 차례로 출력
				}
				System.out.println(); //한 행 입력 받은 후 줄바꿈 후 반복
			}
									
		}
		sc.close();	   
	} 	 	 
 
}
