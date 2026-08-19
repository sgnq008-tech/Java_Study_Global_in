package com.innerex;

import java.awt.event.*;
public class WinEvent extends WindowAdapter{
	
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

}
