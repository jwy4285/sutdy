package ex04;

class Account {
    // 입금 (입금할 금액, 본래있던 금액, 계좌잔액)
    int deposit(int amount, int money) {
        int restMoney = money + amount;
        return restMoney; // 메서드를 호출한 라인으로 복귀주소로 값 반환
    }

    // 출금 (입금할 금액,300 본래있던 금액, 계좌잔액 money)
    int withdraw(int amount, int money) {
        int restMoney = money - amount;
        return restMoney;
    }

    // 이체 (보낼금액(amount), 받는사람자액(receiverMoney),보내는사람잔액(sendrMoney))

    // 출력 : 받는사람잔액 출력
    // 출력 : 보낸사람잔액 출력
    // 리턴은 필요없다. 출력만 해보기!!
}

public class Meth03 {
    public static void main(String[] args) {
        // money 홍길동의 잔액
        int hMoney = 1000;

        // 임꺽정의 잔액
        int iMoney = 1000;

        // 홍길동이 입글음 2번하고, 출금 한번하기
        Account haccount1 = new Account();
        hMoney = haccount1.deposit(100, hMoney);
        System.out.println("남은 금액 : " + hMoney);
        hMoney = haccount1.deposit(500, hMoney);
        System.out.println("남은 금액 : " + hMoney);
        hMoney = haccount1.withdraw(300, hMoney);
        System.out.println("남은 금액 : " + hMoney);

        // 임꺽정이 입금을 1(100원)번하고, 출금(300,500) 2번하기
        Account iAccount = new Account();
        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("임꺽정 남은 금액 : " + iMoney);
        iMoney = iAccount.withdraw(300, iMoney);
        System.out.println("임꺽정 남은 금액 : " + iMoney);
        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("임꺽정 남은 금액 : " + iMoney);

    }

}
