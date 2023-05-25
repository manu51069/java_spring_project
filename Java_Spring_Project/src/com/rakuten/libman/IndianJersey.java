package com.rakuten.libman;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IndianJersey {
	private HashMap<Integer,String>hmap;

	public IndianJersey(HashMap<Integer, String> hmap) {
		this.hmap = hmap;
	}

	public void displayTeam() {
		Iterator<Entry<Integer, String>>itr=hmap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String>entry= itr.next();
			System.out.println("Jersey="+entry.getKey()+",player="+entry.getValue());
		}
	}

}