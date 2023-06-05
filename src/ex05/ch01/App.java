package ex05.ch01;

public class App {

    static void attack(Zealot u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    static void attack(Dragoon u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Zealot u1, Zealot u2) {
        u1.hp = u1.hp - u2.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Dragoon u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(DarkTempler u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(DarkTempler u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Zealot u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Dragoon u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1", 100, 10);
        Zealot z2 = new Zealot("질럿2", 100, 10);
        Dragoon d1 = new Dragoon("드라군", 100, 5);
        Dragoon d2 = new Dragoon("드라군", 100, 5);
        DarkTempler DT1 = new DarkTempler("다크1", 100, 50);
        // 질럿 > 드라군 공격
        attack(z1, d1);
        attack(z1, d1);

        // 드라군 > 질럿 공격
        attack(d1, z1);

        // 질럿 > 질럿 공격

        attack(z1, z2);
        // 드라군 > 드라군 공격
        attack(d1, d2);

        // 다크 >드라군 공격
        attack(DT1, d2);
        // 다크 > 질럿 공격
        attack(DT1, z2);
        // 질럿 > 다크 공격
        attack(z2, DT1);
        // 드라군 > 다크
        attack(d2, DT1);

        //오버로딩 체험하기
        System.out.println();
        System.out.println(1);
        System.out.println(1.1);
        System.out.println('가');
        System.out.println("문자열");
        System.out.println(true);

    }

}
