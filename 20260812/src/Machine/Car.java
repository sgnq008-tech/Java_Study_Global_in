package Machine;

public class Car {
	// 필드
	String model; // 차종 이름
	String issue; // 고장 증상
	boolean isFixed; // 수리완료 여부
	
	//기본 생성자
	public Car() 
	{
		
	}
	
	//자동차 모델, 자동차 문제점을 지정해서 처리하는 생성자
	public Car(String model, String issue) {
		this.model = model;
		this.issue = issue;
		isFixed = false;
	}
	
	public void fix() {
	  isFixed = true;
	  System.out.println("["+model+"] 수리가 완료되었습니다.");
	}
	
	public void printInfo() {
		System.out.println("["+model+"] (증상: ["+issue+"]) - 상태:" +(isFixed ? "정비완료" : "정비필요"));
	}

}
