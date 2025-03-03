package DownloadApp;

public class DownloadDemo {
    public static void main(String[] args) {
        Download file1 = new Download("file1");
        Download file2 = new Download("file2");
        Download file3 = new Download("file3");

        file1.start();
        file2.start();
        file3.start();
    }
}
