import java.util.*;

public class CharPosition
{
	public static void main(String[] args){
		//���̽����ַ�������Ҫ���ҵ��ַ�
		Scanner sca = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String inputString = sca.next();
		System.out.println("�������������λ�õ��ַ�");
		String inputChar = sca.next();
		char checkChar = inputChar.charAt(0);
		
		//���÷���
		int[] ary = charPosition(inputString,checkChar);
		
		System.out.println("�������ҵ��ַ����ֵ�λ��(��0��ʼ)��:");
		System.out.println(Arrays.toString(ary));
	}
	
	//ͳ���ַ�λ�÷���
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