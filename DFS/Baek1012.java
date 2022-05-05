import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    static int T;
    static int N;
    static int M;
    static int K;

    static int[][] arr;
    static boolean[][] visit;
    static int cnt;
    static int[] ax = {-1, 1, 0, 0};
    static int[] ay = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for(int i = 0; i<T; i++) {

            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            visit = new boolean[N][M];

            for(int j = 0; j<K; j++) {

                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                arr[x][y] = 1;

            }

            cnt = 0;

            for(int k = 0; k<N; k++) {
                for(int r = 0; r<M; r++) {
                    if(arr[k][r] == 1 && !visit[k][r]) {
                        worms(k, r);
                        cnt++;
                    }
                }
            }
            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
    }

    static int worms(int a, int b) {

        visit[a][b] = true;

        for(int i = 0; i<4; i++) {

            int x = a + ax[i];
            int y = b + ay[i];

            if(x >= 0 && y >= 0 && x < N && y < M) {
                if(arr[x][y] == 1 && !visit[x][y]) {
                    worms(x, y);
                }
            }
        }
        return cnt;
    }
}
