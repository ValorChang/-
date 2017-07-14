package com.valor.day01_02_extends_vs_implements;
class Persion extends Thread
{
	private static int num = 50;
	public Persion(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if (num>0) {
				System.out.println(super.getName()+"吃了编号为"+num-- +"苹果");
			}
			
		}
		super.run();
	}
}

public class ExtendsDemo {
	public static void main(String[] args) {

		//创建三个线程
		new Persion("小A ").start();
		new Persion("小B ").start();
		new Persion("小C ").start();
	}
}
