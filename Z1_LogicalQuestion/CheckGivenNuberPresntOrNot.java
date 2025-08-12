import java.util.Scanner;

public class Main {
    static int[] frequency(int[] arr) {
        int[] freq = new int[100001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]] = freq[arr[i]] + 1;
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 6};
        int[] ferq = frequency(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of queries");
        int q = sc.nextInt();
        while (q > 0) {
            int c = sc.nextInt();
            if (ferq[c] > 0) {
                System.out.println("Yes");
            } else System.out.println("No");
            q--;
        }

    }
}