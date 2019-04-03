import java.util.*;

public class Work03
{
	public static void main(String[] args){
		/*实现 2 个函数计算：
			1) y = f（x） = x%3
			2) y = f（x） = x++ */
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入你想参与计算的整字:");
		int i = sca.nextInt();
		int y1 = f1(i);
		int y2 = f2(i);
		System.out.println("公式f1的计算结果是:"+y1);
		System.out.println("公式f2的计算结果是:"+y2);
	}
	
	public static int f1(int x){
		return x%3;
	}
	
	public static int f2(int x){
		return x++;
	}
	
}