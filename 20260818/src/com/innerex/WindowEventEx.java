package com.innerex;
import java.awt.*;
public class WindowEventEx{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Event");
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		f.setSize(300, 200);
		f.setVisible(true);

	}

}
