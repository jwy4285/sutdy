package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class Output01 {
    public static void main(String[] args) {
        OutputStream os = System.out;
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);

        try {
            bw.write("안녕"); // 다른 컴퓨터로연결할때 \n 버퍼 통신의 끝
            bw.flush();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}
