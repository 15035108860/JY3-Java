public class WhileDemo
{
	public static void main(String[] args){
			//int i = 1;
			//int sum = 0;
			//方法1,使用break跳转
		/*while(true){
			if(i <= 100){
				sum = sum + i;
				i++;
			}else{
				break;
			}
			
		}
		System.out.print("数字1到100的和是:"+sum);*/
		
		
		//方法2,不使用break跳转
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
		System.out.print("数字1到100的和是:"+c);
	}
}