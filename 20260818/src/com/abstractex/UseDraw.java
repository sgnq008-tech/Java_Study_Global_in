package com.abstractex;

public class UseDraw {
	
	public static void main(String[]args) {
	Diagram[] d = new Diagram[3];
	d[0] = new Triangle();
	d[1] = new Circle();
	d[2] = new Rectangle();
	
	for (int i = 0; i< d.length; i++)
	{
		d[i].draw();
	}
}
}
