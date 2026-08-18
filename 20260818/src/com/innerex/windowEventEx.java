package com.innerex;

import java.awt.*;

public class windowEventEx {

	public static void main(String[] args) {


		Frame f = new Frame("Event");
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
