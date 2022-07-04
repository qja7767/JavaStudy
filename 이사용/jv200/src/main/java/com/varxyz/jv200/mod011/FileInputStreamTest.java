package com.varxyz.jv200.mod011;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int totalBytes = 0;
		try {
			try {
				fis = new FileInputStream("test.txt");
				fos = new FileOutputStream("test_copy.txt");
				for (int readByte; (readByte = fis.read()) != -1;) {
					fos.write(readByte);
					totalBytes++;
				}				
			}finally {
				fos.close();
				fis.close();
			}
		}catch(IOException e) { //io, 파일 관련
			e.printStackTrace();
		}
		System.out.println("\n전체 바이트 수: " + totalBytes + "bytes.");
	}
}
