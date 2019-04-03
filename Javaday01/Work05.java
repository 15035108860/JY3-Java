import java.util.*;

public class Work05
{
	public static void main(String[] args){
		//输入成绩,判断成绩等级
		while(true){
			Scanner sca = new Scanner(System.in);
			System.out.println("请输入学生的成绩分数");
			int score = sca.nextInt();
			getLevel(score);
		}
	}
	
	public static void getLevel(int score){
		if(score < 80 && score > 0){
			System.out.print("学生成绩对应的等级是:不及格");
		}else if(score < 90){
			System.out.print("学生成绩对应的等级是:良好");
		}else if(score < 100){
			System.out.print("学生成绩对应的等级是:优秀");
		}else{
			System.out.print("学生成绩对应的等级是:神仙");
		}
	}
}