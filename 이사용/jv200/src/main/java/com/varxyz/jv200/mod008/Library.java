package com.varxyz.jv200.mod008;

import java.util.Scanner;

public class Library {
	private Book[] books = new Book[100];
	
	private static Library lib = new Library();
	
	private Library() {
	}
	
	public static Library getLibrary() {
		return lib;
	}
	

}

	

