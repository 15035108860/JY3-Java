import java.util.*;

public class CharPosition
{
	public static void main(String[] args){
		//键盘接受字符串和所要查找的字符
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String inputString = sca.next();
		System.out.println("请输入你想查找位置的字符");
		String inputChar = sca.next();
		char checkChar = inputChar.charAt(0);
		
		//调用方法
		int[] ary = charPosition(inputString,checkChar);
		
		System.out.println("你所查找的字符出现的位置(从0开始)是:");
		System.out.println(Arrays.toString(ary));
	}
	
	//统计字符位置方法
	public static int[] charPosition(String inputString,char checkChar){
		int[] ary = {};
		
		for(int i = 0; i < inputString.length(); i++){
			char ch = inputString.charAt(i);
			if(ch == checkChar){
				ary = Arrays.copyOf(ary,ary.length+1);
				ary[ary.length-1] = i;
			}
		}
		
		return ary;
	}
}