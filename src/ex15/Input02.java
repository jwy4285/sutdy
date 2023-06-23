package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input02 {
    public static void main(String[] args) {
        // 연결 (키보드에 연결) 한바이트만 읽음 Input printstacktrace 모든 오류 보여줌
        InputStreamReader ir = new InputStreamReader(System.in);

        // 읽기
        try {
            char[] ch = new char[5];
            ir.read(ch);

            for (char c : ch) {
                System.out.println(c);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
