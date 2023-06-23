package ex13;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {

        Vector vc = new Vector<>(); // 벡터 객체를 생성할때, 크기를 안 주어도 된다. 크기를 줄 수도 있다.

        vc.add("Hello World"); // 어떤 타입의 객체도 추가가 가능하다.
        vc.add(new Integer(10));
        vc.add(20);

        System.out.println("vector size: " + vc.size());

        for (int i = 0; i < vc.size(); i++) {
            System.out.println("vector element" + i + ": " + vc.get(i));
        }
        String s = (String) vc.get(0); // get()은 Object 타입으로 반환하므로 형변환하여서 사용한다.

    }

}
