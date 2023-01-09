package baekjoon;

import javax.sound.midi.Sequence;
import java.security.PublicKey;
import java.util.Scanner;

public class baekjoon10871_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int sequence[] = new int[N];

        for (int i = 0; i < N ; i++) {
            sequence[i] = scanner.nextInt();
        }

        for(int j = 0; j < N; j++){
            if(sequence[j] < X)
                System.out.print(sequence[j] + " ");
        }

    }
}
