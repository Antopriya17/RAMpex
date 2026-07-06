package Day5;


import java.util.Scanner;
public class automorphicno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int digits = 1;

        while (temp >= 10) {
            digits *= 10;
            temp /= 10;
        }

        if (square % (digits * 10) == num)
            System.out.println(num + " is an Automorphic Number.");
        else
            System.out.println(num + " is Not an Automorphic Number.");

        sc.close();
    }
}