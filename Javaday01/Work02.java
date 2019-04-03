
import java.util.*;

public class Work02
{
	public static void main(String[] args){
		//实现实现函数计算：y = f（x） = x^2 - 2x + 4 注：x^2 表示“x 的平方”  

		Scanner sca = new Scanner(System.in);
		System.out.print("请输入你需要转换的数字:");
		int i = sca.nextInt();
		System.out.println(getResult(i));
	}
	
	public static int getResult(int i ){
		return i*i-2*i+4;
	}
}