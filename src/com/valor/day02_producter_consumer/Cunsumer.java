package com.valor.day02_producter_consumer;

public class Cunsumer implements Runnable{
	private ShareResoure shareResoure  = null;
	

	public Cunsumer(ShareResoure shareResoure) {
		this.shareResoure = shareResoure;
	}

	@Override
	public void run() {
		int flag = 0;
		while(true){
			if (flag==0) {
				shareResoure.name = "Valor";
				shareResoure.sex = "11";
			}
			else{
			shareResoure.name = "Tom";
			shareResoure.sex = "222";
			}
			flag = (flag+1)%2;
		}
		
	}
	
}
