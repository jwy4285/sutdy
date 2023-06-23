package ex0000;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Grading {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하시오: ");
        grade = sc.nextInt();
        if (grade >= 90)
            System.out.println("학점A");
        else if (grade >= 80)
            System.out.println("학점 B");
        else if (grade >= 70)
            System.out.println("학점C");
        else if (grade >= 60)
            System.out.println("학점 D");
        else
            System.out.println("학점 F");
    }

}
