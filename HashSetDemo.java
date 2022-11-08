package com.HashSetEx;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet Hs=new HashSet<>();
		Hs.add("abc");
		Hs.add("abc");//no C.E->but not in output,duplicates are not allowed,
		              //not even run time error,it will over-ride that and print once
		System.out.println(Hs);//useful to remove duplictes
		Hs.add("c");
		Hs.add(null);
		Hs.add(10);
		System.out.println(Hs);
	}

}
