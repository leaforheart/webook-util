package com.leaforbook.webook.util;

import java.util.List;

public class ListToArray {
	
	public static Object[] oneDimensional(List<Object> list) {
		int size = list.size();
		Object[] arr = new Object[size];
		for(int i=0;i<size;i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
	
	public static Object[][] twoDimensional(List<List<Object>> list) {
		int count = list.size();
		int size = list.get(0).size();
		Object[][] arr = new Object[count][size];
		for(int i=0;i<count;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j] = list.get(i).get(j);
			}
		} 
		return arr;
	}
	
}
