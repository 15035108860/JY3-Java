import java.util.*;

public class Work0702{
	public static void main(String[] args){
	//用户在控制台输入基本工资数，计算到手工资
		while(true){
			Scanner sca = new Scanner(System.in);
			System.out.print("请输入你的基本工资");
			int basicasicSalary = sca.nextInt();
			getSalary(basicasicSalary);
			if(basicasicSalary == 0){
				System.out.println("这么点工资还算?丢人不");
				break;
			}
		}
	}
	
	public static void getSalary(int basicasicSalary){
		double salary = 0;
		if( basicasicSalary < 5000){
			salary = basicasicSalary - basicasicSalary*11/100;
			System.out.println("你的到手工资是:"+salary);
		}else if(basicasicSalary <= 8000){
			salary = basicasicSalary - basicasicSalary*11/100 - (basicasicSalary-5000)*(3/100);
			System.out.println("你的到手工资是:"+salary);
		}else if(basicasicSalary <= 17000){
			salary = basicasicSalary - basicasicSalary*11/100 - (basicasicSalary-5000)*(10/100);
			System.out.println("你的到手工资是:"+salary);
		}else if(basicasicSalary <= 30000){
			salary = basicasicSalary - basicasicSalary*11/100 - (basicasicSalary-5000)*20/100;
			System.out.println("你的到手工资是:"+salary);
		}else if(basicasicSalary <= 40000){
			salary = basicasicSalary - basicasicSalary*11/100 - (basicasicSalary-5000)*25/100;
			System.out.println("你的到手工资是:"+salary);
		}else if(basicasicSalary <= 60000){
			salary = basicasicSalary - basicasicSalary*11/100 - (basicasicSalary-5000)*30/100;
			System.out.println("你的到手工资是:"+salary);
		}else if(basicasicSalary <= 85000){
			salary = basicasicSalary - basicasicSalary*11/100 - (basicasicSalary-5000)*35/100;
			System.out.println("你的到手工资是:"+salary);
		}else{
			salary = basicasicSalary - basicasicSalary*11/100 - (basicasicSalary-5000)*45/100;
			System.out.println("你的到手工资是:"+salary);
		}
	}
}