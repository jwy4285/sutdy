package ex04; //패키지

public class Television {
    int channel; // 채널 번호
    int volume; // 볼륨
    boolean onOff; // 전원상태

    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.onOff = true;

        Television yourTv = new Television();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        System.out.println("나의 텔레비전의 채널은" + myTv.channel + "이고 볼륨은 " + myTv.volume + " 입니다. ");
        System.out.println("너의 텔레비전의 채널은" + yourTv.channel + "이고 볼륨은 " + yourTv.volume + " 입니다.  ");

    }

}