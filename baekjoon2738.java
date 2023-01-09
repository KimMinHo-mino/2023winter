package baekjoon;

import java.util.Scanner;
public class baekjoon2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] result = new int[N][M];

        for (int i = 0; i < N ; i ++) {
            for (int j = 0; j < M ; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N ; i ++) {
            for (int j = 0; j < M ; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N ; i ++) {
            for (int j = 0; j < M ; j++) {
                result[i][j] = A[i][j] + B[i][j] ;
            }
        }

        for (int i = 0; i < N ; i ++) {
            System.out.println();
            for (int j = 0; j < M ; j++) {
                System.out.print(result[i][j] + " ")   ;
            }
        }


    }
}
