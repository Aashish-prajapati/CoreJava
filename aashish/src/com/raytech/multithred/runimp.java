package com.raytech.multithred;

public class runimp extends helloThread implements Runnable {
	
		private String name;
		public runimp() {}
		public runimp(String name) {
			
			this.name=name;
			
		}  
		public void run() {
			
			for(int i=0;i<12;i++) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(name);
			}
		
		
}
}
