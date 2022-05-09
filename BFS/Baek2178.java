package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] _x = {-1, 1, 0, 0};
    static int[] _y = {0, 0, -1, 1};

    static int n;
    static int m;
    static int[][] maze;
    static boolean[][] check;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        maze = new int[n][m];
        check = new boolean[n][m];

        for(int i = 0; i<n; i++) {
            String s = sc.next();
            for(int j = 0; j<m; j++) {
                maze[i][j] = (int)s.charAt(j) - 48;
            }
        }

        bfs(0, 0);
        System.out.println(maze[n-1][m-1]);
    }

    static void bfs(int a, int b) {

        Queue<int[]> queue = new LinkedList<>();
        check[a][b] = true;

        for(int i = 0; i<4; i++) {
            int x = a + _x[i];
            int y = b + _y[i];

            if(x >= 0 && y >= 0 && x < n && y < m) {
                if(maze[x][y] == 1 && !check[x][y]) {
                    maze[x][y] = maze[a][b] + 1;
                    check[x][y] = true;
                    queue.add(new int[]{x, y});
                }
            }
        }

    }
}
