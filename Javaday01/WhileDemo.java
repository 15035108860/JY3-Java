public class WhileDemo
{
	public static void main(String[] args){
			//int i = 1;
			//int sum = 0;
			//����1,ʹ��break��ת
		/*while(true){
			if(i <= 100){
				sum = sum + i;
				i++;
			}else{
				break;
			}
			
		}
		System.out.print("����1��100�ĺ���:"+sum);*/
		
		
		//����2,��ʹ��break��ת
		/*while(i <= 100){
			sum += i;
			i++;
		}*/
		
		int a = 0;
		int c = 0;
		do{
			--c;
			a = a -1;
		}while(a > 0);
		System.out.print("����1��100�ĺ���:"+c);
	}
}