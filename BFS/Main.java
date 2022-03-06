import java.util.*;

public class B {
   
	static int v;
	static int n;
	static int m;
	
	static int[][] arr;
	static boolean[] check;
	
	static StringBuilder d;
	static StringBuilder b;

	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
       
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        
        check = new boolean[n+1];
        arr = new int[n+1][n+1];
        
        for(int i = 0; i<m; i++) {
        	
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
        	arr[x][y] = 1;
        	arr[y][x] = 1;
        	
        }
       
        d = new StringBuilder();
        b = new StringBuilder();
       
        System.out.println(dfs(v) + "\n" + bfs());
        
        sc.close();
    }
	
	public static String dfs(int v) {
			
		check[v] = true;
		d.append(v + " ");
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i][v] == 1 && check[i] == false) {
				dfs(i);
			}
		}
		
		return d.toString();
	}
		
	public static String bfs() {
		
		check = new boolean[n+1];
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		b.append(v + " ");
		
		while(!q.isEmpty()) {
			
			int a = q.poll();
			check[a] = true;
			
			for(int i = 1; i<arr.length; i++) {
				if(arr[i][a] == 1 && check[i] == false) {
					b.append(i + " ");
					q.add(i);
					check[i] = true;					
				}
			}
		}		
		return b.toString();
	}
}