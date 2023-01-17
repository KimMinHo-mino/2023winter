package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(scanner.nextLine());
        int num = 0;
        int result = 0;

        for(int i = 0; i < K; i++){
            int input = scanner.nextInt();
            if(input == 0){
                stack.pop();
            }
            else{
                stack.push(input);
            }
        }

        while (stack.empty() == false){
            num = stack.peek();
            stack.pop();
            result += num;
        }
        System.out.println(result);
    }
}