package DynamicProgramminmg.Easy;

import java.util.Arrays;

public class nthFibbonaci {
    private static int recursion(int n ){
        if(n <= 1){
            return n;
        }

        return recursion(n-1) + recursion(n-2);
    }
    private static long helper(int n , long[] dp){
        if(n <= 1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = helper(n - 1 , dp) + helper(n-2 , dp);
    }
    private static long memorization(int n){
        long[] dp = new long[n + 1];
        Arrays.fill(dp,-1);
        return helper(n , dp);
    }

    public static void main(String[] args) {
//        System.out.println(recursion(50));
        System.out.println(memorization(50));
    }
}
