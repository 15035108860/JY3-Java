import java.util.*;

public class SwitchCaseDemo
{
	public static void main(String[] srgs){
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入你的成绩");
		int score = sca.nextInt();
		String level = "";
		switch(score/10){
			
			case 10 : level = "神仙";
			break;
			
			case 9 : level = "大神";
			break;
			
			case 8 : level = "大仙";
			break;
			
			case 7 : level = "牛逼";
			break;
			
			case 6: level = "厉害";
			break;
		
			case 5: level = "无敌";
			break;
			
			case 4: level = "啥玩意";
			break;
			
			case 3: level = "你猜";
			break;
			
			case 2: level = "嗷嗷";
			break;
			
			case 1: level = "哈哈";
			break;
			
			case 0: level = "嘻嘻";
			break;
			
			default: level="小伙子";
		}
		System.out.println(level);
		
	}
}