package baekjoon;

import java.util.Scanner;
public class baekjoon3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num[] = new int[42];
        int input[] = new int[10];
        int remainder[] = new int[10];
        int result = 0;


        for (int i = 0; i < 42; i++) {
            num[i] = 0;
        }

        for (int i = 0; i < 10; i++) {
            input[i] = scanner.nextInt();
            remainder[i] = input[i] % 42;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 42; j++) {
                if (remainder[i] == j) {
                    num[j] = 1;
                }
            }
        }

        for (int i = 0; i < 42; i++){
            if (num[i] == 1) {
                result++;
            }

        }

        System.out.println(result);



    }

}
