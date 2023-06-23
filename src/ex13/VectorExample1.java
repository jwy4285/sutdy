package ex13;

import java.util.*;

public class VectorExample1 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>(2);

        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        System.out.println("벡터의 크기: " + vec.size());
        Collections.sort(vec); // 벡터에 저장된 문자열들을 정렬한다.

        for (String s : vec)
            System.out.println(s + " ");
    }

}
