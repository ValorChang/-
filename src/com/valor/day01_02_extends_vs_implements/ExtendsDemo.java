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
				System.out.println(super.getName()+"���˱��Ϊ"+num-- +"ƻ��");
			}
			
		}
		super.run();
	}
}

public class ExtendsDemo {
	public static void main(String[] args) {

		//���������߳�
		new Persion("СA ").start();
		new Persion("СB ").start();
		new Persion("СC ").start();
	}
}
