package ex04;

class Player {
    String name;
    int thirty; // 0~100=범주가 있는 데이터 (클 수록 목말라짐)

    public void drink() {
        thirty = thirty - 30;
    }

    public Player(String name, int thirty) {
        this.name = name;
        this.thirty = thirty;
    }

}

public class OOP01 {
    public static void main(String[] args) {
        Player p1 = new Player("홍길동", 100); // 변수를 선언했는데 값이 없는것 null
        Player p2 = new Player("임꺽정", 100);

        System.out.println(p1.name);
        System.out.println(p2.name);

        p2.drink();

        System.out.println(p1.thirty);
        System.out.println(p2.thirty);

    }

}
