import java.util.*;

public class Work04
{
	public static void main(String[] args){
		//使用三元运算符实现分页功能。
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入你的数据总数");
		int i = sca.nextInt();
		System.out.print("请输入每页数据的条数");
		int j = sca.nextInt();
		
		int page = getPage(i,j);
		System.out.println("你所输入数据可以分成"+page+"页");
	}
	
	public static int getPage(int i , int j ){
		int page = i%j== 0 ? i/j : i/j+1;
		return page;
	}
}