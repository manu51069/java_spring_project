package com.rakuten.libman;

import java.util.Iterator;
import java.util.List;

public class Department {
	 private int deptid;
	private  String deptName;
	private List<String>list;
	
	public Department(int deptid, String deptName,List<String>list) {
		this.deptid = deptid;
		this.deptName = deptName;
		this.list = list;
	}
	 public void displayRecords() {
		 System.out.println(this.deptid+"\t"+this.deptName);
		 Iterator<String>itr=list.iterator();
		 while (itr.hasNext()) {
			System.out.println("\t"+itr.next());
		}
	}

}


