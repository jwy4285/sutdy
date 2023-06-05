package ex04;

class Cal01 {
    void add() {
        System.out.println("add 호출됨");
    }

    void minus() {
        System.out.println("add 호출됨");
    }

    void multi() {
        System.out.println("add 호출됨");
    }

    void divide() {
        System.out.println("add 호출됨");
    }

    // mius

    // multi

    // divide

}

public class Meth01 {
    public static void main(String[] args) {
        Cal01 c2 = new Cal01();
        c2.add();
        c2.minus();
        c2.multi();
        c2.divide();

    }

}
