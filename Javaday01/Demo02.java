import java.util.Random;
import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		//练习1
		int age1 = 23;
		int age2 = 24;
		System.out.println("你两的年龄和是:"+age1+age2);
		System.out.println("================");
		
		//练习2
		int i = 19;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toHexString(i));
		System.out.println("================");
		
		//练习3
		long a = 12345678901l;
		float b = 3.1415926f;
		double c = 1234567890.0987654321;
		
		//练习4
		Random r = new Random();
	    int rInt = r.nextInt(26);  //产生一个随机数[0,26);
	    System.out.println(rInt);
	    char d = (char)('A' + rInt);
	    System.out.println(d);
	    System.out.println("================");
	    
	    //练习4 补充
		int e = 97;
		System.out.println((char)e);
		
		char f = 'o';
		System.out.println((int)f);
	    System.out.println("================");
		
		//练习5.1
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		System.out.println("您所输入数的平方是:"+g*g);
		
		//练习5.2
		long distance = (long) (4.2*3*(10^8)*60*60*24*365);
		float magpie = 0.45f;
		double number = (double)(distance/magpie);
		System.out.println("需要"+number+"只喜鹊.");
		
		float a = (float)3.14;
		float a1 = 3.14f;
		System.out.println(10^8);
		
	}
}