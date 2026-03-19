package Graph.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static int findRotten(int[][] grid){
        int time = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == 2){

                    queue.offer(new int[]{i , j});
                }
            }
        }
        int[] dx = {-1,+1,0,0};
        int[] dy = {0,0,-1,+1};

        while(!queue.isEmpty()){
            int[] removed = queue.poll();
            int x = removed[0];
            int y = removed[1];

            for (int i = 0; i < 4; i++) {
                int gx = x + dx[i];
                int gy = y + dy[i];

                if(valid(grid,gx,gy,x,y) && grid[gx][gy] == 1){
                    if(!visited[gx][gy]){
                        queue.offer(new int[]{gx ,gy});
                        visited[gx][gy] = true;
                    }
                }
            }
            time++;

        }

        return time;
    }

    private static boolean valid(int[][] grid , int x , int y , int n , int m) {
        return (x >= 0 && y >= 0 && x < n && y < m);
    }

    static int rottenOranges(int[][] grid) {
        int time = 0;
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int[] dx = {-1, +1, 0, 0};
        int[] dy = {0, 0, -1, +1};

        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] rotten = queue.poll();
                int x = rotten[0];
                int y = rotten[1];

                for (int j = 0; j < 4; j++) {
                    int gx = x + dx[j];
                    int gy = y + dy[j];

                    if (valid(grid, gx, gy, n, m) && grid[gx][gy] == 1) {
                        grid[gx][gy] = 2;
                        queue.offer(new int[]{gx, gy});
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }

    public static void main(String[] args) {
        int[][] grid ={
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };
        System.out.println(rottenOranges(grid));

    }
}
