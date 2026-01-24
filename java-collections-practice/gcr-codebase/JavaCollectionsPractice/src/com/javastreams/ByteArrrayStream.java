package com.javastreams;
import java.io.*;

public class ByteArrrayStream {
    public static void main(String[] args) {

        String source =
            "C:\\Users\\sunny\\Desktop\\New Folder (2)\\image.jpg";

        String dest =
            "C:\\Users\\sunny\\Desktop\\New Folder (2)\\image_copy.jpg";

        try (
            FileInputStream fis = new FileInputStream(source);
            ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                baos.write(byteData);
            }

            byte[] imageBytes = baos.toByteArray();

            try (
                ByteArrayInputStream bais =
                    new ByteArrayInputStream(imageBytes);
                FileOutputStream fos =
                    new FileOutputStream(dest)
            ) {
                while ((byteData = bais.read()) != -1) {
                    fos.write(byteData);
                }
            }

            System.out.println("Image copied using ByteArray streams");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
