import java.util.*;

public class Work0701{
	public static void main(String[] args){
		//计算两个点P1(x1,y1)与P2(x2,y2)之间的距离
		Scanner scr = new Scanner(System.in);
		System.out.println("请输入第1个数的行坐标");
		int x1 = scr.nextInt();
		System.out.println("请输入第1个数的纵坐标");
		int y1 = scr.nextInt();
		
		System.out.println("请输入第2个数的行坐标");
		int x2 = scr.nextInt();
		System.out.println("请输入第2个数的纵坐标");
		int y2 = scr.nextInt();
		
		double distance = getDistance(x1,y1,x2,y2);
		System.out.println("你所输入两个点之间的距离是:"+distance);
	}
	
	public static double getDistance(int x1,int y1,int x2,int y2){
		double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return distance;
	}
}