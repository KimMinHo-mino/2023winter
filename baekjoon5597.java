package baekjoon;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class baekjoon5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A[] = new int[30];
        int B[] = new int[28];

        for (int i = 0; i < 30; i++) {
            A[i] = 0;
        }
        for (int i = 0; i < 28; i++) {
            B[i] = scanner.nextInt();
        }

        for (int j = 1; j < 31; j++) { // 출석번호 생성
            for (int k = 0; k < 28; k++) {
                if (B[k] == j) // j의 숫자가 있나 없나 체크하는 것
                    A[j - 1] = 1; // j라는 숫자가 있다는 뜻 (한자리 씩 앞으로 땡겨서)
            }
        }
        for (int i = 0; i < 30; i++){
            if(A[i] == 0){
                System.out.println(i+1);
            }
        }

    }

}
