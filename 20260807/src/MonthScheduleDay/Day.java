package MonthScheduleDay;

public class Day {

		private String work;//하루의 할일을 나타내는 문자열 변수 
		
		public void set(String work) {
			this.work =work;
			}
		
		public String get() {
			return work;		
		}
	
		public void show() {
			if(work == null) {System.out.println("없습니다.");}
			else {System.out.println(work+"입니다.");}
		}
	
	
	
	
	
}
