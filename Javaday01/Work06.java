import java.util.*;

public class Work06{
	public static void main(String[] args){
		//循环接收控制台输入的一个数，并且输出控制台”您输入的数是“，如果输入”-1“退出循环。
		while(true){
			Scanner sca = new Scanner(System.in);
			System.out.print("请输入一个数");
			int i = sca.nextInt();
			if(i == -1){
				System.out.println("游戏结束");
				break;
			}
		}
	}
}