import java.util.*;

public class Demo05
{
	public static void main(String[] args){
		//字符转换成中文
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你需要转换的字符:");
		String num = scanner.next();
		
		char ch = num.charAt(0);
		
		System.out.println(ch);
		
		//System.out.println(intToChar(i));
		
		
		//System.out.println(charToInt(ch));
	}
	
	
	
	public static char intToChar(int i){
		return((char)i);
	}
	public static int charToInt(char c){
		return(c);
	}
}