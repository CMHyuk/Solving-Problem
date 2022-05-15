import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       
    	Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt(); //던전 크기
		 int m = sc.nextInt();
		 
		 int[][] maze = new int[n+1][m+1];
		 
		 int A = sc.nextInt(); //아리 위치
		 int S = sc.nextInt();
		 
		 int monster = sc.nextInt(); //몬스터 위치
		 int location = sc.nextInt();
		 
		 maze[monster][location] = 1;
		 
		 Queue<String> q = new LinkedList<>(); 
		 		 
		 //왼쪽
		 if(S == 0) {
			 int height = 1;
			 if(A == 1) {
				 height++;
			 } else {
				 while(A != 1) {
					 if(maze[height][A] == 1) {
						 q.add("NO...");
						 break;
					 } else {
						 A--;
					 }
					 if(A == 1) {
						 height++;				
					 }
				 } 
			 }
			 
			 
			 a : while(A != m || height != n) {
				 if(A == 1) {
					//왼쪽 -> 오른쪽				 
					 while(A != m) {
						 if(maze[height][A] == 1) {
							 q.add("NO...");
							 break a;
						 } else {
							 A++;
						 }
						 if(A == m) {							 
							 if(maze[height][A] == 1) {
								 q.add("NO...");
								 break a;
							 }
							 if(height < n) {
								 height++;
							 }
						 } 
					 }
						 
					 } else {
						//오른쪽 -> 왼쪽
						 while(A != 1) {
							 if(maze[height][A] == 1) {
								 q.add("NO...");
								 break a;
							 } else {
								 A--;
							 }
							 if(A == 1) {
								 height++;
								 if(maze[height][A] == 1) {
									 q.add("NO...");
									 break a;
								 }
							 }
						 }
						  
					 }
				 
			}
			 
			 if(q.isEmpty()) {
				 if(A == m && height == n) {
					 if(monster == n && location == m) {
						 System.out.println("NO...");
					 } else {
						 System.out.println("YES!");
					 }
				 }
			 } else {
				 System.out.println(q.peek());
			 } 
			 
		 } else {
			 int height = 1;
			  
			 if(A == m) {
				 height++;
			 }
				 while(A != m) {
					 if(maze[height][A] == 1) {
						 q.add("NO...");
						 break;
					 } else {
						 A++;
					 }
					 if(A == m) {
						 height++;
					 }
				 } 
						 
			 
			 a : while(A != m || height != n) {
				 if(A == 1) {
					//왼쪽 -> 오른쪽
					 while(A != m) {
						 if(maze[height][A] == 1) {
							 q.add("NO...");
							 break a;
						 } else {
							 A++;
						 }
						 if(A == m) {							 
							 if(maze[height][A] == 1) {
								 q.add("NO...");
								 break a;
							 }
							 if(height < n) {
								 height++;
							 }
							 
						 } 
					 }
						 
					 } else {
						//오른쪽 -> 왼쪽
						 while(A != 1) {
							 if(maze[height][A] == 1) {
								 q.add("NO...");
								 break a;
							 } else {
								 A--;
							 }
							 if(A == 1) {								 
								 if(maze[height][A] == 1) {
									 q.add("NO...");
									 break a;
								 }
								 if(height < n) {
									 height++;
								 }
							 }
						 }
						  
					 }
			}
			 
			 if(q.isEmpty()) {
				 if(A == m && height == n) {
					 if(monster == n && location == m) {
						 System.out.println("NO...");
					 } else {
						 System.out.println("YES!");
					 }
				 }
			 } else {
				 System.out.println(q.peek());
			 }
			 
			  
		 }
		 sc.close();
    }
  
}
