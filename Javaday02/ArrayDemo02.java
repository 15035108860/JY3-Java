import java.util.*;

public class ArrayDemo02
{
	public static void main(String[] args){
		int[] arr1 = {1,6,9,7,8};
		int[] arr2 = new int[5];
		
		//第一种复制数组的方法
		System.arraycopy(arr1,0,arr2,0,arr1.length);
		
		//第二种复制数组的方法
		int[] arr3 = Arrays.copyOf(arr1,6);
		System.out.print(Arrays.toString(arr3));
	}
}