import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); //테스트케이스의 수 입력받기

        for (int i = 0; i < num; i++) {
            int n = sc.nextInt(); //문서의 개수 입력 받기
            int m = sc.nextInt(); //인쇄된 순서가 궁금한 문서의 현재 위치 입력 받기

            if (n == 1) { //문서 개수가 1이라면 1 프린트 해줌
                System.out.println(1);
                continue;
            }

            int[] queue = new int[n]; //문서 개수 크기의 큐 배열 생성
            int front = 0;
            int tail = 0;

            for (int j = 0; j < n; j++) {
                tail++;
                queue[tail] = sc.nextInt();
            }

            int max = queue[front]; //중요도 최댓값 저장하는 변수 생성. front에 있는 값으로 초기화
            int maxIndex = -1;

            for (int j = 0; j < n; j++) {
                if (queue[j] > max) {
                    max = queue[j]; //max에 제일 큰 중요도 저장
                    maxIndex = j; //제일 큰 중요도의 인덱스 저장
                }
            }

            if (m == maxIndex) { //m과 maxIndex의 값이 같으면 1을 프린트
                System.out.println(1);
                continue;
            }
            else {
                //재귀를 사용해야할 것 같은 느낌적인 느낌이 들어부러.......ㅠㅠ
                //근데 중요도가 같은 문서가 있으면 뭐가 몇번짼지 어떻게 알지..? 메모리 주소..?
            }
        }
    }
}
