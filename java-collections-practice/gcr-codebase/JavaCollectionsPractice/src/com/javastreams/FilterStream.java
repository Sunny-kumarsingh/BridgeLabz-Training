package com.javastreams;
import java.io.*;

public class FilterStream {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\sunny\\Desktop\\New Folder (2)\\Hello.txt";
		String destination = "C:\\Users\\sunny\\Desktop\\New Folder (2)\\SunnyOutput.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(source));
				BufferedWriter bw = new BufferedWriter(new FileWriter(destination))){
					
			int ch;
			while((ch = br.read())!=-1) {
				if(ch>='A' && ch <= 'Z') {
					ch = ch+32;
				}
				bw.write(ch);
			}
			
		}catch(IOException e) {
			e.printStackTrace();;
		}
	}

}
