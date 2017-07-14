package com.valor.day01_01_why;

class MusicRunnableImpl implements Runnable {
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 50; i++) {
			System.out.println("Paly Music" + "  第" + i + "次");
		}
	}

}
public class ImplementsRunnableDemo {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Paly Game" + "   第" + i + "次");
			if (i == 10) {
				Thread t = new Thread(new MusicRunnableImpl());
				t.start();
			}
		}
	}
}
