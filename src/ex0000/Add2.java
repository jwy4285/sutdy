package ex0000;

import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.println("첫 번째 숫자를 입력하시오: ");
        x = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하시오: ");
        y = sc.nextInt();

        sum = x + y;
        System.out.println(sum);
    }

}
