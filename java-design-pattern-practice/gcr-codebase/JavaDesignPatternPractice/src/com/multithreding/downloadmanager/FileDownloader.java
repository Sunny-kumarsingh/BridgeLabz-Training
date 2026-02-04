package com.multithreding.downloadmanager;
import java.util.Random;

class FileDownloader implements Runnable {
    private String fileName;
    private Random random = new Random();

    FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
    	 int progress = 0;

	        while (progress < 100) {

	            // random progress increase (10–30)
	            int increment = 10 + random.nextInt(21);
	            progress += increment;

	            if (progress > 100) {
	                progress = 100;
	            }

	            System.out.println("[" + Thread.currentThread().getName() +
	                    "] Downloading " + fileName + " : " + progress + "%");

	            try {
	                // random delay
	                Thread.sleep(500 + random.nextInt(700));
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
    }
}
