package com.bank;


import java.io.*;
public class Atm {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		
		Account account = new Account("내꺼");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strWork;
		
		do {
			System.out.println("\n 메뉴를 선택하세요. ");
			System.out.println("-----------------------------");
			System.out.println(" 입   금 -----------------> 1 ");
			System.out.println(" 출   금 -----------------> 2 ");
			System.out.println(" 잔 액 조 회 -------------> 3 ");
			System.out.println(" 종   료 -----------------> 4 ");
			System.out.println("-----------------------------");
			
			
			System.out.print("메뉴를 선택하세요.");
			strWork = br.readLine();
			int switchInt = 0;
			
			if(strWork != null)
				switchInt = Integer.parseInt(strWork);
			else {
				System.out.println("메뉴를 선택하지 않으셨습니다.");
				System.exit(0);
			}
			
			
			switch(switchInt) {
			case 0:
				System.out.println("ATM을 종료합니다");
				return ;
			case 1:
				System.out.println("\n----------------------");
				System.out.print("입금 금액 : ");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				account.deposit(depositLong);
				break;
			case 2:
				System.out.println("\n----------------------");
				System.out.print("출금 금액 : ");
				String strwithdrawIn = br.readLine();
				long withdrawLong = Long.parseLong(strwithdrawIn);
				account.withdraw(withdrawLong);
				break;
			case 3:
				System.out.println(account.getName()+"님의 잔액은"+account.getBalance()+"원 입니다.");
				break;
				default:
					System.out.println("0 ~ 3 사이의 숫자만 허용합니다.");
			
			
			
			}
			
			
		}while(strWork.equals("0"));
		
		
		
		
	}

}
