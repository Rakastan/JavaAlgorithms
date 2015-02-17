package com.anakiou.ja.threads;

import java.util.Scanner;

class ProcessorT{
	public void produce() throws InterruptedException{
		synchronized (this) {
			System.out.println("Producer thread running....");
			wait();
			System.out.println("Resumed.....");
		}
		
	}
	
	public void consume() throws InterruptedException{
		Scanner scanner = new Scanner(System.in);
		
		Thread.sleep(2000);
		
		synchronized (this) {
			System.out.println("Waiting for return key....");
			scanner.nextLine();
			System.out.println("Return key pressed");
			notify();
			
		}
	}
}

public class AppWaitNotify {

	public static void main(String[] args) {
		ProcessorT p = new ProcessorT();
		
		
	}

}
