import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int st = 0;

        for (int i = 0; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                st = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(st);
    }
}