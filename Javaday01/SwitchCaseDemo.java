import java.util.*;

public class SwitchCaseDemo
{
	public static void main(String[] srgs){
		Scanner sca = new Scanner(System.in);
		System.out.print("��������ĳɼ�");
		int score = sca.nextInt();
		String level = "";
		switch(score/10){
			
			case 10 : level = "����";
			break;
			
			case 9 : level = "����";
			break;
			
			case 8 : level = "����";
			break;
			
			case 7 : level = "ţ��";
			break;
			
			case 6: level = "����";
			break;
		
			case 5: level = "�޵�";
			break;
			
			case 4: level = "ɶ����";
			break;
			
			case 3: level = "���";
			break;
			
			case 2: level = "��";
			break;
			
			case 1: level = "����";
			break;
			
			case 0: level = "����";
			break;
			
			default: level="С����";
		}
		System.out.println(level);
		
	}
}