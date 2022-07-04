package com.varxyz.jv200.mod010;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int totalBytes = 0;
		try {
			try {
				fis = new FileInputStream("test.txt");
				for (int readByte; (readByte = fis.read()) != -1;) {
					System.out.write(readByte);
					totalBytes++;
				}	
				
			}finally {
				fis.close();
			}
		}catch(IOException e) { //io, 파일 관련
			e.printStackTrace();
		}
	}
}
