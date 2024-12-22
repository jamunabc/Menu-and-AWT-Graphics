package com.mymenu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class SimpleAWTMenu {
	public static void main(String[]args) {
		
		Frame frame =new Frame("AWT Menu Example");
		
		MenuBar menuBar=new MenuBar();
		
		Menu fileMenu=new Menu("File");
		Menu editMenu=new Menu("Edit");
		
		MenuItem newItem=new MenuItem("New");
		MenuItem openItem=new MenuItem("open");
		MenuItem saveItem=new MenuItem("save");
		MenuItem exitItem=new MenuItem("exit");
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		frame.setMenuBar(menuBar);
		
		frame.setSize(400,300);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

}
