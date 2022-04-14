package com.demo.interview.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		CheckProcessorTask[] tasks = {new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"), 
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web")};
		
		//Only two threads are created in the pool and those threads are being shared 
		//by the ExecutorService for executing all the tasks
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(CheckProcessorTask task : tasks) {
			service.execute(task);
		}
		
		service.shutdown();
	}

}
