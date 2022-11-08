package com.arrayEx;

public class Array2 {
	public static void main(String[] args) {
		int a[] = new int[10];

		a[0] = 11;
		a[1] = 12;
		a[2] = 13;
		a[3] = 14;
		a[4] = 15;
		a[5] = 16;
		a[6] = 17;
		a[7] = 18;
		a[8] = 19;
		a[9] = 20;
		// a[10]=21;// run time exception
		// System.out.println(a);//op>>[I@515f550a
		System.out.println("length of array is >>"+a.length); //length is not method ,is a attribut of this array

		for (int i = 0; i < a.length; i++) { // variables,i,a
			//System.out.println(i);
			System.out.println(a[i]);
			

		}
		String v ="vishwajit";
		System.out.println("lenght ot this string is>>"+v.length());//this is the length method here of String class
	}

}
