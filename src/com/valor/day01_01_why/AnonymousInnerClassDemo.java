package com.valor.day01_01_why;

public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Paly Game" + "   ��" + i + "��");
			if (i == 10) {
				test1();
				//test2();
			}
		}
	}
	private static void test1(){
		new Thread(new Runnable() {
			@Override
			//�����ڲ���
			public void run() {
				for (int i = 1; i <= 50; i++) {
					System.out.println("Paly Music" + "  ��" + i + "��");
				}
			}
		}).start();
	}
	
	private static void test2() {
		new Thread(){
			  public void run() {
				  for (int i = 1; i <= 50; i++) {
						System.out.println("Paly Music" + "  ��" + i + "��");
					}
			  };
			}.start();
	}
}
