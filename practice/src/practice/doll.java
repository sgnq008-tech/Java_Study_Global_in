package practice;

public class doll {
	
	int body;
	int arm;
	int head;
	int leg;
	int tail;
	int ears;
	
	String name;
	
	// 생성자
	doll() {
		name = "우사기";
		body = 21;
		arm =30;
		head = 30;
		leg= 30;
		tail=30;
		ears =30; 
	}
	
	public String getname() {
		return name;
	}
	
	void Upleg(int value) { // 파라미터 입력받음을 정의
		leg	= leg + value;
	}
	
	void Downleg(int value) {
		leg	= leg - value;
	}
	
	void Uparm(int value) {
		arm	= arm + value;
	}
	
	void Downhead(int value) {
		head	= head - value;
	}
	
	void Uphead(int value) {
		head	= head + value;
	}
	
	void Uptail(int value) {
		tail   = tail + value;	
	}
	
	void Downtail(int value) {
		 tail	=  tail - value;
	}
	
	void Upears(int value) {
		tail   = tail + value;	
	}
	
	void Downears(int value) {
		 tail	=  tail - value;
	}

	
	
		
		
		
	}
