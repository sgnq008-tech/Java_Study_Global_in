package Level1;

public class Shape {
	public void draw() { System.out.println("Shape 그리기"); }
	}

	class Circle extends Shape {
	    @Override
	    public void draw() { System.out.println("Circle 그리기"); } 
	
public static void main(String[] args) {
	        Shape s = new Circle(); // 업캐스팅
	        s.draw();               // 실행 결과: "Circle 그리기" 출력
	    }
	}
