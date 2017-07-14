package com.valor.day02_producter_consumer;

public class ShareResoure {
	 String name;
	 String sex;
	
	public static void main(String[] args) {
		ShareResoure s = new ShareResoure();
		Cunsumer c = new Cunsumer(s);
		Producter p = new Producter(s);
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(p);

		t1.start();
		t2.start();

	}
}
