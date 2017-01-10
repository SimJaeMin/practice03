package prob05;

public class Account {
	private String accountNo; //계좌번호
	private double balance; //잔고
	
	public Account(String accountNo){
		this.accountNo=accountNo;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
	
	public void save(int x){//입금
		this.balance=this.balance+x;
		System.out.println(accountNo+" 계좌에"+ x+"만원이 입금되었습니다.");
	}
	public void deposit(int x){ // 출금
	   this.balance=this.balance-x;
	   System.out.println(accountNo+" 계좌에"+x+"만원이 출금되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
