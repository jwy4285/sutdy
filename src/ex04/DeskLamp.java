package ex04;

public class DeskLamp {
    // 인스턴스 변수 정의
    boolean isOn;

    // 메소드 정의
    void turnOn() {
        isOn = true;

    }

    void turnOff() {
        isOn = false;
    }

    String print() {
        return "현재 상태는" + (isOn == true ? "켜짐" : "꺼짐");
    }
}
