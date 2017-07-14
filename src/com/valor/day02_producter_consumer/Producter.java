package com.valor.day02_producter_consumer;

public class Producter implements Runnable {
	private ShareResoure shareResoure = null;

	public Producter(ShareResoure shareResoure) {
		this.shareResoure = shareResoure;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println(" name "+ shareResoure.name+" sex " + shareResoure.sex);
		}
	}

}