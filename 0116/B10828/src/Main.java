import java.util.Scanner;

public class Main {

    public static int[] stack = new int[10000]; //스택 생성
    public static int topIndex = -1; //스택 제일 위에 있는 원소를 가르키는 변수 생성

    public static void push(int x) {
        topIndex++; //하나 쌓이게 변수를 늘려줌
        stack[topIndex] = x; //늘려진 스택에 원소 추가
    }

    public static int pop() {
        if (topIndex < 0) {
            return -1; //스택에 아무것도 없으면 -1 반환
        }
        else {
            int temp = stack[topIndex]; //제일 위의 원소를 temp에 저장
            topIndex--; //스택의 크기를 1 감소시켜줌
            return temp; //pop시킨 원소 반환
        }
    }

    public static int size() {
        if (topIndex < 0) {
            return -1; //스택에 아무것도 없으면 -1 반환
        }
        else {
            return topIndex + 1; //topIndex는 인덱스 값을 반환하므로 1을 더해 스택에 저장된 원소 개수 반환
        }
    }

    public static int empty() {
        if (topIndex < 0) {
            return 1; //스택이 비어있으면 1 반환
        }
        else {
            return 0; //스택에 원소가 있으면 0 반환
        }
    }

    public static int top() {
        if (topIndex < 0) {
            return -1; //스택이 비어있으면 -1 반환
        }
        else {
            return stack[topIndex]; //제일 위의 정수 반환
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //명령어 개수 입력 받기

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            switch (str) {
                case "push" -> push(sc.nextInt());
                case "pop" -> System.out.println(pop());
                case "size" -> System.out.println(size());
                case "empty" -> System.out.println(empty());
                case "top" -> System.out.println(top());
            }
        }
    }
}
