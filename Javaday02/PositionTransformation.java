import java.util.*;

public class PositionTransformation
{
	public static void main(String[] args){
		while(true){
			Scanner sca = new Scanner(System.in);
			System.out.println("������һ������");
			int num = sca.nextInt();
			
			int newNum = positionTransformation(num);
			System.out.println("ת�����������:"+newNum);
		}
	}
	
	public static int positionTransformation(int x){ 
	  long tmp = x; // ��ֹ������  
	  long result = 0;  
	  while (tmp != 0) {  
		 result = result *10 + tmp % 10;  
		 tmp = tmp /10; }  
		// ����ж�  
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
		{  
		 result =0; 
		} 
		 return (int) result;   
	}
	

}