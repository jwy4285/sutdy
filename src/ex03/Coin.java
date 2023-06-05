package ex03;

public class Coin {
    public static void main(String[] args) {
        // 500, 100 ,50 , 10 (개수를 최소로 해서 주세요.(최대한 500원으로 많이))
        final int money = 2680; // scanner 로 수정하기 /파이널 변수는 조정할수없다
        int restMoney = money; // 남은 금액 변수 만들기
        int count; // 동전 개수를 담을 변수

        int tempMoney;

        tempMoney = 500;
        count = restMoney / tempMoney;
        System.out.println(tempMoney + "원 :" + count);
        restMoney = restMoney % tempMoney;

        tempMoney = 100;
        count = restMoney / tempMoney; // 1
        System.out.println("100원 : " + count);
        restMoney = restMoney % tempMoney;

        tempMoney = 50;
        count = restMoney / tempMoney;
        System.out.println(tempMoney + "원 : " + count);
        restMoney = restMoney % tempMoney;

        tempMoney = 10;
        count = restMoney / tempMoney;
        System.out.println(tempMoney + "원 : " + count);
        restMoney = restMoney % tempMoney;

    }

}
