package Day2;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int[] freq = new int[10];

        while (num > 0) {
            int digit = (int)(num % 10);
            freq[digit]++;
            num = num / 10;
        }

        System.out.println("Frequency of each digit:");
        for (int i = 0; i <= 9; i++) {
            if (freq[i] != 0) {
                System.out.println(i + " = " + freq[i]);
            }
        }

        sc.close();
    }
}