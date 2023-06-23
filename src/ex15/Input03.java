package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {
    public static void main(String[] args) {
        // 연결 (키보드에 연결) 한바이트만 읽음 Input printstacktrace 모든 오류 보여줌
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 읽기
        try {
            String data = br.readLine();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
