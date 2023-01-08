import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        float[] arr = new float[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        float max = arr[0];

        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        float sum = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] != max) {
                arr[i] = arr[i] / max * 100;
            }
            sum = sum + arr[i];
        }

        System.out.println(sum / N);

    }
}