package com.swing.demo.app;

import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args){
		System.out.print("asdasd");
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				Application app = new Application();
				app.setTitle("-:: Demo ::-");
				app.setSize(800, 600);
				app.setLocationRelativeTo(null);
				app.setDefaultCloseOperation(Application.EXIT_ON_CLOSE);
				
				app.setVisible(true);
			}
			
		});
	}

}
