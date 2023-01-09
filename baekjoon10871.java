package baekjoon;
import java.util.Scanner;

public class baekjoon10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수열의 항의 개수와 정수 하나를 입력하세요: ");
        String input = scanner.nextLine();

        int blank1 = input.indexOf(' ');

        String input1 = input.substring(0,blank1); // 공백문자 전까지 잘라서 수열의 항의 개수 반환하기
        String input2 = input.substring(blank1 + 1); // 공백문자 이후 잘라서 한계 반환하기

        int sequence = Integer.parseInt(input1);
        int limit = Integer.parseInt((input2));

        int[] blank_array = new int[sequence - 1]; // 공백문자의 개수는 수열의 개수보다 하나 적으므로 sequence -1;
        int[] sequence_num = new int[sequence];
        System.out.print("수열을 입력하세요: ");
        String input_sequence = scanner.nextLine();

        // 수열 입력 받고 indexOf(가장 처음나오는 인덱스 반환) 이후 indexOf에 반환한 위치 더해서 쓰면 된다.


        if (sequence != 1) {
            int blank2 = input_sequence.indexOf(' ');
            blank_array[0] = blank2;
            sequence_num[0] = Integer.parseInt(input_sequence.substring(0, blank2)); // 첫번째 수열의 값은 배열에 저장함.

            for (int i = 1; i < sequence - 1; i++) {
                blank_array[i] = input_sequence.indexOf(' ', blank2 + 1); // 이전의 blank2 다음부터 시작해서 그 다음위치 공백문자 찾기
                blank2 =  input_sequence.indexOf(' ', blank2 + 1);
            }

            for (int j = 0; j < sequence - 2; j++){
                sequence_num[j+1] = Integer.parseInt(input_sequence.substring(blank_array[j]+1 , blank_array[j+1])); // for문 시작할 때 1부터 초기화 한다. 시작값은 이전 공백문자의 위치부터 이후 공백문자까지
            }

            sequence_num[sequence-1] = Integer.parseInt(input_sequence.substring((blank_array[sequence-2] + 1)));

            for (int k = 0; k < sequence; k++){
                if(sequence_num[k] < limit)
                    System.out.print(sequence_num[k]);
            }

        }
        else
        {
            sequence_num[0] = Integer.parseInt(input_sequence); // 수열의 개수가 하나이면 입력받은거 그대로 넣자.
        }












    }
}