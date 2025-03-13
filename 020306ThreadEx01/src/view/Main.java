package view;

import controller.ThreadController;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			ThreadController t = new ThreadController();
			t.start();
		}
	}

}
