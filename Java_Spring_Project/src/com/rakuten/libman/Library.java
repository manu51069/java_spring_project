package com.rakuten.libman;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Library {
	private Map<Books, Authors>lib;

	public Library(Map<Books, Authors> lib) {
		this.lib = lib;
	}
	public void displayBooks() {
		Iterator<Map.Entry<Books, Authors>>itr=lib.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Books, Authors> e= itr.next();
			System.out.println("Books");
		}	
	} 
}
