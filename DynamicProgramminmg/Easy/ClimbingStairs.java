package DynamicProgramminmg.Easy;

import java.util.Arrays;

public class ClimbingStairs {
    private static int recursion(int n){
        if(n == 1 || n == 0) return 1;

        return recursion(n - 1) + recursion(n - 2);
    }
    private static int memorization(int n){
        int[] dp = new int[n+ 1];
        Arrays.fill(dp, -1);
        return climbStairs(n,dp);
    }
    private static int climbStairs(int n , int[] dp){
        if(n == 0 || n == 1){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = climbStairs(n -1 , dp ) + climbStairs(n-2 , dp);
    }

    public static void main(String[] args) {
        System.out.println(recursion(4));
        System.out.println(memorization(4));
    }
}
