package com.valor.day01_01_why;

public class GameDemo {
	public static void main(String[] args) {
		playGeme();
		playMusic();
		
	}
	/**
	 *	��������
	 */
	private static void playMusic() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("��"+i+"��"+"Paly Music");
		}
		
	}
	/**
	 *	����Ϸ
	 */
	private static void playGeme() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("��"+i+"��"+"Paly Game");
		}
		
	}
}
