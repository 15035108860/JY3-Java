package com.neuedu.additional;

public class ExceptionDemo {

	public static int getElement(int[] arr, int index) {

		if(arr == null ) {
			throw new NullPointerException("arr指向的数组不存在");
		}
		
		if(index < 0 || index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("错误的角标"+index+"索引不存在");
		}
		
		int i = arr[index];
		return i;
	}
}
