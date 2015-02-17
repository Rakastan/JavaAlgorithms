package com.anakiou.ja.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ProcessorLatch implements Runnable{
	
	private CountDownLatch latch;
	
	public ProcessorLatch(CountDownLatch latch){
		this.latch = latch;
	}

	public void run() {
		System.out.println("Started....");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		latch.countDown();
		
	}
	
}



public class AppCountDownLatch {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i =0 ; i <3; i++){
			executor.submit(new ProcessorLatch(latch));
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed....");

	}

}
