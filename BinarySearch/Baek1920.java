import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

 public class Baek1920 {
	  		
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;		
		
		int n = Integer.parseInt(bf.readLine());
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i<n; i++) {
			int key = Integer.parseInt(st.nextToken());
			map.put(key, 1);
		}
		
		int m = Integer.parseInt(bf.readLine());
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i<m; i++) {
			int key = Integer.parseInt(st.nextToken());
			if(map.containsKey(key)) {
				bw.write(1 + "\n");
			} else {
				bw.write(0 + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	
	}	
	
}