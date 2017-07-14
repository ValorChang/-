package com.valor.day01_01_why;

public class GameDemo {
	public static void main(String[] args) {
		playGeme();
		playMusic();
		
	}
	/**
	 *	播放音乐
	 */
	private static void playMusic() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("第"+i+"次"+"Paly Music");
		}
		
	}
	/**
	 *	打游戏
	 */
	private static void playGeme() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("第"+i+"次"+"Paly Game");
		}
		
	}
}
