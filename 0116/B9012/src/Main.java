import java.util.Scanner;
public class baekjoon9012_debug {
        public static char[] stack = new char[50]; //스택 생성
        public static int topIndex = -1; //제일 위 원소의 인덱스 반환 변수


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = Integer.parseInt(sc.nextLine()); //괄호 문자열을 입력받을 횟수

            for (int i = 0; i < n; i++) {
                String str = sc.nextLine(); //괄호 문자열 입력받기
                boolean check = true;
                for (int j = 0; j < 50; j++){
                    stack[j] = '\0';
                }
                topIndex = -1;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '(') { //여는 괄호일 때
                        topIndex++;
                        stack[topIndex] = str.charAt(j); //스택에 저장
                    }
                    else if (str.charAt(j) == ')') { //닫는 괄호일 때
                        if (topIndex == -1) { //스택에 아무것도 없을 때
                            check = false; //false로 바꿔 문자열에 닫는 괄호가 많다는 것을 표현
                        }
                        else { //스택에 여는 괄호가 저장 돼 있을 때
                            stack[topIndex] = 0; //pop
                            topIndex--;
                        }
                    }
                }

                if (topIndex == -1 && check) {
                    System.out.println("YES"); //스택에 원소가 없을 때 yes
                }
                else {
                    System.out.println("NO"); //스택에 원소가 있으면 no
                }
            }
        }
}
