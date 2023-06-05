package ex04;

class Cal02 {
    void add(int n1, int n2) {
        System.out.println("더하기 : " + (n1 + n2));
        // 스택을 종료하고, 복귀주소를 확인하고 복귀한다
    }

    void minus(int n3, int n4) {

        System.out.println("마이너스 : " + (n3 - n4));

    }

    void multi(int n5, int n6) {
        System.out.println("곱하기 : " + (n5 * n6));
    }

    void divide(int n7, int n8) {
        System.out.println("나누기 : " + (n7 / n8));
    }

    // mius

    // multi

    // divide

}

public class Meth02 {
    public static void main(String[] args) {
        Cal02 c1 = new Cal02();
        c1.add(10, 5);
        c1.minus(9, 5);
        c1.multi(6, 3);
        c1.divide(5, 10);

    }

}
