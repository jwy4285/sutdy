package ex05.ch03;

abstract class Animal { // 추상클래스
    void speak() {

    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }

}

class Cat extends Animal {
    void speak() {
        System.out.println("야옹");
    }

}

public class Exten03 {

    static void start(Animal u) {
        u.speak();
    }

    public static void main(String[] args) {
        Animal d = new Dog();
        start(d);

        Animal c = new Cat();
        start(c);

    }

}
