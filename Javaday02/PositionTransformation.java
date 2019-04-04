import java.util.*;

public class PositionTransformation
{
	public static void main(String[] args){
		while(true){
			Scanner sca = new Scanner(System.in);
			System.out.println("请输入一个整数");
			int num = sca.nextInt();
			
			int newNum = positionTransformation(num);
			System.out.println("转换后的数字是:"+newNum);
		}
	}
	
	public static int positionTransformation(int x){ 
	  long tmp = x; // 防止结果溢出  
	  long result = 0;  
	  while (tmp != 0) {  
		 result = result *10 + tmp % 10;  
		 tmp = tmp /10; }  
		// 溢出判断  
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
		{  
		 result =0; 
		} 
		 return (int) result;   
	}
	

}