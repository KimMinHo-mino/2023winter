package baekjoon;

import java.util.Scanner;

public class baekjoon10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int stack[] = new int[K];
        int topindex = 0;
        stack[topindex] = scanner.nextInt();

        for(int i = 0; i < K-1; i++){
            if(scanner.nextInt() != 0) {
                topindex++;
            } // 막혔는데 최대한 풀어가겠습니다.
        }
    }
}
ㄴㄴㄴㄴ