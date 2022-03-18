import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class MovieSchedule {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();		
		
		int[][] movie = new int[N][4];
						
		for(int i = 0; i < N; i++) {
			movie[i][0] = in.nextInt();	 
			movie[i][1] = in.nextInt();	 
			movie[i][2] = in.nextInt();
			movie[i][3] = 0;
		}
				
		Arrays.sort(movie, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[3] == o2[3]) {
					return o2[2] - o1[2];
				}
				
				return o2[3] - o1[3];
			}
 
		});
		
		int max = 0;
		int after = 0;
		int after2 = 0;
		int left = movie[0][0];
		int right = movie[0][1];
		int left1 = 0;
		int right1 = 0;
		int left2 = 0;
		int right2 = 0;
				
		for(int i = 0; i < N; i++) { 
			if(movie[i][0] <= right && movie[i][1] >= left) { //겹치는 구간			
				if(movie[i][2] > max) { //최대 구하기
					max = movie[i][2];
					left = movie[i][0];
					right = movie[i][1];
					left1 = movie[i][0];
					right1 = movie[i][1];
					left2 = movie[i][0];
					right2 = movie[i][1];
				} else {	
					if(movie[i][0] <= right2 && movie[i][1] >= left2) { //최대구간과 겹치는 구간에서 최대를 제외한 최대
						after = movie[i][2];
						left2 = movie[i][0];
						right2 = movie[i][1];	
					} else {
						after += movie[i][2]; //최대구간 안에서 겹치지 않는 구간 ex)두번째 테스트 케이스 190을 제외한 100+100
					}				
				}
			} else { //겹치지 않는 구간		
				if(movie[i][0] <= right1 && movie[i][1] >= left1) { //최대구간과 겹치는 구간 제외 후 겹치는 구간에서 최대
					if(after2 < movie[i][2]) {
						after2 = movie[i][2];
						left = movie[i][0];
						right = movie[i][1];
						left1 = movie[i][0];
						right1 = movie[i][1];
					}					
				} else {					
					after2 += movie[i][2]; //독립일 경우
					left1 = movie[i][0];
					right1 = movie[i][1];					
				}
											
			}
		}
		
		if(max + after2 > after) {
			System.out.println(max + after2);
		} else {
			System.out.println(after);
		}
	
		in.close();
	}
 
}