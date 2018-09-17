package com.my.optimization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class Test {
	
	private final List<String> bookInStock = new ArrayList<String>();
	
	public String[] getBooks() {
		if(bookInStock.size()==0) {
			return null;
		}else {
			if(bookInStock instanceof RandomAccess) {
				for (int i = 0; i < bookInStock.size(); i++) {
					
				}
			}else {
				Iterator<String> it = bookInStock.iterator();
				while (it.hasNext()) {
					String string = (String) it.next();
				}
			}
			return new String[0];
		}
	}
	
    public static void main(String[] args) {
		
	}
}
