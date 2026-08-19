package com.inherex;

public class ColorPointMain {

	public static void main(String[] args) {
		PointEx p = new PointEx();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}
