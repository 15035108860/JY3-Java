import java.util.*;

public class Demo01
{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÕË»§Ãû:");
		String userName = sca.next();
		char c1 = userName.charAt(0);
		System.out.println("ÇëÊäÈëÃÜÂë");
		String passWord = sca.next();
		char c2 = passWord.charAt(0);
		
		char un = 'l';
		char pw = 'l';
		
		if(un == c1 && pw == c2){
			System.out.println("µÇÂ¼³É¹¦");
		}else{
			System.out.println("µÇÂ¼Ê§°Ü");
		}
	}
}