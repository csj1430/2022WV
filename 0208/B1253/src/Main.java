import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //n개의 수 입력받기
        int[] arr = new int[n]; //n개의 수를 저장할 배열 생성
        int num = 0; //좋은 수가 몇개인지 저장하는 변수 생성, 초기화

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //배열에 저장
        }

        Arrays.sort(arr); //정렬 안해주면 틀림.

        for (int i = 0; i < n; i++) {
            int left = 0; //배열 제일 앞의 원소를 가리키는 인덱스
            int right = n - 1; //배열 맨 뒤의 원소를 가리키는 인덱스

            while (left < right) {
                if (arr[left] + arr[right] == arr[i]) { //left번째 right번째 합이 i번째와 같고
                    if (left != i && right != i) { //서로 다른 인덱스면
                        num++; //좋은 수의 개수를 늘려줌
                        break;
                    }
                    else if (left == i) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
                else if (arr[left] + arr[right] < arr[i]) { //left번째 right번째 합이 i보다 작으면
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        System.out.println(num);
    }
}
