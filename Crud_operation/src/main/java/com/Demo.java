package com;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
		Object[] arr1= {1,"priya"};
		Object[] arr2= {2,"mavya"};
		Object[] arr3= {3,"achu"};
		
		ArrayList<Object []> al =new ArrayList<Object[]>();
		al.add(arr1);
		al.add(arr2);
		al.add(arr3);
		
		for(Object[] o:al) {
			System.out.println(o[0]+"=> "+o[1]);
		}
	}

}
