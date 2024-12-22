package com.mymenu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MyMenuDemo {
	public static void main(String[]args) {
		Frame frame=new Frame();
		frame.setVisible(true);
		frame.setSize(200,200);
		frame.setVisible(true);
		
		MenuBar mb=new MenuBar(); 
		Menu fileMenu=new Menu("file");
		Menu editMenu=new Menu("edit");
		Menu sourceMenu=new Menu("source");
		
		MenuItem fn1=new MenuItem("New");
		MenuItem fn2=new MenuItem("open");
		
		Menu recentMenu=new Menu("recent");
		MenuItem fn3a=new MenuItem("file");
		MenuItem fn3b=new MenuItem("project");
		MenuItem fn3c=new MenuItem("workspace");
		
		recentMenu.add(fn3a);
		recentMenu.add(fn3b);
		recentMenu.add(fn3c);
		
		fileMenu.add(fn1);
		fileMenu.add(fn2);
		fileMenu.add(recentMenu);
		
		mb.add(fileMenu);
		mb.add(editMenu);
		mb.add(sourceMenu);
		
		frame.setMenuBar(mb);
		
		
		
		
	}

}
