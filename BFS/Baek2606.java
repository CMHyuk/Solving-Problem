import java.io.*;
import java.util.*;

public class Baek2606 {
	
    static int[][] net;
    static boolean[] check;
    static int cnt;
	
	public static void main(String[] args) throws IOException {
			
       	    Scanner sc = new Scanner(System.in);
        
            int computer = sc.nextInt();
            int conn = sc.nextInt();
        
            net = new int[computer+1][computer+1];
            check = new boolean[computer+1];
            for(int i = 0; i<conn; i++) {        	
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
        	net[x][y] = 1;
        	net[y][x] = 1;
        }
                 
        bfs();
        
        System.out.println(cnt);
    	
    }
	
	public static int bfs() {
				
	   Queue<Integer> list = new LinkedList<>();
           list.add(1);
        
           cnt = 0;
           while(!list.isEmpty()) {
        	       	
               int virus = list.poll();
        	
               for(int i = 1; i<net.length; i++) {
        	   if(net[i][virus] == 1 && check[i] != true) {
        		cnt++;
        		list.add(i);
        		check[i] = true;  
        		check[virus] = true;       			
        		}
        	}
        }
        return cnt;
	}
}
