package ex1;

public class TestMain {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		
		//계좌 추가하기
		boolean check1 = atm.addAccount(new Account("강예진1", "1234", 10000));
		System.out.println(check1);
		boolean check2 = atm.addAccount(new Account("강예진2", "1234", 50000));
		System.out.println(check2);
		boolean check3 = atm.addAccount(new Account("강예진3", "1235", 50000));
		System.out.println(check3);
		
		//계좌 확인
		int result1 = atm.searchMyBalance(new Account("강예진1", "1234"));
		System.out.println(result1);
		int result2 = atm.searchMyBalance(new Account("강예진1", "1236"));
		System.out.println(result2);
		
		//입금
		boolean check4 = atm.deposit("1234", 50000);
		System.out.println(check4);
		System.out.println(atm.searchMyBalance(new Account("강예진1", "1234")));
		boolean check5 = atm.deposit("1234", -50000);
		System.out.println(check5);
		boolean check6 = atm.deposit("123443", 50000);
		System.out.println(check6);
		
		//출금
		boolean check7 = atm.withdraw("1234", -20000);
		System.out.println(check7);
		boolean check8 = atm.withdraw("1234234", 20000);
		System.out.println(check7);
		boolean check9 = atm.withdraw("1234", 1000000);
		System.out.println(check9);
		boolean check10 = atm.withdraw("1234", 2000);
		System.out.println(check10);
		System.out.println(atm.searchMyBalance(new Account("강예진1", "1234")));
		
	
	}

}
