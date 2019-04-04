import java.util.*;

public class BubbleSort
{
	public static void main(String[] args){
		//int[] arr1 = new int[]{5,6,3,7,89,52,-11,69};
		
		//������������ ��������"�ո�"�и��ַ���
		 Scanner sc = new Scanner(System.in);
		 System.out.println("��������������������ÿո�����س�����");
		 String inputString = sc.nextLine(); 
		 
		 String stringArray[] = inputString.split(" "); 
		 
		 int[] num = new int[stringArray.length]; 
		 
		 for (int i = 0; i < stringArray.length; i++) { 
		 
			num[i] = Integer.parseInt(stringArray[i]); 
			
		 }
		
		//����ð������ķ���
		int[] newArray = bubbleSort(num);
		//��������������
		System.out.print("�������,˳����:"+Arrays.toString(newArray));
	}
	
	
	//ð������
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