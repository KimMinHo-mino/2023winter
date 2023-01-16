package baekjoon;

import java.util.Scanner;
// stack[0]에만 입력받는다 즉 stack[0]이 항상 topindex가 된다.
// 출력도 항상 stack[0]에서만 이루어진다.
// pop으로 입력 받을때 하나씩 옆으로 밀어줘서 새로 입력받은 값이 항상 stack[0]으로 가게 한다.

/* push X : 첫번째 입력 -> stack[0]에 입력 이후는 0부터 반복문써서 stack[i+1]를 stack[i]로 바꿔주기. stack[i+1]이 인덱스 한계를 넘지 않도록 해줘야 함 cnt++
 * pop : stack[cnt-1]에 있는 원소 출력하고 값을 0으로 다시 바꿔주면 됨. cnt--
 * size : cnt를 출력하면 된다.
 * empty : cnt = 0이면 empty or 입력을 stack[0]에만 받고 이후 인덱스를 뒤로 미뤄주는 과정으로 구현하므로 stack[0]이 0이면 empty이다.
 * top : cnt로 top 구현 stack[cnt-1]이 항상 top이 된다.
 */
public class baekjoon10828 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine()); // 입력받은 명령의 개수 = 스택의 사이즈의 최댓값 (모두 push)

        int stack[] = new int[num + 1]; // 배열로 스택을 만든다. push에서 index 하나씩 밀어낼 때 오류 안나게 하나 더 크게 만듦.

        int cnt = 0; // 스택에 정수가 몇개 있는지 저장하는 변수 count 초기화

        String cmd_array[] = new String[num]; // 명령을 담을 스택 만든다.


        for(int i = 0; i < num; i++) { // 명령을 배열에 입력 받는다.
            cmd_array[i] = sc.nextLine(); // 개행을 기준으로 문자열로 입력 받기.
        }

        for(int i = 0; i < num; i++) { // 입력받은 명령을 인덱스별로 확인하기 위해서 반복문

            if (cmd_array[i].substring(0, 3).equals("pus")) { // 명령이 push인 경우(슬라이싱해서 확인)

                int X = Integer.parseInt(cmd_array[i].substring(5)); // 입력 받을 값 X에 저장

                if (cnt == 0) { // cnt가 0임, 즉 이전에 스택에 비어있으면 topindex에 값 저장
                    stack[0] = X; // topindex에 입력받는다.
                    cnt++; // 원소를 추가했으므로 이므로 cnt에 +1 해주기
                }

                else {
                    for(int j = 0; j < num; j++) { // 반복문 사용해서 모든 인덱스를 한칸씩 밀어낸다.
                        stack[num - j] = stack[num - j - 1]; // 맨 뒤 값부터 저장해야 모두 옮겨진다.
                    }
                    stack[0] = X; // 입력 받은 값은 항상 stack[0]_topindex으로 들어간다.
                    cnt++; // 원소를 추가했으므로 cnt에 +1 해주기
                }

            }

            else if (cmd_array[i].equals("pop")) { // 명령이 pop인 경우(push 빼면 슬라이싱 필요 없음)
                if (cnt == 0) { // 이전에 비어있었다는 뜻이므로
                    System.out.println(-1); // -1 출력한다.
                }

                else {
                    System.out.println(stack[0]); // topindex의 원소를 출력한다.
                    for(int j = 0; j < num; j++) {
                        stack[j] = stack[j + 1]; // 앞으로 하나씩 밀려오기
                    }
                    cnt--; //원소 하나씩 앞으로 밀려오면서 stack[0]이 사라졌으므로 cnt--
                }
            }

            else if (cmd_array[i].equals("size")) {
                System.out.println(cnt); // 스택에 들어있는 정수의 개수는 cnt 출력하면 됨
            }

            else if (cmd_array[i].equals("empty")) {
                if (cnt == 0) { // 정수의 개수가 0개 이면
                    System.out.println(1); // 1을 출력
                }
                else {
                    System.out.println(0); // 0을 출력
                }
            }

            else if (cmd_array[i].equals("top")) {
                if (cnt == 0) { // 정수의 개수가 0개이면
                    System.out.println(-1); // -1을 출력
                }
                else {
                    System.out.println(stack[0]); // 가장 위의 있는 값인 stack[0] 출력.
                }
            }
        }
    }
}
