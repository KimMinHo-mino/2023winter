package baekjoon;

import java.util.Scanner;

public class baekjoon9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine()); // 정수 입력 데이터 입력 받기
        String input[] = new String[T]; // 입력 데이터의 수의 크기를 가지는 배열 만들기
        int stack[] = new int[51]; // 문자열의 최대 크기는 50 인덱스 오류 생기지 말라고 하나 추가해줌.


        for(int i = 0; i < T; i++){
            input[i] = scanner.nextLine(); // 반복문을 통해서 배열에 문자열 입력 받기
        }

        for(int i = 0; i < T; i++) {
            String input_string = input[i]; // 배열의 인덱스에 저장된 문자열 변수로 만들어주기.
            int length = input_string.length(); // 문자열의 크기를 반환한다.
            int cnt = 0;
            int check = 0;

            for(int j = 0; j < 51; j++){
                stack[i] = 0; // 문자열 스택 초기화.
            }

            for(int k = 0; k < length; k++) { // 문자열의 크기만큼 반복하기
                String ch = input_string.substring(k, k + 1); // 입력받은 문자열 하나씩 슬라이싱

                if (ch.equals("(")) {
                    if (cnt == 0) {
                        stack[0] = 1;
                    }
                    else {
                        for(int j = 0; j < length; j++) { // 반복문 사용해서 모든 인덱스를 한칸씩 밀어낸다.
                            stack[length - j] = stack[length - j - 1]; // 맨 뒤 값부터 저장해야 모두 옮겨진다.
                        }
                        stack[0] = 1;
                    }
                }
                if (ch.equals(")")) {
                    if(stack[0] == 1) {
                        for (int l = 0; l < length; l++) {
                            stack[l] = stack[l+1]; // 뒤에서부터 앞으로 당겨오기
                        }
                    }
                }
            }

            for(int j = 0; j <51; j++){
                if(stack[i] != 0){
                    cnt++;
                }
            }

            if(cnt == 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
                System.out.println(cnt);
            }


        }
    }
}

