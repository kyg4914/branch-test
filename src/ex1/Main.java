package ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM();
		
		while(true) {

			System.out.println("*****************************************");
			System.out.print("[1]계좌 신설 [2]잔액 확인 [3]입금 [4]출금 [5]종료 [6]관리자 기능>> ");
			System.out.println("*****************************************");

			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.print("이름 >> ");
				String name = sc.next();
				System.out.print("계좌번호 >> ");
				String accountNumber = sc.next();
				System.out.print("초기입금 >> ");
				int deposit = sc.nextInt();
				
				Account newAccount = new Account(name, accountNumber, deposit);
				boolean result = atm.addAccount(newAccount);
				
				if(result) {
					System.out.println("계좌 신설이 완료되었습니다");
				}else {
					System.out.println("계좌 정보를 다시 확인 후 입력해주세요");
				}
			}else if(menu == 2) {
				System.out.print("이름 >> ");
				String name = sc.next();
				System.out.print("계좌번호 >> ");
				String accountNumber = sc.next();
				
				Account newAccount = new Account(name, accountNumber);
				int result = atm.searchMyBalance(newAccount);
				
				if(result>=0) {
					System.out.println("현재 잔액 : "+ result+"원");
				}else {
					System.out.println("계좌 정보를 다시 확인 후 입력해주세요");
				}
			}else if(menu == 3) {
				System.out.print("계좌번호 >> ");
				String accountNumber = sc.next();
				System.out.print("입금금액 >> ");
				int deposit = sc.nextInt();
				
				boolean result = atm.deposit(accountNumber, deposit);
					
				if(result) {
					System.out.println("입금이 완료 되었습니다");
				}else {
					System.out.println("계좌 정보나 입금 금액을 다시 확인 후 입력해주세요");
				}
			}else if(menu == 4) {
				System.out.print("계좌번호 >> ");
				String accountNumber = sc.next();
				System.out.print("출금금액 >> ");
				int withdraw = sc.nextInt();
				
				boolean result = atm.withdraw(accountNumber, withdraw);
					
				if(result) {
					System.out.println("출금이 완료 되었습니다");
				}else {
					System.out.println("계좌 정보나 출금 금액을 다시 확인 후 입력해주세요");
				}
			}else if(menu == 5) {
				break;
			}
		}
		
	}

}
