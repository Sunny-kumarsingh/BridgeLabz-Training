package com.javastreams;

import java.io.*;

public class BufferedStreams {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        String sourceFile =
            "C:\\Users\\sunny\\Desktop\\largefile.dat";   // ~100MB file

        String unbufferedCopy =
            "C:\\Users\\sunny\\Desktop\\copy_unbuffered.dat";

        String bufferedCopy =
            "C:\\Users\\sunny\\Desktop\\copy_buffered.dat";

        copyUsingUnbufferedStreams(sourceFile, unbufferedCopy);
        copyUsingBufferedStreams(sourceFile, bufferedCopy);
    }

    //Unbuffered File Streams
    private static void copyUsingUnbufferedStreams(String src, String dest) {

        long startTime = System.nanoTime();

        try (
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("Unbuffered Stream Time: "
                + (endTime - startTime) + " ns");
    }

    // Buffered Streams
    private static void copyUsingBufferedStreams(String src, String dest) {

        long startTime = System.nanoTime();

        try (
            BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(src));

            BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(dest))
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("Buffered Stream Time:   "
                + (endTime - startTime) + " ns");
    }
}
