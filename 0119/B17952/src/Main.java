import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scoreStack = new int[1000000]; //점수 스택 생성
        int[] minuteStack = new int[1000000]; //분 스택 생성
        int scoreTopIndex = -1; //점수 스택의 인덱스 생성, 초기화
        int minuteTopIndex = -1; //분 스택의 인덱스 생성, 초기화

        int n = sc.nextInt(); //이번 학기가 몇 분인지 입력받기

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); //수 입력받기

            if (x == 1) { //1을 입력 받았을 때
                int score = sc.nextInt(); //점수 입력받기
                int minute = sc.nextInt(); //분 입력받기

                scoreTopIndex++;
                scoreStack[scoreTopIndex] = score; //점수 스택에 추가

                minuteTopIndex++;
                minuteStack[minuteTopIndex] = minute - 1; //분 스택에 추가. 1분이 지났기 때문에 1빼서 저장
            }
            else if (x == 0) { //0을 입력 받았을 때
                if (minuteStack[minuteTopIndex] == 0) { //minuteTopIndex번째 원소가 0이면
                    minuteTopIndex--; //인덱스에서 1을 빼줘서 전에 하던 과제를 이어서 할 수 있게 해줌

                    minuteStack[minuteTopIndex]--; //minuteTopIndex번째 원소에서 1분을 빼줌
                }
                else { //minuteTopIndex번째 원소가 0이 아니라면 (아직 과제를 덜했다면)
                    minuteStack[minuteTopIndex]--; //minuteTopIndex번째 원소에서 1분을 빼줌
                }
            }
        }

        int sum = 0; //점수 더해줄 sum 생성
        for (int i = 0; i < n; i++) { //n번 반복
            if (minuteStack[i] == 0) { //분 스택에 저장된 수가 0이면 과제를 다 끝냈다는 의미
                sum += scoreStack[i]; //점수 스택에 저장된 수를 sum에 더해줌
            }
        }

        System.out.println(sum); //점수가 더해진 sum을 출력시킴
    }
}
