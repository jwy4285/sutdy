package ex04;

class A {
    private int a; // 전용
    int b; // 디폴트
    public int c; // 공용
}

public class Test {
    public static void main(String[] args) {
        A obj = new A(); // 객체 생성

        // obj.a = 10; 전용 멤버는 다른 클래스에서 접근 안됨
        obj.b = 20;

        obj.c = 30;
    }

}
