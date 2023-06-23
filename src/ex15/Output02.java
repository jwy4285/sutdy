package ex15;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Output02 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("output.txt", false);
            OutputStreamWriter ow = new OutputStreamWriter(os, "utf-8");
            BufferedWriter bw = new BufferedWriter(ow);
            bw.write("안녕하세요 가나다라마바사");
            bw.write("안녕 아자타차파하");
            bw.write("안녕 아아아아아아");
            bw.write("안녕 가가가가가가");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}