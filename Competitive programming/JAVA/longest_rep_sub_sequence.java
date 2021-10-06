import java.io.*;
import java.util.*;

class Main {
	static int LongestRepSubSeq(String str) {
		int n = str.length();
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (str.charAt(i - 1) == str.charAt(j - 1) && i != j)
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
			}
		}
		return dp[n][n];
	}

	public static void main(String[] args) {
		String str = "HHHHHHaaaacccckTTToberFFFeest";
		System.out.println("The length of the largest subsequence that repeats itself is : " + LongestRepSubSeq(str));
	}
}
