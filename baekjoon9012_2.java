package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon9012_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());
        String input[] = new String[T];


        for(int i = 0; i < T; i++){
            input[i] = sc.nextLine(); // 반복문을 통해서 배열에 문자열 입력 받기
        }

        for(int i = 0; i < T; i++) {
            String input_string = input[i];
            int length = input_string.length();
            Stack<String> stack = new Stack<>();
            boolean check = true;

            for(int k = 0; k < length; k++) { // 문자열의 크기만큼 반복하기
                String ch = input_string.substring(k, k + 1);

                if(ch.equals("(")){
                    stack.push("(");
                }
                else {
                    if(stack.empty()){
                        check = false;
                    }
                    else{
                        stack.pop();
                    }
                }
            }

            if(stack.empty() && check == true){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
