import java.io.*;
import java.util.*;

public class Baek2606 {
	
    static int[][] network;
    static int[] check;
    static int answer = 0;
    
	public static void main(String[] args) throws IOException {
		
        Scanner input = new Scanner(System.in);
        int computer = input.nextInt();
        int conn = input.nextInt();
        
        network = new int[computer+1][computer+1];
        check = new int[computer+1];
        
        for(int i = 0; i < conn; i++) {
        	
        	int x = input.nextInt();
        	int y = input.nextInt();
        	
        	network[x][y] = 1;
        	network[y][x] = 1;
        }
        
        bfs();
        
        System.out.println(answer-1); // 자기 자신(1)은 뺀다
        
        input.close();
    }
    
    public static void bfs() {
    	
    	Queue<Integer> queue = new LinkedList<>();
    	queue.add(1);
    	
    	while(!queue.isEmpty()) {
    		int node = queue.poll();
    		
    		for(int i = 1; i < network.length; i++) {
    			if(network[node][i] == 1 && check[i] == 0) {
    				answer++;
    				queue.add(i);
    				check[i] = 1;
    			}
    		}
    		
    	}
    }
}