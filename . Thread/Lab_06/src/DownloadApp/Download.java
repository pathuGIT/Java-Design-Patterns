package DownloadApp;

import java.util.Random;

public class Download extends Thread{
    private String fileName;

    public Download(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        //System.out.println(fileName+" is downloading...");
        System.out.println("Starting download: " + fileName);
        try {
            // Simulating download time between 2 to 5 seconds
            int downloadTime = new Random().nextInt(3000) + 2000;
            Thread.sleep(downloadTime);
        } catch (InterruptedException e) {
            System.out.println("DownloadApp.Download interrupted: " + fileName);
        }
        System.out.println("DownloadApp.Download complete: " + fileName);
    }
}
