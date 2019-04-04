import java.util.*;

public class BubbleSort
{
	public static void main(String[] args){
		//int[] arr1 = new int[]{5,6,3,7,89,52,-11,69};
		
		//键盘输入数组 核心是用"空格"切割字符串
		 Scanner sc = new Scanner(System.in);
		 System.out.println("请输入你想排序的数组用空格隔开回车结束");
		 String inputString = sc.nextLine(); 
		 
		 String stringArray[] = inputString.split(" "); 
		 
		 int[] num = new int[stringArray.length]; 
		 
		 for (int i = 0; i < stringArray.length; i++) { 
		 
			num[i] = Integer.parseInt(stringArray[i]); 
			
		 }
		
		//调用冒泡排序的方法
		int[] newArray = bubbleSort(num);
		//输出排完序的数组
		System.out.print("排序完成,顺序是:"+Arrays.toString(newArray));
	}
	
	
	//冒泡排序
	public static int[] bubbleSort(int[] arr){
		
		for(int i = 0; i < arr.length - 1; i++){
			
			for(int j = 0; j < arr.length - 1 - i; j++){
				
				if(arr[j] > arr[j+1]){
				
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
}