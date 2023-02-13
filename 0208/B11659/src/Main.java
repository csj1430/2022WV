import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n + 1]; //부분합 저장 배열.
        arr[0] = 0; //index 0은 0으로 초기화 해줌.

        for (int i = 1; i < n + 1; i++) { //arr[1]에서부터 차곡차곡 저장해줌
            arr[i] = arr[i-1] + sc.nextInt(); //부분합에 입력받은 수를 더해주며 배열을 채워감
        }

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            System.out.println(arr[j] - arr[i-1]); //부분합을 빼줘서 시간 단축!
        }
    }
}