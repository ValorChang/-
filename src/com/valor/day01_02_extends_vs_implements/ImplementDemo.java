package com.valor.day01_02_extends_vs_implements;

class Apple implements Runnable {
	private int num = 50;

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			doWork();
		}
	}
	
	synchronized private void doWork() {
		if (num > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "³ÔÁË±àºÅÎª" + num-- + "Æ»¹û");
		}
	}
}

public class ImplementDemo {
	public static void main(String[] args) {
		Apple a = new Apple();
		new Thread(a, "A ").start();
		new Thread(a, "B ").start();
		new Thread(a, "C ").start();
	}
}
