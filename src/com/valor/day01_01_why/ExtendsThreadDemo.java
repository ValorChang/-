package com.valor.day01_01_why;

class MusicThread extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Paly Music"+"  ��"+i+"��");
		}
		super.run();
	}
}


public class ExtendsThreadDemo {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Paly Game"+"   ��"+i+"��");
			if (i==10) {
				MusicThread mc = new MusicThread();
				mc.start();
			}
		}
		
	}

}
